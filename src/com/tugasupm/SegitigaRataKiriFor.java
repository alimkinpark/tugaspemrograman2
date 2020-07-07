package com.tugasupm;

/*
 * ini adalah section komen, tidak perlu ditulis. hanya untuk informasi saja.;
 * ubah nama class SegitigaRataKiriFor;
 * ubah nama variable x dan y;
 *
 * */

public class SegitigaRataKiriFor {

    public static void main(String[] args) {
        for(int x = 4; x >= 1; x--) {
            for (int y = 1; y <= x; y++) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
