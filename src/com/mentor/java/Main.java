package com.mentor.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Считываем данные и записываем в переменную
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два и операцию по типу (2 + 3): ");
        String number = in.nextLine();

        //Убераем все пробелы и создаем строку в которой будут храниться введеные данные с оператором
        //И массив с двумя введеными числами
        String numberOnly = "";
        for (String str : number.split(" ")) {
            numberOnly += str;
        }
        String[] strings = numberOnly.split("[*+-/]");

        //Проверка через регулярное выражение на содержание чисел или римский цифр
        if ((numberOnly.matches(".*(I|V|X|-|\\+|\\*|/).*") && !numberOnly.matches(".*([0-9]+).*"))) {
            System.out.println(MathRim.mathRim(strings,numberOnly));
        } else if ((numberOnly.matches(".*([0-9]+|-|\\+|\\*|/).*") && !(numberOnly.matches(".*(I|V|X).*")))) {
            System.out.println(MathArab.mathArab(strings, numberOnly));
        } else {
            throw new ArithmeticException();
        }
    }
}


