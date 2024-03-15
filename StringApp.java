import java.util.StringJoiner;
import java.util.StringTokenizer;

public class StringApp {
    public static void main(String[] args) {
        String name = "Ikram Marbasy";//yang ini tidak akan berubah
        String toLowerCase = name.toLowerCase();//Ini akan membuat huruf kecil semua
        //String kalau di java tidak bisa berubah, datanya tidak bisa berubah
        //Jadi toLowerCase akan membuat string baru
        String upperCase = name.toUpperCase();//Ini akan membuat huruf besar semua

        System.out.println(name);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.length());//Akan cek berapa panjang string nya
        System.out.println(name.startsWith("Ikram"));//akan cek apakah di mulai dengan ikram
        System.out.println(name.endsWith("Marbasy"));//akan cek apakah di akhiri dengan marbasy

        String name2 = "Zehan Husun Muksin";

        String[] names = name2.split(" ");//Untuk memotong string dengan string value
        for (var value : names) {
            System.out.println(value);
        }

        //String Builder dan String Buffer//
        //Kemampuan string builder dan string buffer sama, bisa untuk memanipulasi string
        //Bedanya string buffer thread safe, sedangkan string builder tidak
        //Makusdnya thread safe adalah bisa di akses secara bersamaan
        //Jika kita ingin memanipulasi string secara bersamaan, pakai string buffer
        //Jika kita tidak butuh pararel, cukup pakai string builder
        //Karena string buffer di buat agar thread safe, maka peform nya lebih lambat
        StringBuilder b1 = new StringBuilder();
        b1.append("Zehan");//appnd itu untuk menambahkan string
        b1.append(" ");
        b1.append("Ahmad");
        String fullName = b1.toString();//Jika ingin konversi ke string
        System.out.println(fullName);
        //Jadi kalau pakai string builder/buffer, lebih hemat memory

        //String Joinner Class
        //Untuk menggabung gabungkan string
        //adalah string class yg di digunakan untuk membuat string sequence yg di pisahkan dengan delimeter
        //String joinner juga mndukung prefix dan suffix jika kita ingin menambahkanya
        //Prefix itu di depanya, dan suffix di belakang nya
        //Ini sangat bagus jika kita ingin memprint array dengan format yg kita mau

        StringJoiner join = new StringJoiner("||", "[", "]");
        join.add("Ikram");
        join.add("Nazwa");
        join.add("Syafiq");

        String value = join.toString();
        System.out.println(value);

        //String Tokenizer Class
        //Adalah class yg bisa di gunakan untuk memotong string menjadi lebih kecil
        //Kita bisa memotong string dengan delimeter yg kita mau
        String nama5 = "Ikram Marbasy";
        StringTokenizer token = new StringTokenizer(nama5, " ");
        while (token.hasMoreTokens()){
            String hasil = token.nextToken();
            System.out.println(hasil);
            //Jadi lebih menghemat memori jika pakai String tokenizer
        }
    }
}
