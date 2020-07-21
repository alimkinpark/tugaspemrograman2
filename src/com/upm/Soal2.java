package com.upm;

/*
 * nama package diatas tidak perlu ditulis
 * ini adalah section komen, tidak perlu ditulis. hanya untuk informasi saja.;
 * ubah nama class Soal2;
 * ubah nama variable hari, beli, total, totalBeli, valueArray, larik, index;
 *
 * */

import java.util.Scanner;

public class Soal2 {

    public static void main(String[] args) {

        int hari;
        double beli, totalBeli = 0, total = 0;

        Scanner valueArray = new Scanner(System.in);

        System.out.println("=== TOKO KELONTONG H.MUKIDI ===");
        System.out.println("``````````````````````````````````````````````");

        System.out.print("Masukkan banyaknya pendapatan(hari) warung kelontong: ");
        hari = valueArray.nextInt();

        double larik[] = new double[hari];

        for(int index = 0; index < larik.length; index++) {
            System.out.print("Hari ke "+(index+1)+" : Rp. ");
            larik[index] = valueArray.nextDouble();
            total = total + larik[index];
            beli = 0.2 * larik[index];
            totalBeli = totalBeli + beli;
        }

        System.out.println("``````````````````````````````````````````````");
        System.out.println("Hasil nilai total pendapatan adalah : Rp." + total);
        System.out.println("``````````````````````````````````````````````");
        System.out.println("Pendapatan buat beli barang selama "+ hari +" hari = Rp." + totalBeli);
        System.out.println("``````````````````````````````````````````````");
        System.out.println("Pendapatan bersih = Rp." + (total - totalBeli));
        System.out.println("``````````````````````````````````````````````");
        System.out.print("Pendapatan rata-rata perhari : Rp." + (total/hari));
    }
}
