package ru.mirea.task25;

public class Buy implements Service{
    private int price;
    private String name;

    public Buy(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}