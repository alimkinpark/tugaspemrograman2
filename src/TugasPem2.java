import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class TugasPem2 {

    public static void main ( String [] args ) {

        String  buyer = "Nama Pembeli",
                productName = "Nama Produk",
                ulang = "y";

        int     productCode,
                productPrice = 0,
                amount,
                discount = 0,
                total,
                charge,
                change;

        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

        while (ulang.equalsIgnoreCase("y")) {

            System.out.println("TUGAS PEMROGRAMAN 2 \n");


            try {
                BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Masukkan Nama Pembeli     : ");
                buyer = input.readLine();

                System.out.print("Masukkan Kode Barang      : ");
                productCode = Integer.parseInt(input.readLine());

                System.out.print("Masukkan Jumlah Barang    : ");
                amount = Integer.parseInt(input.readLine());

                if ( productCode == 1) {
                    productName = "Bolu";
                    productPrice = 100000;
                    total = productPrice * amount;
                } else if ( productCode == 2 ) {
                    productName = "Tart";
                    productPrice = 250000;
                    total = productPrice * amount;
                } else if ( productCode == 3 ) {
                    productName = "Cake";
                    productPrice = 150000;
                    total = productPrice * amount;
                } else {
                    System.out.println("Kode Produk yang ada masukkan salah !");
                    return;
                }

                if ( total >= 2000001 ) {
                    discount = total * 20 / 100;
                    total = total - discount;
                } else if ( total >= 1000000 && total <= 2000000 ) {
                    discount = total * 10 / 100;
                    total = total - discount;
                }

                System.out.println("\n========================================");
                System.out.println("            TOKO KUE ALIM                 ");
                System.out.println("========================================\n");

                System.out.println("Nama Pembeli     : " + buyer);
                System.out.println("Nama Barang      : " + productName);
                System.out.println("Jumlah Beli      : " + amount);
                System.out.println("Harga            : " + nf.format(productPrice) + "\n");

                System.out.println("----------------------------------------\n");

                System.out.println("Diskon           : " + nf.format(discount));
                System.out.println("Total            : " + nf.format(total));
                System.out.print("Bayar            : Rp");
                charge = Integer.parseInt(input.readLine());
                System.out.println("                 --------------------");

                if ( charge >= total ) {
                    change = charge - total;
                    System.out.println("Kembali          : " + nf.format(change));
                } else {
                    System.out.println("Uang Bayar tidak boleh lebih kecil dari tagihan !");
                }

            } catch (Exception e) {
                System.out.println("Anda salah memasukkan data !!");
            }

            Scanner cobalagi = new Scanner(System.in);

            System.out.print("\nUlangi (Y/N) ? ");
            ulang = cobalagi.next();

        }

    }

}
