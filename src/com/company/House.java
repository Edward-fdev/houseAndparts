package com.company;

/**
 * Created by Edwa on 11/11/2016.
 */
public class House {
    private Room room;
    private Doors doors;
    private Garage garage;

    public House(Room room, Doors doors, Garage garage) {
        this.room = room;
        this.doors = doors;
        this.garage = garage;
    }
    public House(){
        //nothing in here
    }


    public void buildHouse() {

    }
}
