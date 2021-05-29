package com.mentor.java;


public class Operation {
    public static int operation(int one, int two, String str) {
            for (int i = 0; i < str.length(); i++) {
                switch (str.charAt(i)) {
                    case '-':
                        return one - two;
                    case '+':
                        return one + two;
                    case '/':
                        return one / two;
                    case '*':
                        return one * two;
                    default:
                        break;
                }
            }
         throw new ArithmeticException();
    }
}
