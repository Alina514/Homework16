import org.fasttrackit.lambda.Person;
import org.fasttrackit.lambda.PersonService;
import org.junit.Test;

import java.util.List;

public class personServiceTesting {

    @Test
    public void testGetAllPersonNames() {
        List<Person> persons = List.of(
                new Person("Mihai", "Popescu", 22, "Oradea"),
                new Person("Ana", "Grigorescu", 44, "Timisoara"),
                new Person("Ioana", "Topor", 25, "Bucuresti")
        );

        String expectedNames = "Mihai Popescu, Ana Grigorescu, Ioana Topor, John Doe";
        String actualNames = PersonService.getAllPersonNames(persons);

    }

@Test
    public void testGetAllPersonNameByMajor(){
        List<Person>persons = List.of(
                new Person("Mihai", "Popescu", 22, "Oradea"),
                new Person("Ana", "Grigorescu", 44, "Timisoara"),
                new Person("Ioana", "Topor", 25, "Bucuresti")

        );
        String expectedNames1 = "Ana Grigorescu ,  Ioana Topor";
        String actualNames1 = PersonService.getAllMajorPerson(persons);

    }

 @Test
    public void testGetAllPersonFromOradea(){
        List<Person>persons = List.of(
                new Person("Mihai", "Popescu", 22, "Oradea"),
                new Person("Ana", "Grigorescu", 44, "Timisoara"),
                new Person("Ioana", "Topor", 25, "Bucuresti")
        );
        String expectedNames2 = "Mihai Popescu";
        String actualNames2 = PersonService.getPersonByCity(persons);
    }

    @Test
    public void testFirstLetterCapitalised(){
        List<Person>persons = List.of(
                new Person("Mihai", "Popescu", 22, "Oradea"),
                new Person("Ana", "Grigorescu", 44, "Timisoara"),
                new Person("Ioana", "Topor", 25, "Bucuresti")

        );
        String expectedName3 = "MIHAI, ANA, IOANA";
        String actualNames3 = PersonService.firstNameCapital(persons);
    }

    @Test
    public void testFirstNameAndCapitalLetter(){
        List<Person>persons = List.of(
                new Person("Mihai", "Popescu", 22, "Oradea"),
                new Person("Ana", "Grigorescu", 44, "Timisoara"),
                new Person("Ioana", "Topor", 25, "Bucuresti")
        );
        String expectedNames4 = "Mihai P, Ana G, Ioana T";
        String actualNames4 = PersonService.lastNameCapitalLetter(persons);
    }

    @Test
    public void testGetPersonsWithAgeBetween18and60(){
        List<Person>persons = List.of(
                new Person("Mihai", "Popescu", 22, "Oradea"),
                new Person("Ana", "Grigorescu", 44, "Timisoara"),
                new Person("Ioana", "Topor", 25, "Bucuresti")
        );
        String extpectedNames5 = "Mihai Popescu, Ana Grigorescu, Ioana Topor";
        String actualNames5 = PersonService.personsBetween18and60(persons, 18, 60);
    }

    @Test
    public void testPersonNameStartingWithA(){
        List<Person>persons = List.of(
                new Person("Mihai", "Popescu", 22, "Oradea"),
                new Person("Ana", "Grigorescu", 44, "Timisoara"),
                new Person("Ioana", "Topor", 25, "Bucuresti")
        );
        String expectedNames6 = "Ana Grigorescu";
        String actualNames6 = PersonService.personNameStartWith(persons);
    }

    @Test
    public void testPersonNameUnique(){
        List<Person>persons = List.of(
                new Person("Mihai", "Popescu", 22, "Oradea"),
                new Person("Ana", "Grigorescu", 44, "Timisoara"),
                new Person("Ioana", "Topor", 25, "Bucuresti")
        );
        String extectedName7 = "Mihai, Ana, Ioana";
        String actualNames7 = PersonService.uniqueNames(persons).toString();
    }

    @Test
    public void testSortedPersonByFirstName(){
        List<Person>persons = List.of(
                new Person("Mihai", "Popescu", 22, "Oradea"),
                new Person("Ana", "Grigorescu", 44, "Timisoara"),
                new Person("Ioana", "Topor", 25, "Bucuresti")
        );
        String exepectedNames8 = "Mihai, Ana, Ioana";
        String actualNames8 =PersonService.sortNameByFirstName(persons);
    }

    @Test
    public void testSortedPersonByLastName(){
        List<Person>persons = List.of(
                new Person("Mihai", "Popescu", 22, "Oradea"),
                new Person("Ana", "Grigorescu", 44, "Timisoara"),
                new Person("Ioana", "Topor", 25, "Bucuresti")
        );
        String exepectedNames9 = "Popescu, Grigorescu, Topor";
        String actualNames9 =PersonService.sortNameByLastName(persons);
    }

    @Test
    public void testSortedPersonByNameAndAge(){
        List<Person>persons = List.of(
                new Person("Mihai", "Popescu", 22, "Oradea"),
                new Person("Ana", "Grigorescu", 44, "Timisoara"),
                new Person("Ioana", "Topor", 25, "Bucuresti")
        );
        String exepectedNames10 = " Mihai Popescu, 22, Ana Grigorescu, 44, Ioana Topor, 25";
        String actualNames10 =PersonService.sortNameByAll(persons);
    }
}
