import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        if (N >= 2 && N <= 20) {
            int result = 0;

            for (int i = 1; i <= 10; i++) {

                result = i * N;
                System.out.println(N + " x " + i + " = " + result);
            }
        }
    }
}