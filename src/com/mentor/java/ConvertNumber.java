package com.mentor.java;


public class ConvertNumber {
    public static String ConvertNumber(int result) {
        String romanNumber = "";

        if (result == 0) {
            return "N";
        }
        while (result >= 100) {
            romanNumber += "C";
            result -= 100;
        }
        while (result >= 90) {
            romanNumber += "XC";
            result -= 90;
        }
        while (result >= 50) {
            romanNumber += "L";
            result -= 50;
        }
        while (result >= 40) {
            romanNumber += "XL";
            result -= 40;
        }
        while (result >= 10) {
            romanNumber += "X";
            result -= 10;
        }
        while (result >= 9) {
            romanNumber += "IX";
            result -= 9;
        }
        while (result >= 5) {
            romanNumber += "V";
            result -= 5;
        }
        while (result >= 4) {
            romanNumber += "IV";
            result -= 4;
        }
        while (result >= 1) {
            romanNumber += "I";
            result -= 1;
        }

        return romanNumber.replace("IIIII", "V")
                .replace("IIII","IV")
                .replace("VV","X")
                .replace("VIV","IX")
                .replace("XXXXX","L")
                .replace("XXXX","XL")
                .replace("LL","C");
    }
}
