import java.util.Scanner;

public class PemilihanPercobaan2_09 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        float uas, uts, kuis, tugas;
        double total;

        System.out.print("Nilai uas   : ");
        uas = input09.nextFloat();
        System.out.print("Nilai uts   : ");
        uts = input09.nextFloat();
        System.out.print("Nilai kuis  : ");
        kuis = input09.nextFloat();
        System.out.print("Nilai tugas : ");
        tugas = input09.nextFloat();

        total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        // System.out.println("cek " +44total);
        
            if (80 < total) {
                System.out.println("Nilai huruf : A \nNilai setara : 4 \nKualifikasi : Sangat baik ");
            } else if (73 < total) {
                System.out.println("Nilai huruf : B+ \nNilai setara : 3.5 \nKualifikasi : Lebih dari baik ");
            } else if (65 < total) {
                System.out.println("Nilai huruf : B \nNilai setara : 3 \nKualifikasi : Baik ");
            } else if (60 < total) {
                System.out.println("Nilai huruf : C+ \nNilai setara : 2.5 \nKualifikasi : Lebih dari cukup ");
            } else if (50 < total) {
                System.out.println("Nilai huruf : C \nNilai setara : 2 \nKualifikasi : Cukup ");
            } else if (39 < total) {
                System.out.println("Nilai huruf : D \nNilai setara : 1 \nKualifikasi : Kurang ");
            } else if ( total < 39){
                System.out.println("Nilai huruf :E \nNilai setara : 0 \nKualifikasi : Gagal ");
            } else  {
                System.out.println("Nilai yang anda masukkan tidak dapat terdeteksi ");
            }
        }
            
}
    