import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km, age, tripType;
        float perKm = 0.1f, price, yolIndirim, yasIndirim = 0;

        Scanner inp = new Scanner(System.in);
        System.out.println("Mesafeyi km türünden giriniz.");
        km = inp.nextInt();
        System.out.println("Yaşınızı giriniz.");
        age = inp.nextInt();
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş )");
        tripType = inp.nextInt();

        if ((!(age < 0) && (tripType == 1 || tripType == 215)) && !(km < 0)) {
            price = km * perKm;

            if (age < 12) {
                yasIndirim = price - (price * 0.5f);

            } else if (age >= 12 && age <= 24) {
                yasIndirim = price - (price * 0.1f);
            } else if (age > 65) {
                yasIndirim = price - (price * 0.3f);
            } else {
                yasIndirim = price;
            }
            if (tripType == 1) {
                System.out.println("Toplam tutar: " + yasIndirim);
            } else if (tripType == 2) {
                yolIndirim = (yasIndirim - (yasIndirim * 0.2f)) * 2;
                System.out.println("Toplam tutar: " + yolIndirim);
            }
        } else {
            System.out.println("Hatalı Veri Girdiniz !");
        }

    }
}