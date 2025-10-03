package jobsheet5;
import java.util.Scanner;

public class ifCetakKRS20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //verifikasi pembayaran ukt
        System.out.println("--- CETAK KRS SIAKAD---");
        System.out.println("Apakah UKT Sudah Lunas");
        boolean uktLunas = sc.nextBoolean();

        String hasil = (uktLunas) ? "Pembayaran terverifikasi" : "Gagal!!.., Silahkan lakukan pembayaran terlebih dahulu" ; 
        System.out.println(hasil);        
    }
}