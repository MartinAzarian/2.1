package com.company;



public class Window implements HouseObject {
    private int quantity = 0;

    public Window() {
    }

    public Window(int quantityWindow) {
        this.quantity = quantityWindow;
    }

    public int getQuantityWindow() {
        return quantity;
    }

    public void setQuantityWindow(int quantityWindow) {
        this.quantity = quantityWindow;
    }

    @Override
    public void printQuantity() {
        System.out.println("window quantity is " + quantity);
    }

    @Override
    public String toString() {
        return "Window{" +
                "quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Window window = (Window) o;

        return quantity == window.quantity;
    }

    @Override
    public int hashCode() {
        return quantity;
    }
}
