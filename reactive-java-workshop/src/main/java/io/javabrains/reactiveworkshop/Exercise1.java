package io.javabrains.reactiveworkshop;

import java.util.stream.Stream;

public class Exercise1 {

    public static void main(String[] args) {

        // Use StreamSources.intNumbersStream() and StreamSources.userStream()


        Stream<Integer> integerStream = StreamSources.intNumbersStream();
        // Print all numbers in the intNumbersStream stream
        // TODO: Write code here
        StreamSources.intNumbersStream()
                .forEach(i -> System.out.println(i));

        System.out.println("------------------------------");


        // Print numbers from intNumbersStream that are less than 5
        // TODO: Write code here

        StreamSources.intNumbersStream()
                .filter(i -> i < 5)
                .forEach(System.out::println);

        System.out.println("------------------------------");

        // Print the second and third numbers in intNumbersStream that's greater than 5
        // TODO: Write code here
        StreamSources.intNumbersStream()
                .filter(i -> i > 5)
                .skip(1)
                .limit(2)
                .forEach(System.out::println);


        System.out.println("------------------------------");
        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1
        // TODO: Write code here
        Integer number = StreamSources.intNumbersStream()
                .filter(i -> i > 5)
                .findFirst()
                .orElse(-1);
        System.out.println(number);

        System.out.println("------------------------------");
        // Print first names of all users in userStream
        // TODO: Write code here
        StreamSources.userStream()
                .map(user -> user.getFirstName())
                .forEach(System.out::println);

        System.out.println("------------------------------");
        // Print first names in userStream for users that have IDs from number stream
        // TODO: Write code here
        StreamSources.userStream()
                .filter(user -> StreamSources.intNumbersStream().anyMatch(i -> i == user.getId()))
                .map(user -> user.getFirstName())
                .forEach(System.out::println);

    }

}
