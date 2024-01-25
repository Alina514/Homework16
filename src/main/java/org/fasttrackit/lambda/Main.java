package org.fasttrackit.lambda;
import org.fasttrackit.lambda.Person;
import org.fasttrackit.lambda.PersonService;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

import static org.fasttrackit.lambda.PersonService.*;


public class Main {
    public static void main(String[] args) {
        List<Person>  persons = Arrays.asList(
                Person.builder()
                        .firstName("Mihai")
                        .lastName("Popescu")
                        .age(16)
                        .city("Oradea")
                        .build(),
                Person.builder()
                        .firstName("Ana")
                        .lastName("Grigorescu")
                        .age(44)
                        .city("Timisoara")
                        .build(),
                Person.builder()
                        .firstName("Ioana")
                        .lastName("Topor")
                        .age(25)
                        .city("Bucuresti")
                        .build()
        );
        Stream<Person> stream = persons.stream();


        List<Person> person = List.of(
                new Person("Mihai", "Popescu", 22, "Oradea"),
                new Person("Ana", "Grigorescu", 44, "Timisoara"),
                new Person("Ioana", "Topor", 25, "Bucuresti")
        );

        String allNames = getAllPersonNames(persons);
        System.out.println("All persons names: " + allNames);


        String majorPersons = getAllMajorPerson(persons);
        System.out.println(majorPersons);

        String personCity = getPersonByCity(persons);
        System.out.println(personCity);

        String capitalizedFirstName = firstNameCapital(persons);
        System.out.println(capitalizedFirstName);

        String lastCapitalLetter = lastNameCapitalLetter(persons);
        System.out.println(lastCapitalLetter);

        String persons18and60 = personsBetween18and60(persons, 18, 60);
        System.out.println(persons18and60);

        String personName = personNameStartWith(persons);
        System.out.println(personName);

        Set<String > personUniqueNames = uniqueNames(persons);
        System.out.println(personUniqueNames);

        String personNameSorted = sortNameByFirstName(persons);
        System.out.println(personNameSorted);

        String personNameSortedByLast = sortNameByLastName(persons);
        System.out.println(personNameSorted);

        String personNameSortedByNameAndAge = sortNameByAll(persons);
        System.out.println(personNameSortedByNameAndAge);

    }

}