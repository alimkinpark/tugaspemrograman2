import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class TugasPem3 {

    public static void main (String [] args ) {

        final double GAJI = 3400000;
        double penjualan,
                ins_jasa = 0,
                ins_komisi = 0,
                pajak_ins,
                total_ins,
                net = 0;

        String ulangi = "y";

        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

        while ( ulangi.equalsIgnoreCase("y") ) {
            System.out.println("TUGAS PEMROGRAMAN 3 \n");

            System.out.print("Masukkan Penjualan SALES MARKETING : ");
            try {
                BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
                penjualan = Double.parseDouble(input.readLine());

                if ( penjualan < 3000000 ) {
                    ins_jasa = penjualan * 0.015;
                    ins_komisi = penjualan * 0.25;
                } else if ( penjualan >= 3000000 ) {
                    ins_jasa = penjualan * 0.025;
                    ins_komisi = ( penjualan * 0.3 ) + 100000;
                }

                total_ins = ins_jasa + ins_komisi;
                pajak_ins = total_ins * 0.2;
                net = GAJI + total_ins - pajak_ins;

                System.out.println("\n-------------------------------------------------");
                System.out.println("INSENTIF JASA                         : " + nf.format(ins_jasa));
                System.out.println("INSENTIF KOMISI                       : " + nf.format(ins_komisi) );
                System.out.println("PAJAK INSENTIF                        : " + nf.format(pajak_ins) );
                System.out.println("TOTAL GAJI + INSENTIF - PAJAK         : " + nf.format(net));

            } catch (Exception e) {
                System.out.println("Data yang dimasukkah harus berupa angka !");
            }

            Scanner cobalagi = new Scanner(System.in);

            System.out.print("\n" +"Ulangi (Y/N) ? ");
            ulangi = cobalagi.next();

        }

    }
}
