package ru.mirea.lab6.ex3;

public class Car implements Nameable{
    private String name;
    public Car(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
