package jobsheet5;

import java.util.Scanner;

public class ifElseCetakKRS20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //input semester
        System.out.println("--Cetak KRS Anda--");
        System.out.println("Masukkan Semester Saat ini");
        int semester = sc.nextInt();

        //IF-ELSE IF-ELSE
        if (semester == 1) {
                System.out.println("KRS SEMESTER 1 DI TAMPILKAN");}
        else if (semester == 2) {
                System.out.println("KRS SEMESTER 2 DI TAMPILKAN");}
        else if (semester == 3) {
                System.out.println("KRS SEMESTER 3 DI TAMPILKAN");}
        else if (semester == 4) {
                System.out.println("KRS SEMESTER 4 DI TAMPILKAN");}
        else if (semester == 5) {
                System.out.println("KRS SEMESTER 5 DI TAMPILKAN");}
        else if (semester == 6) {
                System.out.println("KRS SEMESTER 6 DI TAMPILKAN");}
        else if (semester == 7) {
                System.out.println("KRS SEMESTER 7 DI TAMPILKAN");}
        else if (semester == 8) {
                System.out.println("KRS SEMESTER 8 DI TAMPILKAN");}
        else {
            System.out.println("Semester tidak valid");
        }
            
    }
    
}
