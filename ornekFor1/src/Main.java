import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
    /*    for (int i = 1; i <= 10;i++) {
            if (i % 2 == 0) {
                continue;

            }
            System.out.println(i);
        }       */
        int i = 1;
        while (i <= 10) {
            i++;
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}