package com.fistkim.designpatternjava.creation.factory;

public class MotelRoomGroupFactory implements RoomGroupFactory{

    @Override
    public RoomGroup createRoomGroup() {
        return new MotelRoomGroup();
    }

}
