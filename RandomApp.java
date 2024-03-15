import java.util.Random;

public class RandomApp {
    public static void main(String[] args) {
        //Random Class adalah class yg bisa kita gunakan untuk meng generate random number
        Random acak = new Random();//Membuat Object Random Baru

        for (var i = 0; i < 100; i++){
            var value = acak.nextInt(500);//Bound artinya maksimal nya
            System.out.println(value);
        }
    }
}
