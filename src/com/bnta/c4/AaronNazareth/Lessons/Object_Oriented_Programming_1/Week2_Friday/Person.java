package com.bnta.c4.AaronNazareth.Lessons.Object_Oriented_Programming_1.Week2_Friday;

public class Person {
    // Constructor used to set up initial values for object
    private String name;
    private int age; // This is the age
    private SkinColor skinColor;

    // Setter - used to set a particular property value
    public void setName(String name) {
        this.name = name;
    }
    // Getter - used to get a particular property value
    public String getName() {
        return name;
    }

    // Setter
    public void setAge(int age) {
        this.age = age;
    }
    // Getter
    public int getAge() {
        return age;
    }

    // Setter
    public void setSkinColor(SkinColor skinColor) {
        this.skinColor = skinColor;
    }
    // Getter
    public SkinColor getSkinColor() {
        return skinColor;
    }
}
