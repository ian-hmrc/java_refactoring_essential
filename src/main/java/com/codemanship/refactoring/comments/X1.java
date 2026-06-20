package com.codemanship.refactoring.comments;

public class X1 {

    static int sumOfSquares(int lowerBound, int upperBound) {
        int sumOfSquares = 0;

        for (int i = lowerBound; i <= upperBound; i++) {
            sumOfSquares += squareOfNumber(i);
        }

        return sumOfSquares;
    }

    static int squareOfNumber(int k) {
        return k * k;
    }
}
