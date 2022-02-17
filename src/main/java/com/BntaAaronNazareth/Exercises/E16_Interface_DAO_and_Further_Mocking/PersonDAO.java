package com.BntaAaronNazareth.Exercises.E16_Interface_DAO_and_Further_Mocking;

import java.util.List;

public interface PersonDAO {    // Creates an interface with methods that can have various implementations
    void savePerson(Person person);
    void deletePerson(int id);
    List<Person> getPeople();
    Person getPersonById(int id);
}
