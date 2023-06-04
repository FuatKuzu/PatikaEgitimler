import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int k, total = 0, sayac = 0;
        System.out.println("Sayı giriniz!");
        k = inp.nextInt();

        for (int i = 0; i <= k; i++) {
            if (i % 12 == 0) {
                sayac += 1;
                total += i;
                System.out.println(i);
            }
        }
        double ort = (total / sayac);
        System.out.println(ort);
    }
}