import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayı giriniz!");
        int basNumber = 0, result = 0;
        int basValue;
        int number = scan.nextInt();
        int tempNumber = number;
        //basamak sayısı bulma
        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }
        tempNumber = number;
        //basamak sayılarını toplama
        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            result += basValue;
            tempNumber /= 10;
        }
        System.out.println("Basamaklar toplamı= " + result);
    }
}