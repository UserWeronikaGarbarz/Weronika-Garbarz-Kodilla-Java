package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;

import java.lang.String;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDate twentyYearsAgo = localDate.minusYears(20);
        Forum forum = new Forum();
        Map<Integer, ForumUser> theResultMapOfUsers = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getDateOfBirth().isBefore(twentyYearsAgo))
                .filter(forumUser -> forumUser.getQuantityOfPosts() > 1)
                .collect(Collectors.toMap(ForumUser::getSignature, forum1 -> forum1));

        System.out.println("# elements: " + theResultMapOfUsers.size());
        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + "; " + entry.getValue()).forEach(System.out::println);
    }
}
