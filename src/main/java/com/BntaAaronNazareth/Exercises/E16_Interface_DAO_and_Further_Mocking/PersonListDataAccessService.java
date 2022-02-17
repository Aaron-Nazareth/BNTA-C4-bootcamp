package com.BntaAaronNazareth.Exercises.E16_Interface_DAO_and_Further_Mocking;

import java.util.ArrayList;
import java.util.List;

public class PersonListDataAccessService implements PersonDAO{

    private List<Person> people;

    public PersonListDataAccessService() {
        people = new ArrayList<>();
    }

    @Override
    public void savePerson(Person person) {
        people.add(person);
    }

    @Override
    public void deletePerson(int id) {
        for (int i = 0; i < people.size(); i++) {
            Person person = people.get(i);
            if (person.getId() == id) {
                people.remove(i);
            }
        }
    }

    @Override
    public List<Person> getPeople() {
        return people;
    }

    @Override
    public Person getPersonById(int id) {
        return people.get(id);
    }
}
