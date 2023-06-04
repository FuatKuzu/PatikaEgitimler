import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num0 = 0, num1 = 1, fibonacci;

        System.out.println("Sayı giriniz: ");
        int num = scan.nextInt();
        if (num >= 1) {
            System.out.print(0+" "+1);
            for (int i = 1; i <= num; i++) {
                fibonacci = num0 + num1;
                System.out.print(" "+fibonacci);
                num0=num1;
                num1=fibonacci;
            }
        }
    }
}
