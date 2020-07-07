    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.text.NumberFormat;
    import java.util.Locale;
    import java.util.Scanner;

    public class TugasPemrograman3 {

        public static void main (String [] args ) {

            double penjualan,
                    insentifJasa = 0,
                    insentifKomisi = 0,
                    pajakInsentif,
                    totalInsentif,
                    totalGaji = 0,
                    gajiSales = 3400000;


            NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

                System.out.print("Masukkan Penjualan SALES MARKETING : ");

                    Scanner input = new Scanner(System.in);

                    penjualan = input.nextDouble();

                    if ( penjualan < 3000000 ) {
                        insentifJasa = penjualan * 0.015;
                        insentifKomisi = penjualan * 0.25;
                    } else if ( penjualan >= 3000000 ) {
                        insentifJasa = penjualan * 0.025;
                        insentifKomisi = penjualan * 0.3 + 100000;
                    }

                    totalInsentif = insentifJasa + insentifKomisi;
                    pajakInsentif = totalInsentif * 0.2;
                    totalGaji = gajiSales + totalInsentif - pajakInsentif;

                    System.out.println("\n-------------------------------------------------");
                    System.out.println("INSENTIF JASA                         : " + nf.format(insentifJasa));
                    System.out.println("INSENTIF KOMISI                       : " + nf.format(insentifKomisi) );
                    System.out.println("PAJAK INSENTIF                        : " + nf.format(pajakInsentif) );
                    System.out.println("TOTAL GAJI + INSENTIF - PAJAK         : " + nf.format(totalGaji));

        }
    }
