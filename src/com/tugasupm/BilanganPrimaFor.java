package com.tugasupm;

/*
 * ini adalah section komen, tidak perlu ditulis. hanya untuk informasi saja.;
 * ubah nama class BilanganPrimaFor;
 * ubah nama variable jmlPembagi, x, dan y;
 *
 * */

public class BilanganPrimaFor {

    public static void main(String[] args) {

        int jmlPembagi;

        for( int x = 1; x <= 50; x++){
            jmlPembagi = 0;
            for (int y = 1; y <= x; y++) {

                if ( x % y == 0 ) {
                    jmlPembagi = jmlPembagi + 1;
                }
            }

            if (jmlPembagi == 2) {
                System.out.println(x);
            }
        }
    }
}
