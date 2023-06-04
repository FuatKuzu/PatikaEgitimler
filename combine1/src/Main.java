import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, r;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kombinasyon için N sayısını giriniz: ");
        n = scan.nextInt();
        System.out.print("Kombinasyon için R sayısını giriniz: ");
        r = scan.nextInt();

        double totalN = 1, totalR = 1, totalNR = 1;
        int nDecR = n - r;

        for (int i = 1; i <= n; i++) {
            totalN = totalN * i;
        }
        for (int i = 1; i <= r; i++) {
            totalR = totalR * i;
        }
        for (int i = 1; i <= nDecR; i++) {
            totalNR = totalNR * i;
        }
        double conbination = (totalN) / (totalR * totalNR);

        System.out.println("n= " + n + " sayısının faktoriyeli = " + totalN);
        System.out.println("r= " + r + " sayısının faktoriyeli = " + totalR);
        System.out.println("n-r= " + nDecR + " sayısının faktoriyeli = " + totalNR);
        System.out.println("C(n,r) =  " + conbination);
    }
}