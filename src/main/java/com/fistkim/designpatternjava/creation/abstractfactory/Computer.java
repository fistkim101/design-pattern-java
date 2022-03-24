package com.fistkim.designpatternjava.creation.abstractfactory;

public class Computer {

    KeyBoard keyBoard;

    Mouse mouse;

    public void setKeyBoard(KeyBoard keyBoard) {
        this.keyBoard = keyBoard;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

}
