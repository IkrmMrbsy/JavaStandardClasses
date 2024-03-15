import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64App {
    public static void main(String[] args) {
        //Base64, Yaitu encoding yg bisa di gunakan untuk mengubah binary data ke text yg aman
        //Aman bukan dari sisi security, tetapi aman dari kesalahan parsing
        String data = "Ikram Marbasy";
        String encode = Base64.getEncoder().encodeToString(data.getBytes());
        System.out.println(encode);

        byte[] bytes = Base64.getDecoder().decode(encode);
        String hasil = new String(bytes);
        System.out.println(hasil);
    }
}
