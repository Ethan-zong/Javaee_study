package com.zong.abstractClass;

public abstract class Student {
    private int id;
    private String name;

    public abstract void study();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
