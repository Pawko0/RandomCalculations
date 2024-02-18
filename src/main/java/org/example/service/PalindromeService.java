package org.example.service;

public class PalindromeService implements PalindromeInterface{

    @Override
    public boolean checkIfPalindrome(String s) {
        s = s.toLowerCase().replaceAll(" ",  "");
        int n = s.length();

        for (int i=0; i<n/2; i++) {
            if (s.charAt(i) != s.charAt(n-i-1)) return false;
        }

        return true;
    }
}
