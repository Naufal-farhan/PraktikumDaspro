package jobsheet5;
import java.util.Scanner;

public class ifCetakKRS20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //verifikasi pembayaran ukt
        System.out.println("--- CETAK KRS SIAKAD---");
        System.out.println("Apakah UKT Sudah Lunas");
        boolean uktLunas = sc.nextBoolean();

        //if udah lunas
        if (uktLunas){
        System.out.println("Pembayaran terverifikasi");
        System.out.println("Silahkan cetak KRS dan mimnta tanda tangan DPA");
        }

        //if belum lunas
        else {
            System.out.println("Pembayaran belum terverifikasi");
            System.out.println("“Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
        }
        
    }
}