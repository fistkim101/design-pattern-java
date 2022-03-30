package com.fistkim.designpatternjava.practice.creation.singleton;

public class T1Setting {

    public T1Setting() {
    }

    private static class SettingHolder {
        private static final T1Setting t1Setting = new T1Setting();
    }

    public static T1Setting getSetting() {
        return SettingHolder.t1Setting;
    }

}
