import java.util.Scanner;

public class jobsheet5Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input Angka");
        int angka = sc.nextInt();
        
        if (angka % 2 == 0) {
            System.out.println("Angka tersebut adalah genap");

        } else {
            System.out.println("Angka tersebut adalah ganjil");
        }
    }
}
