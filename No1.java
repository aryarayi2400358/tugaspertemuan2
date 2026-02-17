// Arya Rayi Ananta
// 2400358
// Pendidikan Ilmu Komputer
// No. 1

import java.util.Scanner;

public class No1{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        System.out.println("Masukan tiga angka:");
        int a = myObj.nextInt();
        int b = myObj.nextInt();
        int c = myObj.nextInt();

        int penjumlahan = a + b + c;
        int pengurangan = a - b - c;
        int pembagian = a / b / c;
        int perkalian = a * b * c;

        System.out.println("Hasil Penjumlahan: " + penjumlahan);
        System.out.println("Hasil Pengurangan: " + pengurangan);
        System.out.println("Hasil Pembagian: " + pembagian);
        System.out.println("Hasil Perkalian: " + perkalian);

        myObj.close();
    }
}