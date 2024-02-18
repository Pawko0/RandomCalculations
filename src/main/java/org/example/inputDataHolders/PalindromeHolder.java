package org.example.inputDataHolders;

import org.example.service.PalindromeService;

import java.util.Scanner;

public class PalindromeHolder extends PalindromeService{
    private static final PalindromeHolder palindromeHolder = new PalindromeHolder();
    public static void returnIfPalindrome(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("INSERT WHAT YOU WANT TO CHECK: ");
        String s = scanner.nextLine();
        boolean isPalindrome = palindromeHolder.checkIfPalindrome(s);
        if (isPalindrome){
            System.out.println("IT IS PALINDROME :)");
        } else {
            System.out.println("IT IS NOT PALINDROME :(");
        }
    }
}
