package io.zipcoder.polymorphism;

import java.util.Scanner;

public class Input {
    public static String inputString(String question){
        Scanner scanner = new Scanner(System.in);
        System.out.println(question);
        String input = scanner.nextLine();
        return input;
    }

    public static Integer inputInteger(String question){
        Scanner scanner = new Scanner(System.in);
        System.out.println(question);
        Integer input = scanner.nextInt();
        return input;
    }
}
