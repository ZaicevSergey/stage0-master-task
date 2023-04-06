package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int ones = number % 10;
        int tens = (number / 10) % 10;
        int hundreds = (number / 100) % 10;
        int reversed = ones * 100 + tens * 10 + hundreds;
        System.out.println(reversed);
    }

}
