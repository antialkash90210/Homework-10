package com.company;

import java.util.Scanner;

public class Task11_2 {
    public static void main(String[] args) {
        int N = 10;
        int[] mas = new int[N];


        for (int i = 0; i < 10; i++) {
            Scanner input = new Scanner(System.in);
            mas[i] = input.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(mas[i] + " ");

        }
    }
}