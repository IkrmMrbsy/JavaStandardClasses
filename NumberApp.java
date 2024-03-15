public class NumberApp {
    public static void main(String[] args) {
        //Semua number class yg bukan primitif memiliki parent class yg sama
        //Yaitu Class Number
        //Class number memiliki banyak method yg bisa di gunakan untuk mengkonversi ke tipe numbr lain
        //hal ini memudahkan kita untuk mengkonvrsi object number dari satu tipe ke tipe number lainya
        Integer contoh1 = 10;
        Long contoh2 = contoh1.longValue();
        System.out.println(contoh2);

        Double contoh3 = 20.0000;
        int contoh4 = contoh3.intValue();
        System.out.println(contoh4);

        //Konversi String Ke Number
        //Long, Byte, Integer, Short memiliki static method untuk melakukan konversi dari string ke number
        //parsexxx() digunakan untuk mengkonversi dari string ke tipe data number primitif
        //valueOf(string) digunakan untuk mengkonversi dari string ke tipe data number non primitif
        String contohString = "1000";
        Integer contohInteger = Integer.valueOf(contohString);
        System.out.println(contohInteger);

        String contohString2 = "100.10";
        Double contohDouble = Double.valueOf(contohString2);
        System.out.println(contohDouble);

        String contohString3 = "50";
        int contohInt = Integer.parseInt(contohString3);
        System.out.println(contohInt);
    }
}
