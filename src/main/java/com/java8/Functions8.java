package com.java8;

import com.common.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Functions8 {
    public static void main(String[] args) {

        List<Person> people =
                Arrays.asList(new Person("Tom", "Jones", 45),
                        new Person("Harry", "Major", 25),
                        new Person("Ethan", "Hardy", 65),
                        new Person("Nancy", "Smith", 15),
                        new Person("Deborah", "Sprightly", 29));

        Functions8 f8 = new Functions8();
        f8.printPeople(people);
    }

    private void printPeople(List<Person> people ) {

        Function<Person, String> personFullName = (Person p) -> p.getFirstName() + ", " + p.getLastName();
        List<String> names = people.stream().map(personFullName).collect(Collectors.toList());
        names.forEach(System.out::println);
        System.out.println("------------------");
        names = people.stream().map(p -> personFullName.apply(p)).collect(Collectors.toList());
        names.forEach(System.out::println);
        // Consumer 
        Consumer<Person> consumer = (Person p) -> System.out.println(p.getFirstName());
        people.forEach(consumer);
    }
}
