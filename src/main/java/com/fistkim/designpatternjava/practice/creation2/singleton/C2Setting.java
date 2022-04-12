package com.fistkim.designpatternjava.practice.creation2.singleton;

public class C2Setting {

    private C2Setting() {
    }

    private static class SettingHolder {
        private static C2Setting c2Setting = new C2Setting();
    }

    public static C2Setting getInstance() {
        return SettingHolder.c2Setting;
    }

}
