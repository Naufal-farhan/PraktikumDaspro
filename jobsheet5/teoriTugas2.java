package jobsheet5;

import java.util.Scanner;

public class teoriTugas2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Apakah anda Dosen?");
        boolean dosen = sc.nextBoolean();

        if (dosen == true) {
            System.out.println("Akses diberikan");
        } else {
            System.out.println("Apakah anda mahasiswa?");
            boolean mahasiswa = sc.nextBoolean();

            if (mahasiswa == true) {
                System.out.println("Apakah SKS anda lebih dari 12?, Masukkan jumlah SKS anda");
                int sks = sc.nextInt();

                if (sks >= 12) {
                    System.out.println("Akses diberikan");
                } else {
                    System.out.println("Akses ditolak");
                }
            } else {
                System.out.println("Akses ditolak");

            }
        }

    }
}
