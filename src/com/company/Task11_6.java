package com.company;

public class Task11_6 {
    public static void main(String[] args) {
        int start_digit = 1;
        int start = start_digit;
        int finish_digit = 12;
        int quantity = finish_digit;

        int[]mas = new int[quantity];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = start;
            start++;
        }


        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");

        }
    }
}