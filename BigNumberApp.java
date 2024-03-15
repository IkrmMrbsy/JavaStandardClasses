import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumberApp {
    public static void main(String[] args) {
        //Jika kita ada kebutuhan untuk menggunakan angka yg besar
        //Sehingga melebihi kapasitas Long dan Double
        //BigInteger adalah class untuk handle tipe data Integer(Yng melebihi kapasitas Long)
        //BigDecimal adalah class untuk handle tipe data floating Point(yg melebihi kapasitas Double)
        BigInteger a = new BigInteger("100000000000000000000");
        BigInteger b = new BigInteger("100000000000000000000");
        BigInteger hasil = a.add(b);
        System.out.println(hasil);

        BigDecimal c = new BigDecimal("200000.00000000000000000");
        BigDecimal d = new BigDecimal("200000.00000000000000000");
        BigDecimal hasil2 = c.add(d);
        System.out.println(hasil2);
    }
}
