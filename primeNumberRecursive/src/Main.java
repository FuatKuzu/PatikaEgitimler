import java.util.Scanner;

public class Main {

    static boolean primeNumber(int a, int count) {
        if (count > a / 2) {
            return true;
        }
        if (a % count == 0) {
            return false;
        }
        count++;
        return primeNumber(a, count);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı Giriniz:");
        int a = scan.nextInt();
        if (primeNumber(a, 2)) {
            System.out.println(a + " sayısı ASALDIR !");
        } else {
            System.out.println(a + " sayısı ASAL değildir !");
        }
    }
}
