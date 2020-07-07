package com.tugasupm;

/*
 * ini adalah section komen, tidak perlu ditulis. hanya untuk informasi saja.;
 * ubah nama class ArrayFor;
 * ubah nama variable larik, total, dan valueArray;
 *
 * */

import java.util.Scanner;

public class ArrayFor {

    public static void main(String[] args) {
        int larik[] = new int[10];
        int total = 0;

        Scanner valueArray = new Scanner(System.in);

        for(int index = 0; index < larik.length; index++) {
            System.out.print("nilai array ["+index+"] : ");
            larik[index] = valueArray.nextInt();
            total = total + larik[index];
        }

        System.out.print("Total = " + total);

    }
}
