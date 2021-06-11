
package com.company;

import java.util.Random;
import java.util.Scanner;

public class Task11_13 {
    public static void main(String[] args) {
        int N = 10;
        int[] mas = new int[N];
        Random rnd = new Random();
        int digit;
        for (int i = 0; i < 10; i++) {

            mas[i] = rnd.nextInt(100);
        }

        System.out.println("Введите индекс: " );
        Scanner input = new Scanner(System.in);
        digit = input.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.print(mas[i] + " ");

        }

        System.out.println("\n"+ mas[digit]);
    }
}