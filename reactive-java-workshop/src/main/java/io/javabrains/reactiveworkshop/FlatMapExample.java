package io.javabrains.reactiveworkshop;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {

        List<User> userlist1 = new ArrayList<>();
        userlist1.add(new User(1, "Lionel", "Messi"));
        userlist1.add(new User(2, "Cristiano", "Ronaldo"));
        userlist1.add(new User(2, "Diego", "Maradona"));

        List<User> userList2 = new ArrayList<>();
        userList2.add(new User(4, "Zinedine", "Zidane"));
        userList2.add(new User(5, "Jürgen", "Klinsmann"));
        userList2.add(new User(6, "Gareth", "Bale"));

        List<List<User>> userLists = List.of(userlist1, userList2);

        List<String> collect = userLists.stream().flatMap(user -> user.stream().map(user1 -> user1.getFirstName() + " " + user1.getLastName())).collect(Collectors.toList());

        System.out.println("------------------------tttttttttttttttttttttttttttt---------------------------");
        System.out.println(collect);
    }

}
