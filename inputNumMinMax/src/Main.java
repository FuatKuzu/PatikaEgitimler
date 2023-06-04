import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int inputNum = scan.nextInt();
        int minNum = 0, maxNum = 0;
        for (int i = 1; i <= inputNum; i++) {

            System.out.print(i + ". sayıyı giriniz: ");
            int num = scan.nextInt();
            if (i == 1) {

                maxNum = num;
                minNum = num;
            }
            if (num <= minNum) {
                minNum = num;

            }
            if (num >= maxNum) {
                maxNum = num;
            }
        }
        System.out.println("En büyük sayı: " + maxNum);
        System.out.println("En küçük sayı: " + minNum);
    }
}