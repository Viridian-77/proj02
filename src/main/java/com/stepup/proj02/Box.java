package com.stepup.proj02;

public class Box {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Box() {
        this(1);
    }
    public Box(int size) {
        this.size = size;
    }
}
