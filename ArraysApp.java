import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        //Arrays class adalah yg berisikan static method yg bisa digunakan untuk memanipulasi data array
        //Seperti pencarian dan pengurutan
        int[] numbers = {
                2323,24,24,3434,343,25,65,47,547,5,4,23,22,6,7,8,4312
        };
        Arrays.sort(numbers);//Ini akan mengurutkan dari yg terkecil
        System.out.println(Arrays.toString(numbers));

        //Jika ingin melakukan pencarian
        System.out.println(Arrays.binarySearch(numbers, 8));

        //menghasilkan salinan array numbers dengan panjang 5
        int[] hasil = Arrays.copyOf(numbers, 5);
        System.out.println(Arrays.toString(hasil));

        //menghasilkan salinan array numbers mulai dari indeks 5 hingga indeks 9,
        int[] hasil2 = Arrays.copyOfRange(numbers, 5, 10);
        System.out.println(Arrays.toString(hasil2));
    }
}
