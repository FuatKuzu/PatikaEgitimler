public class Main {
    static void sum(int a,int b){
        int result = a+b;
        System.out.println(a+b);
    }
        static void show()
        {
            System.out.println("Show metodu..");
            return;
        }

    public static void main(String[] args) {
       // System.out.println(sum(3,1););        çalışmaz,dönüş değeri yok
        //int res= sum(3,2);      çalışmaz,dönüş değeri yok
        sum(3,4);
        show();
    }
}