package org.example.HW13;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainHW13 {
    public static void main(String[] args) {

        Stream<Users> usersStream = Stream.generate(Users::generateUser);

        usersStream.limit(20)
                // старші за 18
                .filter(user -> user.getAge() > 18)
                //сотрутвання по імені
                .sorted((user1, user2) -> user1.getName().compareTo(user2.getName()))
                //без мейла
                .filter(user -> user.getEmail() != null && !user.getEmail().isEmpty())
                //сгрупувати об'єкти по гендеру
                .collect(Collectors.groupingBy(Users::getGender, Collectors.mapping(Users::getName, Collectors.toList())))
                .forEach((gender, userList) -> System.out.println(gender + "=" + userList));
    }
}
