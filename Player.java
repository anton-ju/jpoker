package com.company;

/**
 * Created by user on 02.07.2017.
 */
public class Player {
    protected int stack;
    protected String name;



    public Player(String name, int stack) {
        this.stack = stack;
        this.name = name;
    }

    public int getStack() {
        return stack;
    }

    public void setStack(int stack) {
        this.stack = stack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player{" +
               ", stack=" + stack +
                ", name='" + name + '\'' +
                '}';
    }
}

