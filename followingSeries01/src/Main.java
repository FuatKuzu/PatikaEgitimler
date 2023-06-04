import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.println("Sorgu sayısını giriniz.500'den büyük olamaz");
        int q = input.nextInt();
        //System.out.println("a sayısını giriniz");
        if ((q >= 0 && q <= 500)) {
            for (int i = 1; i <= q; i++) {
                int a = input.nextInt();
                //  System.out.println("b sayısını giriniz");
                int b = input.nextInt();
                //  System.out.println("n sayısını giriniz");
                int n = input.nextInt();
                if ((a >= 0 && a <= 50) && (b >= 0 && b <= 50) && (n >= 1 && n <= 15)) {
                    int sum = 0;
                    int countA = 1;
                    for (int j = 1; j <= n; j++) {
                        if (j == 1) {
                            System.out.print((sum = a + (j * b)) + " ");
                        } else {
                            System.out.print((sum += countA * b) + " ");
                        }
                        countA *= 2;
                    }
                    System.out.println("");
                }
            }
            input.close();
        }
    }
}
