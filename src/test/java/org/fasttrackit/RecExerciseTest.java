package org.fasttrackit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class RecExerciseTest {

    @Test
    public void testSumOfFirstNIntegerNumbers() {

        //GIVEN
        Integer n = 6;

        //WHEN
        Integer result = RecExercise.sumOfFirstNIntegerNumbers(n);

        //THEN
        Assertions.assertThat(result).isEqualTo(21);
    }

    @Test
    public void testSumOfFirstNEvenIntegers() {

        //GIVEN
        Integer n = 5;

        //WHEN
        Integer result = RecExercise.sumOfFirstNEvenIntegers(n);

        //THEN
        Assertions.assertThat(result).isEqualTo(30);
    }

    @Test
    public void testSumOfFirstNEvenIntegerNumbers() {

        //GIVEN
        Integer n = 5;

        //WHEN
        Integer result = RecExercise.sumOfFirstNEvenIntegerNumbers(n);

        //THEN
        Assertions.assertThat(result).isEqualTo(30);
    }

    @Test
    public void testCheckIfPalindrome() {

        //GIVEN
        String word = "madam";

        //WHEN
        Boolean result = RecExercise.checkIfPalindrome(word);

        //THEN
        Assertions.assertThat(result).isEqualTo(true);
    }

    @Test
    public void testisPalindrome() {

        //GIVEN
        String word = "madam";

        //WHEN
        Boolean result = RecExercise.isPalindrome(word, 0);

        //THEN
        Assertions.assertThat(result).isEqualTo(true);
    }

    @Test
    public void testSumOfDigitsForANumber() {

        //GIVEN
        Integer n = 3415;

        //WHEN
        Integer result = RecExercise.sumOfDigitsForANumber(n);

        //THEN
        Assertions.assertThat(result).isEqualTo(13);
    }


    @Test
    public void testFibonacciArray() {

        //GIVEN
        Integer n = 8;

        //WHEN
        Integer result = RecExercise.fibonacciArray(n);

        //THEN
        Assertions.assertThat(result).isEqualTo(13);
    }

}
