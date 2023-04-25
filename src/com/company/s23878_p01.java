package com.company;

import java.util.Scanner;

public class s23878_p01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int val1, val2;
        char op;

        while (true) {
            System.out.print("Podaj pierwsza liczbe: ");
            val1 = scanner.nextInt();
            if (val1 == 0) {
                break;
            }

            System.out.print("Podaj druga liczbe: ");
            val2 = scanner.nextInt();
            if (val2 == 0) {
                break;
            }

            System.out.print("Podaj operacje (+,-,*,/): ");
            op = scanner.next().charAt(0);

            int result;
            switch (op) {
                case '+':
                    result = val1 + val2;
                    break;
                case '-':
                    result = val1 - val2;
                    break;
                case '*':
                    result = val1 * val2;
                    break;
                case '/':
                    result = val1 / val2;
                    break;
                default:
                    System.out.println("Nieznana operacja!");
                    continue;
            }

            String val1Binary = Integer.toBinaryString(val1);
            String val2Binary = Integer.toBinaryString(val2);
            String resultBinary = Integer.toBinaryString(result);

            System.out.println(val1Binary + " " + op + " " + val2Binary + " = " + resultBinary);
        }
    }
}