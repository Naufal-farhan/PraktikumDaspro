package jobsheet5;

import java.util.Scanner;

public class nestedUjianSkripsi20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pesan;

        System.out.println("Apakah mahasiswa sudah bebas kompen (Ya/Tidak)");
        String bebaskompen = sc.nextLine().trim();

        
        if (bebaskompen.equalsIgnoreCase("Ya")) {
            System.out.println("Masukkan log bimbingan Pembimbing 1");
            int pembimbing1 = sc.nextInt();
    
            System.out.println("Masukkan log bimbimbngan Pembimbing 2");
            int pembimbing2 = sc.nextInt();
            if (pembimbing1 >= 8 && pembimbing2 >= 4) {
                pesan = "Semua syarat terpenuhi, Mahasiswa boleh mendaftar ujian skripsi";
            } else if (pembimbing1 < 8 && pembimbing2 < 4) {
                pesan = "Gagal!!, Log bimbingan P1 kurang dari 8 dan bimbingan P2 kurang dari 4";
            } else if (pembimbing1 < 8) {
                pesan = "Gagal!!, Log Bimbingan P1 kurang dari 8";
            } else {
                pesan = "Gagal!!, Log Bimbingan P2 kurang dari 4";
            }

        } else {
            pesan = "Gagal!, Mahasiswa masih memiliki tanggungan kompen";
        }
        System.out.println(pesan);

    }

}
