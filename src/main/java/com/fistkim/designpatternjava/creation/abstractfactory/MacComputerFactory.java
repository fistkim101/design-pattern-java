package com.fistkim.designpatternjava.creation.abstractfactory;

public class MacComputerFactory implements ComputerFactory {

    ComputerSupportDeviceFactory computerSupportDeviceFactory;

    public MacComputerFactory(ComputerSupportDeviceFactory computerSupportDeviceFactory) {
        this.computerSupportDeviceFactory = computerSupportDeviceFactory;
    }

    @Override
    public Computer createComputer() {

//        Computer computer = new MacComputer();
//        computer.setMouse(new MacMouse());
//        computer.setKeyBoard(new MacKeyBoard());
//        return computer;

        Computer computer = new MacComputer();
        computer.setMouse(computerSupportDeviceFactory.makeMouse());
        computer.setKeyBoard(computerSupportDeviceFactory.makeKeyboard());
        return computer;

    }

}
