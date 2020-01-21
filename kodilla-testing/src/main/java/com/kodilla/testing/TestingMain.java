package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.collection.OddNumbersExterminator;
import com.kodilla.testing.forum.statistics.StatisticsCounter;
import com.kodilla.testing.user.SimpleUser;

import java.util.ArrayList;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }


        Calculator calculator = new Calculator();
        int addResult = calculator.add(5, 5);
        int subtractResult = calculator.subtract(10, 8);

        if (addResult == 10) {
            System.out.println("correct adding result");
        } else {
            System.out.println("Error!");
        }

        if (subtractResult == 2) {
            System.out.println("correct subtracting result");
        } else {
            System.out.println("Error!");
        }

        OddNumbersExterminator odd = new OddNumbersExterminator();
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        ArrayList array = odd.exterminate(list);
        System.out.println(list);
        System.out.println(array);

    }
}