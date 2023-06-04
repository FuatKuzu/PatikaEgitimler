import java.util.Scanner;

public class Main {
    static void minus1(int a, int temp) {

        if (a > 0) {
            System.out.print(a + " ");
            minus1(a - 5, temp);
        } else if (a <= 0) {
            minus2(a, temp);
        }
    }

    static void minus2(int a, int temp) {
        if (temp >= a) {
            System.out.print(a + " ");
            minus2(a + 5, temp);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz ");
        int a = scan.nextInt();
        int temp = a;
        minus1(a, temp);
    }
}