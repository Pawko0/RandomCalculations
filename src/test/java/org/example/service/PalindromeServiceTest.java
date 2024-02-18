package org.example.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeServiceTest {
    @Test
    public void testingPalindromeForValidPalindrome() {
        PalindromeService palindromeService = new PalindromeService();
        assertTrue(palindromeService.checkIfPalindrome("A man a plan a canal Panama"));
        assertTrue(palindromeService.checkIfPalindrome("No lemon no melon"));
    }

    @Test
    public void testingPalindromeForInvalidPalindrome() {
        PalindromeService palindromeService = new PalindromeService();
        assertFalse(palindromeService.checkIfPalindrome("Hello World"));
        assertFalse(palindromeService.checkIfPalindrome("Not a palindrome"));
    }

    @Test
    public void testingPalindromeForEmptyString() {
        PalindromeService palindromeService = new PalindromeService();
        assertTrue(palindromeService.checkIfPalindrome(""));
    }

    @Test
    public void testingPalindromeForSingleCharacter() {
        PalindromeService palindromeService = new PalindromeService();
        assertTrue(palindromeService.checkIfPalindrome("x"));
    }

    @Test
    public void testingPalindromeForStringWithSpaces() {
        PalindromeService palindromeService = new PalindromeService();
        assertTrue(palindromeService.checkIfPalindrome("Was it a car or a cat I saw"));
    }
}
