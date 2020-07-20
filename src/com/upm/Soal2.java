package com.upm;

/*
 * ini adalah section komen, tidak perlu ditulis. hanya untuk informasi saja.;
 * ubah nama class ArrayFor;
 * ubah nama variable larik, total, dan valueArray;
 *
 * */

import java.util.Scanner;

public class Soal2 {

    public static void main(String[] args) {

        int total = 0, hari, beli = 0;

        Scanner valueArray = new Scanner(System.in);

        System.out.println("=== TOKO KELONTONG H.MUKIDI ===");
        System.out.println("``````````````````````````````````````````````");

        System.out.print("Masukkan banyaknya pendapatan(hari) warung kelontong: ");
        hari = valueArray.nextInt();

        int larik[] = new int[hari];

        for(int index = 0; index < larik.length; index++) {
            System.out.print("Hari ke "+(index+1)+" : Rp. ");
            larik[index] = valueArray.nextInt();
            total = total + larik[index];
            beli = beli + (20/100 * larik[index]);
        }

        System.out.println("``````````````````````````````````````````````");
        System.out.println("Hasil nilai total pendapatan adalah : Rp." + total);
        System.out.println("``````````````````````````````````````````````");
        System.out.println("Pendapatan buat beli barang selama "+ hari +" hari = Rp." + beli);
        System.out.println("``````````````````````````````````````````````");
        System.out.println("Pendapatan bersih = Rp." + (total - beli));
        System.out.println("``````````````````````````````````````````````");
        System.out.print("Pendapatan rata-rata perhari : Rp." + (total/hari));
    }
}
