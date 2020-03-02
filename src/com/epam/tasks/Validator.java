package com.epam.tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Validator extends Exception {
    public static void InputMismatchException() {
        System.out.print("Enter an integer: ");
        Scanner sc = new Scanner(System.in);
        try {
            int integer = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Error! Invalid integer. Try again.");
        }
    }
}