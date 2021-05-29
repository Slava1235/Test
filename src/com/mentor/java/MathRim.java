package com.mentor.java;


public class MathRim {
    public static String mathRim(String[] strings, String operator) {
        int nummber1 = 0;
        int nummber2 = 0;

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals("I")) {
                if (i == 0) {
                    nummber1 = 1;
                } else {
                    nummber2 = 1;
                }
            }
            if (strings[i].equals("II")) {
                if (i == 0) {
                    nummber1 = 2;
                } else {
                    nummber2 = 2;
                }
            }
            if (strings[i].equals("III")) {
                if (i == 0) {
                    nummber1 = 3;
                } else {
                    nummber2 = 3;
                }
            }
            if (strings[i].equals("IV")) {
                if (i == 0) {
                    nummber1 = 4;
                } else {
                    nummber2 = 4;
                }
            }
            if (strings[i].equals("V")) {
                if (i == 0) {
                    nummber1 = 5;
                } else {
                    nummber2 = 5;
                }
            }
            if (strings[i].equals("VI")) {
                if (i == 0) {
                    nummber1 = 6;
                } else {
                    nummber2 = 6;
                }
            }
            if (strings[i].equals("VII")) {
                if (i == 0) {
                    nummber1 = 7;
                } else {
                    nummber2 = 7;
                }
            }
            if (strings[i].equals("VIII")) {
                if (i == 0) {
                    nummber1 = 8;
                } else {
                    nummber2 = 8;
                }
            }
            if (strings[i].equals("IX")) {
                if (i == 0) {
                    nummber1 = 9;
                } else {
                    nummber2 = 9;
                }
            }
            if (strings[i].equals("X")) {
                if (i == 0) {
                    nummber1 = 10;
                } else {
                    nummber2 = 10;
                }
            }
        }
        //Вызываем метод для арифметических операций и конвертируем ответ
        int result = Operation.operation(nummber1, nummber2, operator);
        return ConvertNumber.ConvertNumber(result);
    }
}
