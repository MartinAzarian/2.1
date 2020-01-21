package com.company;

public class Main {

    public static void main(String[] args) {
        Window window = new Window(5);
        Door door = new Door(2);
        House house = new House();
        house.objects.add(window);
        house.objects.add(door);
        house.printQuantityWindowsAndDoors();

    }
}
