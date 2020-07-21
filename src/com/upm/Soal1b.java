package com.upm;

/*
 * nama package diatas tidak perlu ditulis
 * ini adalah section komen, tidak perlu ditulis. hanya untuk informasi saja.;
 * ubah nama class Soal1b;
 * ubah nama variable angka, x, masukkan, i, j;
 *
 * */

import java.util.Scanner;

public class Soal1b {

    public static void main(String[] args) {

        int angka, x = 1;

        Scanner masukkan = new Scanner(System.in);

        System.out.print("Masukkan banyak nya angka = ");
        angka = masukkan.nextInt();

        System.out.println("=============================");

        for (int i = 1; i < angka; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(x + " ");
                x += 2;
            }

            System.out.println();
        }

    }
}
