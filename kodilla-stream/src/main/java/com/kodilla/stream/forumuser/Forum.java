package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> theForumUser = new ArrayList<>();

    LocalDate dateBirthAdam = LocalDate.of(2007, Month.FEBRUARY, 11);
    LocalDate dateBirthMaria = LocalDate.of(1995, Month.MARCH, 11);
    LocalDate dateBirthJulia = LocalDate.of(2005, Month.FEBRUARY, 11);
    LocalDate dateBirthKamil = LocalDate.of(1977, Month.APRIL, 11);
    LocalDate dateBirthArtur = LocalDate.of(1990, Month.FEBRUARY, 11);
    LocalDate dateBirthPiotr = LocalDate.of(1980, Month.JUNE, 11);

    public Forum() {
        theForumUser.add(new ForumUser(1, "Adam", 'M', dateBirthAdam, 5));
        theForumUser.add(new ForumUser(2, "Maria", 'F', dateBirthMaria, 4));
        theForumUser.add(new ForumUser(3, "Julia", 'F', dateBirthJulia, 8));
        theForumUser.add(new ForumUser(4, "Kamil", 'M', dateBirthKamil, 79));
        theForumUser.add(new ForumUser(5, "Artur", 'M', dateBirthArtur, 6));
        theForumUser.add(new ForumUser(6, "Piotr", 'M', dateBirthPiotr, 57));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumUser);
    }
}
