
package com.example;

public class Palindrome {

    public static boolean isPalindrome(String str) {
        if (str == null) {
            throw new IllegalArgumentException(
                "String cannot be null"
            );
        }

        String text = str.replaceAll("\\s+", "")
                         .toLowerCase();

        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "madam";

        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }
}
