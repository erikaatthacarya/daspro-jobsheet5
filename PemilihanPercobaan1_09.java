import java.util.Scanner;

public class PemilihanPercobaan1_09 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input09.nextInt();

        String operation = (angka%2 == 0) ? "genap": "ganjil";
        System.out.println("Angka " +angka+ " adalah bilangan "+ operation);

        // if (angka % 2 == 0){
        //    System.out.println("Angka "+angka+" bilangan genap");
        // }else{
        //   System.out.println("Angka "+angka+" bilangan ganjil");
    }
}