package com.BntaAaronNazareth.Lessons.CH4_Object_Oriented_Programming_1.Week2_Friday;

public class Person {
    // Fields for object, which will belong to whatever instance of the class you create
    private String name;
    private int age;
    private SkinColor skinColor;

    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", skinColor=" + skinColor +
                '}';
    }
}
