package jobsheet5;
import java.util.Scanner;

public class switchCetakKRS20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //input semester
        System.out.println("--Cetak KRS Anda--");
        System.out.println("Masukkan Semester Saat ini");
        int semester = sc.nextInt();

        //SWITCH-CASE
        switch (semester){
            case 1 :
                System.out.println("KRS SEMESTER 1 DI TAMPILKAN");
                break ; 
            case 2:
                System.out.println("KRS SEMESTER 2 DI TAMPILKAN");
                break ; 
            case 3:
                System.out.println("KRS SEMESTER 3 DI TAMPILKAN");
                break ; 
            case 4 :
                System.out.println("KRS SEMESTER 4 DI TAMPILKAN ");
                break ; 
            case 5 :
                System.out.println("KRS SEMESTER 5 DI TAMPILKAN");
                break ; 
            case 6:
                System.out.println("KRS SEMESTER 6 DI TAMPILKAN");
                break ; 
            case 7:
                System.out.println("KRS SEMESTER 7 DI TAMPILKAN");
                break ; 
            case 8 :
                System.out.println("KRS SEMESTER 8 DI TAMPILKAN ");
                break ; 
            default:
                System.out.println("Semester tidak valid");
        }
    }
    
}
