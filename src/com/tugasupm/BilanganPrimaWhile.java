package com.tugasupm;

/*
* ini adalah section komen, tidak perlu ditulis. hanya untuk informasi saja.;
* ubah nama class BilanganPrimaWhile;
* ubah nama variable jmlPembagi, nilaiX, dan nilaiY;
*
* */

public class BilanganPrimaWhile {

    public static void main(String[] args) {

        int jmlPembagi;
        int nilaiX = 1, nilaiY;

        while(nilaiX <= 50){
            jmlPembagi = 0;
            nilaiY = 1;

            while (nilaiY <= nilaiX) {

                if ( nilaiX % nilaiY == 0 ) {
                    jmlPembagi = jmlPembagi + 1;
                }

                nilaiY++;
            }

            if (jmlPembagi == 2) {
                System.out.println(nilaiX);
            }

            nilaiX++;
        }
    }
}
