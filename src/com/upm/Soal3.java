package com.upm;

/*
 * package tidak perlu ditulis
 * ini adalah section komen, tidak perlu ditulis. hanya untuk informasi saja.;
 * ubah nama class Soal3;
 * ubah nama variable angka, x, input, array, i, j;
 *
 * */

import java.util.Scanner;

public class Soal3 {

    public static void main(String[] args) {
        int angka, x = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukan angka : ");
        angka = input.nextInt();

        int[][] array = new int[angka][angka];

        for(int i = 0; i < angka; i++) {

            for (int j = 0; j < angka; j++) {
                array[i][j] = x;
                x++;
            }
        }

        for(int i = 0; i < angka; i++) {

            for (int j = 0; j < angka; j++) {
                System.out.print(array[i][j] + "\t");
            }

            System.out.println();
        }
    }
}
