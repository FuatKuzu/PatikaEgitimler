import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner scan = new Scanner(System.in);
        int right = 3;          //kalan hak
        int balance = 1500;        // bakiye
        int select;
        while (right > 0) {

            System.out.print("Kullanıcı Adınız :");
            userName = scan.nextLine();
            System.out.print("Parolanız : ");
            password = scan.nextLine();


            if ((userName.equals("rias")) && (password.equals("7978"))) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do {

                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = scan.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Yatırmak istediğiniz tutarı giriniz : ");
                            int price = scan.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Çekmek istediğniz tutarı giriniz : ");
                            price = scan.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                        default:
                    }
                }
                while (select != 4);
                System.out.println("Tekrar görüşmek üzere!");
                break;

            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }
}
