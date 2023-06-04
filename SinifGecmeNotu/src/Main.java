import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int Matematik, Fizik, Turkce, Kimya, Muzik;
        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik notunu giriniz");
        Matematik = inp.nextInt();
        System.out.println("Fizik notunu giriniz");
        Fizik = inp.nextInt();
        System.out.println("Türkçe notunu giriniz");
        Turkce = inp.nextInt();
        System.out.println("Kimya notunu giriniz");
        Kimya = inp.nextInt();
        System.out.println("Müzik notunu giriniz");
        Muzik = inp.nextInt();
        double avarage = (Matematik + Fizik + Turkce + Kimya + Muzik) / 5;

        if (avarage < 0 || avarage > 100) {
            System.out.println("Not ortalamanız 0 ile 100 arasında olmalıdır!!!");
        } else {
            if (avarage >= 55)
                System.out.print("Başarıyla geçtiniz ");
            else {
                System.out.print("Geçemediniz!");
            }
            System.out.print("Not Ortalamanız= " + avarage);
        }
    }
}