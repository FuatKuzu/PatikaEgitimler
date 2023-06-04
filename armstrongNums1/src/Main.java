import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayı giriniz!");
        int basNumber = 0, result = 0;
        int basPow, basValue;
        int number = scan.nextInt();
        int tempNumber = number;
        //basamak sayısı bulma
        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }
        tempNumber = number;
        //basamak sayılarının üssünü toplama
        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            basPow = 1;
            for (int i = 1; i <= basNumber; i++) {
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;
        }
        if (result == number) {
            System.out.println(result + " bir Armstrong sayıdır.");
        } else {
            System.out.println(result + " bir Armstrong sayı değildir.");
        }
    }
}