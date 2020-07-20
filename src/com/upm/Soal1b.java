package com.upm;

import java.util.Scanner;

public class Soal1b {

    public static void main(String[] args) {

        int angka;

        Scanner masukkan = new Scanner(System.in);

        System.out.print("Masukkan banyak nya angka = ");
        angka = masukkan.nextInt();

        System.out.println("=============================");

        for (int i = 1; i < angka; i++) {
            System.out.println(i);
        }

    }
}
