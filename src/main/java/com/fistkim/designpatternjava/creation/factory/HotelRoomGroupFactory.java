package com.fistkim.designpatternjava.creation.factory;

public class HotelRoomGroupFactory implements RoomGroupFactory {

    @Override
    public RoomGroup createRoomGroup() {
        return new HotelRoomGroup(5);
    }

}
