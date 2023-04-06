package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            // print spaces
            for (int j = 0; j < cathetusLength - i; j++) {
                System.out.print(" ");
            }
            // print digits in ascending order
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // print digits in descending order
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            // print newline
            System.out.println();
        }

    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
