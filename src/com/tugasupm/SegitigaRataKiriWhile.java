package com.tugasupm;

/*
 * ini adalah section komen, tidak perlu ditulis. hanya untuk informasi saja.;
 * ubah nama class SegitigaRataKiriWhile;
 * ubah nama variable x dan y;
 *
 * */

public class SegitigaRataKiriWhile {

    public static void main(String[] args) {
        int x = 4, y;
        while(x >= 1) {
            y = 1;
            while(y <= x) {
                System.out.print(y + " ");
                y++;
            }
            System.out.println();
            x--;
        }
    }
}
