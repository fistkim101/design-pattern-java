# 프로토타입 패턴

프로토타입 패턴은 객체를 생성할 때 base가 될 기본적인 정보가 고정되어 있는 상황이고 약간의 필드가 추가나 변경만 되어야 하는 상황이 반복될때 유용하게 쓸 수 있는 패턴이다.
특히 해당 객체의 중복되는 성격의 데이터가 DB를 조회해야 얻을 수 있다던가 통신을 거쳐야 얻을 수 있는 등 공통되는 정보를 얻기 위한 비용이 드는 경우 더욱 유용하다.

즉, 프로토타입 패턴은 다르게 말하면 "프로토타입(을 이용해서 copy하는) 패턴" 이라고 말할 수 있다.