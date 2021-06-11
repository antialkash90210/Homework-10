package com.company;

import java.util.Random;
import java.util.Scanner;

public class Task11_14 {
    public static void main(String[] args) {
        int N = 10;
        int[] mas = new int[N];
        Random rnd = new Random();

        for (int i = 0; i < N; i++) {

            mas[i] = rnd.nextInt(100);
        }

        for (int i = 0; i < N; i++) {
            System.out.print(mas[i] + " ");

        }

        System.out.println("\n Обратный порядок: ");

        for (int i = N-1; i >= 0; i--) {
            System.out.print(mas[i] + " ");

        }
    }
}