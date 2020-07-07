package com.tugasupm;

/*
 * ini adalah section komen, tidak perlu ditulis. hanya untuk informasi saja.;
 * ubah nama class FaktorialWhile;
 * ubah nama variable nilaiFaktorial, nilaiAwal, masukkan dan hasilnyaBro;
 *
 * */

import java.util.Scanner;

public class FaktorialWhile {

    public static void main(String[] args) {

        int nilaiFaktorial, nilaiAwal = 1, hasilnyaBro = 1;

        Scanner masukkan = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        nilaiFaktorial = masukkan.nextInt();

        while (nilaiAwal <= nilaiFaktorial) {
            hasilnyaBro = hasilnyaBro * nilaiAwal;
            nilaiAwal++;
        }

        System.out.println("Hasil dari "+nilaiFaktorial+"! adalah:");
        System.out.print(nilaiFaktorial+"!: "+hasilnyaBro);

    }
}
