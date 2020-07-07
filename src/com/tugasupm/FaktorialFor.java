package com.tugasupm;

/*
 * ini adalah section komen, tidak perlu ditulis. hanya untuk informasi saja.;
 * ubah nama class FaktorialFor;
 * ubah nama variable nilaiFaktorial, nilaiAwal, masukkan dan hasilnyaBro;
 *
 * */

import java.util.Scanner;

public class FaktorialFor {

    public static void main(String[] args) {

        int nilaiFaktorial, hasilnyaBro = 1;

        Scanner masukkan = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        nilaiFaktorial = masukkan.nextInt();

        for (int nilaiAwal = 1; nilaiAwal <= nilaiFaktorial; nilaiAwal++) {
            hasilnyaBro = hasilnyaBro * nilaiAwal;
        }

        System.out.println("Hasil dari "+nilaiFaktorial+"! adalah:");
        System.out.print(nilaiFaktorial+"!: "+hasilnyaBro);

    }
}
