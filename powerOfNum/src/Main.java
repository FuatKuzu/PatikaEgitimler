import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, k;
        Scanner scan = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz: ");
        n = scan.nextInt();
        System.out.print("Üs olacak sayıyı giriniz: ");
        k = scan.nextInt();
        int total = 1;
        for (int i = 1; i <= k; i++) {
            total *= n;
        }
        System.out.print("Cevap= " + total);
    }
}