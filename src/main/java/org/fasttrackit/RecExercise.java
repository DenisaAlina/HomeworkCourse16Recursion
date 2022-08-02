package org.fasttrackit;

public class RecExercise {

    public static int sumOfFirstNIntegerNumbers(Integer n) {
        return sumOfFirstNIntegerNumbers(n, 1);
    }

    private static int sumOfFirstNIntegerNumbers(Integer n, Integer i) {
        if (n == i) {
            return n;
        }
        return i + sumOfFirstNIntegerNumbers(n, i + 1);

    }

    public static int sumOfFirstNEvenIntegers(Integer n) {

        if (n == 1) {
            return 2;
        }
        return 2 * n + sumOfFirstNEvenIntegers(n - 1);
    }

    public static int sumOfFirstNEvenIntegerNumbers(Integer n) {
        return sumOfFirstNEvenIntegerNumbers(2 * n, 2);
    }

    private static int sumOfFirstNEvenIntegerNumbers(Integer n, Integer i) {
        if (n == i) {
            return n;
        }
        return i + sumOfFirstNEvenIntegerNumbers(n, i + 2);

    }


    public static boolean checkIfPalindrome(String word) {
        if (word.equals(reverse1(word))) {
            return true;
        }
        return false;
    }

    private static String reverse1(String str) {
        if ((null == str) || (str.length() <= 1)) {
            return str;
        }
        return reverse1(str.substring(1)) + str.charAt(0);
    }

    public static boolean isPalindrome(String word, int i) {
        if (i > word.length() / 2) {
            return true;
        }
        return word.charAt(i) == word.charAt(word.length() - i - 1) && isPalindrome(word, i + 1);
    }


    public static int sumOfDigitsForANumber(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumOfDigitsForANumber(n / 10);
    }

    public static int fibonacciArray(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }
        return fibonacciArray(n - 1) + fibonacciArray(n - 2);
    }
}
