package ro.jtonic.handson.java8.lambdas;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by jtonic on 09.03.2014.
 */
public class Person {
    public final String firstName;
    public final String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static int compareByFirstName(Person p1, Person p2) {
        return p1.firstName.compareTo(p2.firstName);
    }


    public static void main(String[] args) {
        Person[] persons = new Person[] {
                new Person("Antonel", "Pazargic"),
                new Person("Liviu", "Pazargic"),
                new Person("Irina", "Pazargic"),
                new Person("Viorel", "Dragoi"),
        };
        final Comparator<Person> compareByFirstName = Person::compareByFirstName;
        Arrays.sort(persons, Comparator.comparing(Person::getFirstName));
        for (Person person : persons) {
            System.out.println("person = " + person);
        }
    }
}
