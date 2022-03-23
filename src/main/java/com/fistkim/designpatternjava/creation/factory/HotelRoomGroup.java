package com.fistkim.designpatternjava.creation.factory;

public class HotelRoomGroup extends RoomGroup {

    private int starGrade;

    public HotelRoomGroup(int starGrade) {
        this.starGrade = starGrade;
    }

    public int getStarGrade(int starGrade) {
        return this.starGrade;
    }

}
