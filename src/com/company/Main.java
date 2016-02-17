package com.company;

import java.util.Scanner;

public class Main {
    public static int SuumRecyrs(int n7) {
        if (n7 == 1) return 1;
        return SuumRecyrs(n7 - 1) + n7;
    }

    public static void main(String[] args) {


        System.out.println("Введите номер задачи");
        System.out.println("1. Посчет суммы всех цифр натурального числа.");
        System.out.println("2. 11 членов последовательности Фибоначчи.");
        System.out.println("3. Cчастливый билет.");
        System.out.println("4. Электронные часы.");
        System.out.println("5. Создание массива 8*5.");
        System.out.println("6. Создание массива 7*4 с выводом индекса.");
        System.out.println("7. Сумма чисел от 1 до n");
        //System.out.println("8.");
        //System.out.println("9.");
        //System.out.println("10. ");
        Scanner scannerS = new Scanner(System.in);
        int select = scannerS.nextInt();
        switch (select) {
            case 1:
                int i;
                Scanner scannerA = new Scanner(System.in);
                if (scannerA.hasNextLong()) {

                    long a = scannerA.nextLong();
                    long Summ = 0;
                    long SummTemp = 0;

                    for (i = 1; i < 1000000; i++) {
                        if (a / 10 != 0) {
                            SummTemp = a % 10;
                            Summ += SummTemp;
                            a /= 10;

                        } else {
                            Summ += a;
                            break;
                        }
                    }
                    System.out.println(Summ);
                }
                break;

            case 2:
                int Fn_1 = 1;
                int Fn_2 = 1;
                System.out.println(Fn_2);
                System.out.println(Fn_1);
                int Fn = 0;
                //int i;
                for (i = 0; i < 9; i++) {
                    Fn = Fn_1 + Fn_2;
                    Fn_2 = Fn_1;
                    Fn_1 = Fn;
                    System.out.println(Fn);
                }
                break;

            case 3:
                int aa = 0 ;
                int b = 0;
                int c = 0;
                int d = 0;
                int f = 0;
                int e = 0;
                int S = 0;
                for (i = 1; i < 1000000; i++) {
                    aa = i / 100000;
                    b = i / 10000 % 10;
                    c = i / 1000 % 100 % 10;
                    d = i / 100 % 1000 % 100 % 10;
                    f = i / 10 % 10000 % 1000 % 100 % 10;
                    e = i % 100000 % 10000 % 1000 % 100 % 10;
                    int s1 = aa + b + c;
                    int s2 = d + f + e;
                    if (s1 == s2) ++S;
                }
                System.out.println(S);
                break;
            case 4:
                int j;
                int a4 = 0;
                int b4 = 0;
                int c4 = 0;
                int d4 = 0;
                int S4 = 0;
                for (i = 0; i < 24; i++) {
                    for (j = 0; j < 60; j++) {
                        a4 = i / 10;
                        b4 = i % 10;
                        c4 = j / 10;
                        d4 = j % 10;
                        if (a4 == d4 & b4 == c4) ++S4;
                    }
                }
                System.out.println(S4);
                break;
            case 5:
                int[][] a5 = new int[8][5];
                for (i = 0; i < 8; i++) {
                    for (j = 0; j < 5; j++) {
                        a5[i][j] = 10 + (int) (Math.random() * (100 - 10));
                    }
                }
                for (i = 0; i < 8; i++, System.out.println()) {
                    for (j = 0; j < 5; j++) {
                        System.out.print(a5[i][j] + " ");
                    }
                }
                break;
            case 6:
                int[][] a6 = new int[7][4];
                int[] b6 = {1, 1, 1, 1, 1, 1, 1};
                int c6 = 0;
                int d6 = 0;
                for (i = 0; i < 7; i++) {
                    for (j = 0; j < 4; j++) {
                        a6[i][j] = -5 + (int) (Math.random() * (5 - (-5)));
                    }
                }
                for (i = 0; i < 7; i++, System.out.println()) {
                    for (j = 0; j < 4; j++) {
                        System.out.print(a6[i][j] + " ");

                        b6[i] *= a6[i][j];
                        if (c6 < Math.abs(b6[i])) {
                            c6 = Math.abs(b6[i]);
                            d6 = i;
                        }
                    }
                }
                System.out.println("  ");
                for (i = 0; i < 7; i++) {

                    System.out.print(b6[i] + " ");
                }
                System.out.println("  ");
                System.out.println("индекс строки с\n" +
                        "\n" +
                        "наибольшим  по модулю произведением элементов -- " + d6);
                break;
            case 7:
                Scanner scannerS7 = new Scanner(System.in);
                int S7 = scannerS.nextInt();
                int res = SuumRecyrs(S7);
                System.out.println(res);
                break;

            default:
                System.out.println("Неверный номер задачи");
                System.out.println("not null  ");


        }

    }
}
