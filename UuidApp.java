import java.util.UUID;

public class UuidApp {
    public static void main(String[] args) {
        //Saat kita membuat aplikasi, kadang ada kasus ingin membuat data unique
        //Misal untuk kebutuhan data primary key
        //UUID singkatan dari Universally Unique Identifier
        for (var i = 0; i < 100; i++){
            UUID contoh = UUID.randomUUID();
            System.out.println(contoh);
        }
            //Ini sangat cocok untuk menjadi primary key di database
    }
}
