import java.util.Scanner;

public class Main {
    static int power(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * power(a, (b - 1));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban sayısı : ");
        int a = scan.nextInt();
        System.out.print("Üs sayısı : ");
        int b = scan.nextInt();
        System.out.print("Sonuç : " + power(a, b));


    }
}