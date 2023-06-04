import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int total = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Sayı giriniz: ");
            n = scan.nextInt();
            if (n % 4 == 0) {
                total += n;
            }
            System.out.println("Girilen sayıların toplamı: " + total);
        } while (n % 2 == 0);
    }
}