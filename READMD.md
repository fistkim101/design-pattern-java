# 디자인 패턴 백기선님 강의 노트

## 객체 생성과 관련된 패턴(creational pattern)

#### 싱글톤 패턴

> 시스템 런타임, 환경 세팅에 대한 정보 등, 인스턴스가 여러개 일 때 문제가 생길 수 있는 경우가 있다. 인스턴스를 오직 한개만 만들어 제공하는 클래스가 필요하다.

보통 싱글턴 패턴은 사용되는 곳이 많지만 그때마다 매번 생성해서 쓰는 것이 비효율적일때 하나만 만들어두고 이를 재활용 해서 쓸 수 있도록 복수의 생성을 강제로 막는 패턴으로 인식하고 있었는데, 강의를 듣다보니 내가
생각했던 싱글톤 패턴의 이점인 '효율'은 좀 부차적인 것 같다는 생각이 들었다.

강의에서는 두 개 이상이 생기면 '안될 때' 싱글톤 패턴을 사용한다고 싱글톤 패턴의 목적을 소개하고 있었는데, 그 목적이 조금 더 납득이 갔다. 스프링에서만 보아도 configuration 과 같은 것들은
@ConditionalOnMissingBean 과 같은 조건으로 먼저 Bean 으로 생성이 되어있는지 여부가 중요할 때가 있는데 이런 경우를 생각해보면 싱글톤 패턴의 목적 및 효용을 잘 느낄 수 있다.

먼저 멀티스레드에 무방비한 싱글톤 패턴은 아래와 같다.
```java
public class FistkimSetting {

    private static FistkimSetting setting;

    private FistkimSetting() {
    }

    public static FistkimSetting getInstance() {
        if (setting == null) { // 여기서 두개의 스레드가 동시에 setting == null 판정을 보고 들어오면 결국 두 스레드가 모두 new를 처리하게 된다.
            return new FistkimSetting();
        }

        return setting;
    }

}
```

<br>

이를 보완하려면 synchronized 를 사용할 수 있는데, 이를 이용할 경우 멀티스레드 상에서의 취약점은 보완이 된다.
하지만 synchronized 를 위한 매커니즘을 위해서 생성을 하는 당시에 성능 저하를 불러올 수 있고 한다.

본래 싱글톤 패턴의 목적자체가 'n 번의 생성 시도에도 1개의 유일 객체만 생성이 되도록'하는 것이라는 것을 감안해보면
결과론적으로 1개의 유일 객체를 보장한다곤 하지만 n번 시도를 할 때마다 synchronized 의 매커니즘을 보장하기 위한 성능상의 비용이 있기 때문이다.
```java
public class FistkimSetting {

    private static FistkimSetting setting;

    private FistkimSetting() {
    }

    // 특정 key 를 갖고 있는 스레드만 해당 메소드에 접근을 허용하고 나머지는 접근하지 못하도록 함으로써
    // 기존에 멀티 스레드에 취약했던점을 보완한 코드다. 메소드에 하나의 스레드만 접근이 가능하기 때문에
    // setting == null 판정에 대해서 하나의 스레드만 먼저 판단하게 되고 객체가 생성이 된 이후 다음 스레드는
    // != null 이라 판단할 것이기 때문에 객체가 하나만 생기는 것을 보장할 수 있다.
    public static synchronized FistkimSetting getInstance() {
        if (setting == null) {
            return new FistkimSetting();
        }

        return setting;
    }

}
```

<br>

아래 코드는 eager initialization(이른 초기화)을 통해서 [클래스로딩](https://engkimbs.tistory.com/606) 단계에서 바로 객체를 생성해버리는 코드이다.
이런 방식은 멀티스레드 환경에서도 유일객체를 보장할 수 있다. 왜냐하면 기본 생성자가 객체를 생성하지 못하도록 만들었기 때문에 getInstance() 를 통해서
이미 만들어진 유일 객체의 참조만 가능하기 때문이다.

하지만 이 방식의 문제점은 해당 객체를 사용하지 않을 경우 쓸데없이 메모리 공간을 차지하고 있게 되고 생성 당시에도 생성 비용이 든다는 점이다.
synchronized 코드의 경우 사실 코드를 저렇게 만들어 두어도 생성시도를 하지 않으면 비용이 들지 않는데, 이번 코드의 경우 바로 생성부터 해놓기 때문에
사용하지 않는다면 그 비용이 의미가 없어진다.
```java
public class FistkimSetting {

    private static final FistkimSetting SETTING = new FistkimSetting();

    private FistkimSetting() {
    }

    public static FistkimSetting getInstance() {
        return SETTING;
    }

}
```

<br>

강의에서는 eager initialization 을 사용 했을 때의 단점을 보완하는 방법을 소개하고 있었다. 즉, 클래스로딩 당시에 바로 생성 비용을 지불하지 않고 
생성 시도를 했을 때에만 생성 비용을 치르되 멀티스레드 환경에서는 유일 객체를 보장하는 방법이다. static inner 클래스를 사용하는 방식인데, 검색을 좀 해보니
[LAZY HOLDER](https://blog.javarouka.me/2018/11/20/no-instance/) 라는 패턴이었다.

이는 클래스로더가 최초로 특정 클래스를 로드 할때 해당 클래스의 static 필드들에 대해서는 바로 initialization을 하지만
inner class의 경우 바로 initialization되지 않는 것을 이용한 방법이다.
```java
public class FistkimSetting {

    private FistkimSetting() {
    }

    private static class SettingHolder {
        private static final FistkimSetting SETTING = new FistkimSetting();
    }

    public static FistkimSetting getInstance() {
        return SettingHolder.SETTING;
    }

}
```

위와 같은 방식으로 사용할 경우 FistkimSetting은 가지고 있는 static 필드가 없어서 클래스로드 당시에 아무것도 initialization 되지 않고,
SettingHolder 클래스 역시 inner class 이므로 static 이라 해도 initialization 가 되지 않는다. getInstance()가 호출 되었을때 비로소
SettingHolder 가 클래스로드되며 new FistkimSetting();가 실행되며 객체가 생성된다.

이후 getInstance()을 호출하면 SettingHolder가 가진 필드인 SETTING 의 참조를 할 수 있게 된다.
