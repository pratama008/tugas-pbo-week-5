package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class MahasiswaAksi {
    public static void main(String[] args) {
        // membuat objek ArrayList untuk menyimpan data mahasiswa
        ArrayList<Mahasiswa> mahasiswaList = new ArrayList<Mahasiswa>();

        // menambahkan data mahasiswa ke dalam ArrayList
        ArrayList<Double> nilai1 = new ArrayList<Double>();
        nilai1.add(3.5);
        nilai1.add(3.0);
        nilai1.add(4.0);
        
        /// membuat objek scanner untuk membaca inputan
        Scanner myScanner = new Scanner(System.in);

        /// input nama dan nim
        String nama = myScanner.nextLine();
        String nim = myScanner.nextLine();

        mahasiswaList.add(new Mahasiswa(nama, nim, nilai1));

        // menampilkan data mahasiswa dan IPK menggunakan Iterator
        Iterator<Mahasiswa> iterator = mahasiswaList.iterator();
        while (iterator.hasNext()) {

            /// pindahkan iterator ke dalam objek mahasiswa
            Mahasiswa mahasiswa = iterator.next();

            /// output nama nim dan ipk dari mahasiswa
            System.out.println("Nama: " + mahasiswa.getNama() + ", NIM: " + mahasiswa.getNim() + ", IPK: "
                    + String.valueOf(mahasiswa.hitungIPK()));
        }

        /// tutup objek scanner
        myScanner.close();
    }
}
