import java.util.Calendar;
import java.util.Date;

public class DateCalenderApp {
    public static void main(String[] args) {
        //Class Date adalah reprsentasi tanggal sampai presisi milisecond
        //Tapi di class date sudah banyak method2 yg di precated(sdh tdk di rekomen di gunakan)
        //Date adalah untuk representasi tanggal, Calender untuk manipulasi tanggal

        //Menggunakan Date
        Date tanggal = new Date();//Jadi kalau tidak memasukan apa apa
        System.out.println(tanggal);//Outputnya Waktu saat ini

        //Menggunakan Calender
        Calendar kalender = Calendar.getInstance();
    }
}
