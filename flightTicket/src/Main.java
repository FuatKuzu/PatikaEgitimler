import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int km, age, discountedPrice,type;       // distance= mesafe , discount=indirim
        float normalPrice, totalPrice, perKm = 0.1f, ageDiscount, ageDiscountRatio, discountedPrice, tripTypeDiscount;



        Scanner inp = new Scanner(System.in);
        System.out.println("Mesafeyi km türünden giriniz.");
        km = inp.nextInt();
        System.out.println("Yaşınızı giriniz.");
        age = inp.nextInt();
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş )");
        type=inp.nextInt();


        if (!(age < 0) && ( (type==1)||(type==0))) {
            if (age < 12){
                ageDiscountRatio = 0.5f;
            } else if (age >= 12 && age < 25) {
                ageDiscountRatio = 0.1f;
            }else if (age>65){
                ageDiscountRatio = 0.3f;
            }
        }else {
            System.out.println("Hatalı veri girdiniz.");
        }
        normalPrice = km * perKm;
        ageDiscount = normalPrice * ageDiscountRatio;
        discountedPrice = normalPrice - ageDiscount;
        tripTypeDiscount = discountedPrice * 0.2f;
        totalPrice = discountedPrice - tripTypeDiscount;
        System.out.println("Yaş indirimi: " + ageDiscount);
        System.out.println("Yaş indirimli fiyat: " + discountedPrice);


        System.out.println("Toplam Fiyat: "+totalPrice);
    }
}