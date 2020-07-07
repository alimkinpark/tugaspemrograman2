    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.text.NumberFormat;
    import java.util.Locale;
    import java.util.Scanner;

    public class TugasPemrograman2 {

        public static void main ( String [] args ) {

            String  pembeli = "Nama Pembeli",
                    namaProduk = "Nama Produk";

            int     kode,
                    hargaProduk = 0,
                    jumlahBarang,
                    diskon = 0,
                    total,
                    tagihan,
                    kembalian;

            NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

                 Scanner input = new Scanner(System.in);

                    System.out.print("Masukkan Nama Pembeli     : ");
                    pembeli = input.next();

                    System.out.print("Masukkan Kode Barang      : ");
                    kode = input.nextInt();

                    System.out.print("Masukkan Jumlah Barang    : ");
                    jumlahBarang = input.nextInt();

                    if ( kode == 1) {
                        namaProduk = "Bolu";
                        hargaProduk = 100000;
                        total = hargaProduk * jumlahBarang;
                    } else if ( kode == 2 ) {
                        namaProduk = "Tart";
                        hargaProduk = 250000;
                        total = hargaProduk * jumlahBarang;
                    } else if ( kode == 3 ) {
                        namaProduk = "Cake";
                        hargaProduk = 150000;
                        total = hargaProduk * jumlahBarang;
                    } else {
                        System.out.println("Kode Produk yang ada masukkan salah !");
                        return;
                    }

                    if ( total >= 2000001 ) {
                        diskon = total * 20 / 100;
                        total = total - diskon;
                    } else if ( total >= 1000000 && total <= 2000000 ) {
                        diskon = total * 10 / 100;
                        total = total - diskon;
                    }

                    System.out.println("\n========================================");
                    System.out.println("            TOKO KUE DESTA                 ");
                    System.out.println("========================================\n");

                    System.out.println("Nama Pembeli     : " + pembeli);
                    System.out.println("Nama Barang      : " + namaProduk);
                    System.out.println("Jumlah Beli      : " + jumlahBarang);
                    System.out.println("Harga            : " + nf.format(hargaProduk) + "\n");

                    System.out.println("----------------------------------------\n");

                    System.out.println("Diskon           : " + nf.format(diskon));
                    System.out.println("Total            : " + nf.format(total));
                    System.out.print("Bayar            : Rp");
                    tagihan = input.nextInt();
                    System.out.println("                 --------------------");

                    if ( tagihan >= total ) {
                        kembalian = tagihan - total;
                        System.out.println("Kembali          : " + nf.format(kembalian));
                    } else {
                        System.out.println("Uang Bayar tidak boleh lebih kecil dari tagihan !");
                    }

            }

    }
