package com.fistkim.designpatternjava.creation.singleton;

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
