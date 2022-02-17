package com.BntaAaronNazareth.Exercises.E16_Interface_DAO_and_Further_Mocking;

import java.util.List;
import java.util.Optional;

public class PersonService {
    private final PersonDAO personDAO;  // Accepts interface so that we can pass this service through any
    // implementation of it

    public PersonService(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    public void savePerson(Person person) {
        if (person.getAge() == null ||
            person.getId() == null ||
            person.getName().length() == 0) {
            throw new IllegalStateException("Person cannot have empty fields");
        }

        boolean exists = doesPersonWithIdExist(person.getId());

        if (exists) {
            throw new IllegalStateException("Person with id " + person.getId() + " already exists");
        }

        personDAO.savePerson(person);
    }

    public void deletePerson(int id) {
        boolean exists = doesPersonWithIdExist(id);
        if (!exists) {
            throw new IllegalStateException("person with id " + id + " not found");
        }
        personDAO.deletePerson(id);
    }


    public List<Person> getPeople() {
        return personDAO.getPeople();
    }

    public Optional<Person> getPersonById(int id) {
        return personDAO
                .getPeople()
                .stream()
                .filter(person -> person.getId().equals(id))
                .findFirst();
    }

    private boolean doesPersonWithIdExist(Integer id) {
        return personDAO
                .getPeople()
                .stream()
                .anyMatch(p -> p.getId().equals(id));
    }
}
