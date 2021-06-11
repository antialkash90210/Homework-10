package com.company;

import java.util.Random;

public class Task11_5 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int N = 10;
        int[]mas = new int[N];
        int min = 50;
        int max = 100;
        int diff = max - min;
        for (int i = 0; i < N; i++) {
            mas[i] = rnd.nextInt(diff)+min;
        }
        for (int i = 0; i < N; i++) {
            System.out.print(mas[i]+ " ");
        }
    }
}