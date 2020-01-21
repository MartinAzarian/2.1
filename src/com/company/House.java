package com.company;

import java.util.ArrayList;

public class House {
    private boolean openHouse = true;
    ArrayList<HouseObject> objects = new ArrayList<>();

    public House(boolean openHouse, ArrayList<HouseObject> objects) {
        this.openHouse = openHouse;
        this.objects = objects;
    }

    @Override
    public String toString() {
        return "House{" +
                "openHouse=" + openHouse +
                '}';
    }

    public House() {
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        House house = (House) o;

        return openHouse == house.openHouse;
    }

    @Override
    public int hashCode() {
        return (openHouse ? 1 : 0);
    }

    public boolean lockTheHouseByKey(String key) {
        if (key.equals("close")) {
            openHouse = false;
        } else if (key.equals("open")) {
            openHouse = true;
        }
        return openHouse;
    }

    public boolean isOpenHouse() {
        return openHouse;
    }

    public void setOpenHouse(boolean openHouse) {
        this.openHouse = openHouse;
    }

    public void printQuantityWindowsAndDoors() {
        for (int i = 0; i < objects.size(); i++) {
            objects.get(i).printQuantity();
        }
    }

}
