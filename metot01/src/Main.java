
public class Main {

    static void helloWorld(){
        System.out.println("Kodluyoruz Dünya");
    }
    static int power(int base, int exp) {
        int result = 1;
        for (int i = 1; i <= exp; i++){
            result*=base;
        }
        return result;

    }

    public static void main(String[] args) {

        int n1=2,n2=3;
        int case01= power(n1,n2);
      //  int case01= power(2,3);
      //  System.out.println(case01);
        System.out.println(power(2,3));
        System.out.println(power(4,2));
      //  System.out.println(helloWorld());     çalışmaz çünkü döndürdüğü bir değer yok
        helloWorld();
        helloWorld();
    }
}