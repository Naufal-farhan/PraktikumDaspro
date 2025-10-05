package jobsheet5;

import java.util.Scanner;

public class teoriTugas1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Apakah anda sudah melakukan registrasi");
        boolean regis = sc.nextBoolean();

        System.out.println("Apakah anda membawa KTM");
        boolean ktm = sc.nextBoolean();

        if (ktm || regis == true) {
            System.out.println("Anda memiliki akses perpustakaan");
        } else
            System.out.println("Anda tidak memiliki akses perpustakaan");

    }
}