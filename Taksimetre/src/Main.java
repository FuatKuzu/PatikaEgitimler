import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int minTutar= 20, acilisUcreti =10, mesafe;
        double kmUcret = 2.2 , topUcret;
        Scanner girdi = new Scanner(System.in);

        mesafe = girdi.nextInt();
        topUcret= acilisUcreti+(mesafe*kmUcret);
        double kosul = (topUcret < 20) ? minTutar : topUcret;
        System.out.println("Taksimetre ücretiniz: "+kosul );

    }
}