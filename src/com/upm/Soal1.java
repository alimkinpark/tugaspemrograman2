package com.upm;

/*
 * nama package diatas tidak perlu ditulis
 * ini adalah section komen, tidak perlu ditulis. hanya untuk informasi saja.;
 * ubah nama class Soal1;
 * ubah nama variable angka, x, masukkan;
 *
 * */

import java.util.Scanner;

public class Soal1 {

    public static void main(String[] args) {
        int angka, x = 0;

        Scanner masukkan = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka : ");
        angka = masukkan.nextInt();

        while (x <= angka) {

            System.out.print(x + ", ");

            if ( x % 2 == 0 ) {
                System.out.println("ini adalah angka genap , ");
            } else {
                System.out.println("ini adalah angka ganjil , ");
            }

            x++;
        }

        System.out.println("\nHidup Unindra Jaya!");
    }
}
