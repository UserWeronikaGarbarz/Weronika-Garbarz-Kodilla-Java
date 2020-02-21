package com.kodilla.exception.main;

import com.kodilla.exception.test.ExceptionHandling;
import com.kodilla.exception.test.SecondChallenge;

public class ExceptionModuleRunner {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(2.0, 1.5);
        } catch (ExceptionHandling e) {
            System.out.println("Exceptiotn handled.");
        }
    }
}