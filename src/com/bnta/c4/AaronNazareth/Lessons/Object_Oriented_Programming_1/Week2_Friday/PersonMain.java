package com.bnta.c4.AaronNazareth.Lessons.Object_Oriented_Programming_1.Week2_Friday;

public class PersonMain {
    public static void main(String[] args) {
        Person aaron = new Person();
        aaron.setName("Aaron");
        aaron.setAge(23);
        aaron.setSkinColor(SkinColor.BROWN);
        System.out.println(aaron.getName());
        System.out.println(aaron.getAge());
        System.out.println(aaron.getSkinColor());

        Person otherPerson = new Person();
        otherPerson.setName("Random");
        otherPerson.setAge(25);
        otherPerson.setSkinColor(SkinColor.BLACK);
        System.out.println(otherPerson.getName());
        System.out.println(otherPerson.getAge());
        System.out.println(otherPerson.getSkinColor());
    }
}
