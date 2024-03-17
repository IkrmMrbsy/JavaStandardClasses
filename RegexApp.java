import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp {
    public static void main(String[] args) {
        //Regular Expression /Regex adalah cara untuk melakukan pola pencarian
        //Biasanya untuk pencarian dalam data string
        //Misal kita ingin mencari kata yg mengandung di awali huruf a dan di akhiri huruf a dll
        //Secara garis besar terdapat 2 class yaitu pattern class dan matcher class
        //Pattern class adalah representasi hasil kompilasi dari pola regex yg kita buat
        //Matcher class adalah engine untuk melakukan pencarian dari pattern yg sudah kita buat
        String name = "Ikram Marbasy Web Developer";

        Pattern pattern1 = Pattern.compile("[a-zA-Z]*[b][a-zA-Z]*");
        Matcher matcher2 = pattern1.matcher(name);

        while (matcher2.find()){
            String hasil = matcher2.group();
            System.out.println(hasil);
        }
    }
}
