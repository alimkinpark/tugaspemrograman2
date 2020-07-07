import java.util.Scanner;

public class TugasPemrograman1 {

    public static void main (String [] args) {

        String mataKuliah, ket = "Anda Salah memasukkan data";
        int nilai;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Mata Kuliah ( Algoritma / Pemrograman ) : ");
        mataKuliah = input.next();

        System.out.print("Masukkan nilai                                   : ");
        nilai = input.nextInt();

        if ( mataKuliah.equalsIgnoreCase("algoritma") ) {
            if ( nilai >= 0 && nilai <= 69  ) { ket = "Logika Kurang Baik"; }
            else if (nilai >= 70 && nilai <= 100) { ket = "Logika Baik"; }
            else {
                System.out.print("Anda Salah Memasukkan Nilai");
                return;
            }

        } else if ( mataKuliah.equalsIgnoreCase("pemrograman") ) {
            if ( nilai >= 0 && nilai <= 50 ) { ket = "Penguasaan Program Sangat Kurang";}
            else if ( nilai >= 51 && nilai <= 74 ) { ket = "Penguasaan Program Kurang";}
            else if ( nilai >= 75 && nilai <= 100 ) { ket = "Penguasaan Program Baik";}
            else {
                System.out.print("Anda Salah Memasukkan Nilai");
                return;
            }
        }

        System.out.print("Keterangan                                       : " + ket);

    }
}
