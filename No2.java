// Arya Rayi Ananta
// 2400358
// Pendidikan Ilmu Komputer
// No. 2

import java.util.Scanner;

public class No2 {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        System.out.println("Masukkan Rangking Anda:");
        boolean naikKelas = true;
        int rangking = myObj.nextInt();

        boolean dapatHadiah = (rangking == 1) && (naikKelas);

        String hasil = dapatHadiah ? "Selamat! Anda mendapatkan hadiah" : "Maaf, Anda tidak mendapatkan hadiah";

        System.out.println(hasil);

        myObj.close();
    }
}
