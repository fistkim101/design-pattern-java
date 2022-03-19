package com.fistkim.designpatternjava.creation.singleton;

// 멀티스레드 상황에서 안전하지 않은 경우의 코드
public class FistkimSetting {

    private static FistkimSetting setting;

    private FistkimSetting() {
    }

    public static FistkimSetting getInstance() {
        if (setting == null) {
            return new FistkimSetting();
        }

        return setting;
    }

}
