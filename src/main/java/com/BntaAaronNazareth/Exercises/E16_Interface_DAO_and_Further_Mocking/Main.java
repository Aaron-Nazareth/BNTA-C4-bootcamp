package com.BntaAaronNazareth.Exercises.E16_Interface_DAO_and_Further_Mocking;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PersonDAO listFormat = new PersonListDataAccessService();    // Implements the interface so it can be used by
        // service class - despite the interface being a field of the service class, it requires implementation
        // before use
        PersonService personService = new PersonService(listFormat);

        Person aaron = new Person(1, "Aaron", 23);
        Person salah = new Person(2, "Mohammed Salah", 28);
        Person mane = new Person(3, "Sadio Mane", 27);
        Person jota = new Person(4, "Diogo Jota", 24);

        //List<Person> people = new ArrayList<>();
        personService.savePerson(aaron);
        personService.savePerson(salah);
        personService.savePerson(mane);
        personService.savePerson(jota);
        System.out.println(personService.getPeople());
        System.out.println(personService.getPersonById(2));
        personService.deletePerson(3);
        System.out.println(personService.getPeople());
    }
}
