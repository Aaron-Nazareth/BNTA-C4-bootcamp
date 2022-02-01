package com.bnta.c4.AaronNazareth.Lessons.Object_Oriented_Programming_1.Week2_Friday;

public class PersonMain {
    public static void main(String[] args) {
        Person aaron = new Person();    // Uses Person class to create a new Person object
        aaron.setName("Aaron");     // Invokes setter from class and applies "Aaron" as name
        aaron.setAge(23);       // Invokes setter from class and applies "23" as age
        aaron.setSkinColor(SkinColor.BROWN);    // Invokes setter from class and applies "BROWN" as age
        System.out.println(aaron.getName());    // Invokes getter from class and returns name, then prints
        System.out.println(aaron.getAge());     // Invokes getter from class and returns age, then prints
        System.out.println(aaron.getSkinColor());   // Invokes getter from class and returns skin colour, then prints

        Person otherPerson = new Person();
        otherPerson.setName("Random");
        otherPerson.setAge(25);
        otherPerson.setSkinColor(SkinColor.BLACK);
        System.out.println(otherPerson.getName());
        System.out.println(otherPerson.getAge());
        System.out.println(otherPerson.getSkinColor());
    }
}
