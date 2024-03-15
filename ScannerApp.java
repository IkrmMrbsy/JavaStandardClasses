import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        //Scanner adalah class yg bisa digunakan untuk membaca input, entah dari file, console dll
        //Class scanner cocok untuk di jadikan object untuk membaca input user
        Scanner scan = new Scanner(System.in);//Sytem.in ini akan membaca dari console

        System.out.print("Masukan Nama :");
        String nama = scan.nextLine();//Ketika di enter , akan di masukan ke variable name

        System.out.print("Masukan Umur :");
        int umur = scan.nextInt();//Dan jika tipe data ny int pakai nextInt()

        System.out.println("Hello " + nama + " Welcome Back");
        System.out.println("Anda berumur " + umur + " Sekarang");
    }
}
