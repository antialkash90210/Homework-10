package com.company;

import java.util.Scanner;

public class Task11_7 {
    public static void main(String[] args) {
        int start_digit = 20;
        int start = start_digit;
        int finish_digit = 1;
        int quantity = start_digit - finish_digit;
        int N = 20;
        int[]mas = new int[N];

        for (int i = 0; i <= quantity; i++) {
            mas[i] = start;
            start--;
        }


        for (int i = 0; i <= quantity; i++) {
            System.out.print(mas[i] + " ");

        }
    }
}