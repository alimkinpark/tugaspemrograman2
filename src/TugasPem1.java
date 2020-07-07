import java.util.Scanner;

public class TugasPem1 {

    public static void main (String [] args) {

        String matkul, ket = "keterangan";
        int nilai;

        System.out.println("TUGAS PEMROGRAMAN 1" + "\n");

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Mata Kuliah ( algoritma / pemrograman ) : ");
        matkul = input.next();

        if (!matkul.equalsIgnoreCase("algoritma") && !matkul.equalsIgnoreCase("pemrograman"))
        {
            System.out.print("Anda salah memasukkan Nama Mata Kuliah !!");
            return;
        }

        System.out.print("Masukkan nilai                                   : ");
        nilai = input.nextInt();

        if ( matkul.equalsIgnoreCase("algoritma") ) {
            if ( nilai >= 0 && nilai <= 69  ) { ket = "Logika Kurang Baik"; }
            else if (nilai >= 70 && nilai <= 100) { ket = "Logika Baik"; }
            else {
                System.out.print("Anda Salah Memasukkan Nilai");
                return;
            }

        } else if ( matkul.equalsIgnoreCase("pemrograman") ) {
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
