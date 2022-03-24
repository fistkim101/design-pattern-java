package com.fistkim.designpatternjava.creation.abstractfactory;

public class MacSupportDeviceFactory implements ComputerSupportDeviceFactory {

    @Override
    public Mouse makeMouse() {
        return new MacMouse();
    }

    @Override
    public KeyBoard makeKeyboard() {
        return new MacKeyBoard();
    }

}
