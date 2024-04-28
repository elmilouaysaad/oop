package user;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonCollection {
    private List<Person> persons;

    public PersonCollection() {
        persons = new ArrayList<>();
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public void removePerson(Person person) {
        persons.remove(person);
    }

    public void displayPersons() {
        Collections.sort(persons, Comparator.comparing(Person::getName));
        for (Person person : persons) {
            person.displayInformation();
        }
    }
}
