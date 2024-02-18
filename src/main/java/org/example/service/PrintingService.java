package org.example.service;

import org.example.inputDataHolders.CountHolder;
import org.example.inputDataHolders.PalindromeHolder;
import org.example.inputDataHolders.SmithNumberHolder;

import java.util.Scanner;
import java.util.logging.Logger;

public class PrintingService {

    public static final Logger logger = Logger.getLogger(SmithNumberHolder.class.getName());
    public static void print(){
        while (true) {
            System.out.println("1. COUNT EXPRESSION");
            System.out.println("2. CHECK IF PALINDROME");
            System.out.println("3. CHECK IF SMITH NUMBER");
            System.out.println("4. ROOTS OF SQUARE EQUATION");
            System.out.println("5. EXIT");
            System.out.print("INSERT YOUR OPTION: ");

            Scanner scanner = new Scanner(System.in);
            var scan = scanner.nextInt();
            if (scan == 5){
                System.out.println("HAVE A NICE DAY :)");
                break;
            }
            try {
                switch (scan) {
                    case 1:
                        CountHolder.returnExpressionResult();
                        break;
                    case 2:
                        PalindromeHolder.returnIfPalindrome();
                        break;
                    case 3:
                        SmithNumberHolder.returnIfSmithNumber();
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("NUMBER OUT OF RANGE INSERTED, TRY AGAIN");
                }
            } catch (NumberFormatException e){
                logger.warning(e.getMessage());
            }

        }
    }
}
