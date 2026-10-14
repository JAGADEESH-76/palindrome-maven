
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    // Positive test cases
    @Test
    void testPalindromeMadam() {
        assertTrue(Palindrome.isPalindrome("madam"));
    }

    @Test
    void testPalindromeLevel() {
        assertTrue(Palindrome.isPalindrome("level"));
    }

    @Test
    void testPalindromeDifferentCase() {
        assertTrue(Palindrome.isPalindrome("MadAm"));
    }

    @Test
    void testPalindromeWithSpaces() {
        assertTrue(Palindrome.isPalindrome("nurses run"));
    }

    // Negative test cases
    @Test
    void testNonPalindromeHello() {
        assertFalse(Palindrome.isPalindrome("hello"));
    }

    @Test
    void testNonPalindromeJava() {
        assertFalse(Palindrome.isPalindrome("java"));
    }

    @Test
    void testNonPalindromeWorld() {
        assertFalse(Palindrome.isPalindrome("world"));
    }

    // Edge cases
    @Test
    void testEmptyString() {
        assertTrue(Palindrome.isPalindrome(""));
    }

    @Test
    void testNullString() {
        assertThrows(
            IllegalArgumentException.class,
            () -> Palindrome.isPalindrome(null)
        );
    }
}
