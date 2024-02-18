package org.example.inputDataHolders;

import org.example.service.CountService;

import java.util.Scanner;

public class CountHolder extends CountService {
    private static final CountHolder countHolder = new CountHolder();
    public static void returnExpressionResult(){
        System.out.print("INSERT EXPRESSION: ");
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();

        System.out.println("RESULT: " + countHolder.count(expression));
    }
}
