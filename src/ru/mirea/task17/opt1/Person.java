package ru.mirea.task17.opt1;

public enum Person {
    PERSON1("Aziz"), PERSON2("Hidjab"), PERSON3("Mahamat");
    private String name;

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}