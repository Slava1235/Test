package com.mentor.java;


public class MathArab {
    public static int mathArab(String [] strings, String operator) {
        //Из массива строк выводим два числа и проверяем их на диапозон
        int one = Integer.parseInt(strings[0]);
        int two =Integer.parseInt(strings[1]);

        if ((one < 11 && one > 0) && (two < 11 && two > 0)) {
            //Вызываем метод для арифметических операций
            int result = Operation.operation(one, two, operator);
            return result;
        } else {
            throw new ArithmeticException();
        }
    }
}

