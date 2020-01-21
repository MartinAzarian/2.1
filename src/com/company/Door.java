package com.company;



public class Door implements HouseObject {
    private int quantity = 0;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Door door = (Door) o;

        return quantity == door.quantity;
    }

    @Override
    public int hashCode() {
        return quantity;
    }

    public Door() {
    }

    @Override
    public String toString() {
        return "Door{" +
                "quantity=" + quantity +
                '}';
    }

    public Door(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public void printQuantity() {
        System.out.println("door quantity is " + quantity);
    }
}
