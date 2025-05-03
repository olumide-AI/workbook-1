package com.ltca.week03.day05;

public class Pet {
    String name;
    String type;
    int age;
    boolean hasFur;

    public Pet(String name, String type, int age, boolean hasFur) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hasFur = hasFur;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }
    public boolean hasFur() { return hasFur; }
}
