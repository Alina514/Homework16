package org.fasttrackit.lambda;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class PersonService {

    public static String getAllPersonNames(List<Person> persons) {
        return persons.stream()
                .map(person -> person.firstName() + " " + person.lastName())
                .collect(Collectors.joining(", "));
    }

    public static String getAllMajorPerson(List<Person> persons) {
        return persons.stream()
                .filter(person -> person.age() > 18)
                .toList().toString();
    }

    public static String getPersonByCity(List<Person> persons) {
        return persons.stream()
                .filter(person -> Objects.equals(person.city(), "Oradea"))
                .toList().toString();
    }

    public static String firstNameCapital(List<Person> persons) {
        return persons.stream()
                .map(person -> person.firstName().toUpperCase())
                .toList().toString();
    }

    public static String lastNameCapitalLetter(List<Person> persons) {
        return persons.stream()
                .map(person -> person.firstName() + " " + person.lastName().charAt(0))
                .toList().toString();
    }

    public static String personsBetween18and60(List<Person> persons, int minAge, int maxAge) {
        return persons.stream()
                .filter(person -> person.getAge() > minAge && person.getAge() < maxAge)
                .toList().toString();


    }

    public static String personNameStartWith(List<Person>persons) {
        return persons.stream()
                .filter(person -> person.firstName().startsWith("A"))
                .toList().toString();
    }

    public  static Set<String> uniqueNames(List<Person> persons){
        return (Set<String>) persons.stream()
                .map(Person::firstName)
                .collect(Collectors.toSet());
    }

    public static String sortNameByFirstName(List<Person> persons){
        return persons.stream()
                .sorted(Comparator.comparing(Person::firstName))
                .toList().toString();
    }

    public static String sortNameByLastName(List<Person> persons){
        return persons.stream()
                .sorted(Comparator.comparing(Person::lastName))
                .toList().toString();
    }

    public static String sortNameByAll(List<Person> persons) {
        return persons.stream()
                .sorted(Comparator
                        .comparing(Person::firstName)
                        .thenComparing(Person::lastName)
                        .thenComparingInt(Person::age))
                .toList().toString();
    }
}



