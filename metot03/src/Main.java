public class Main {
    static void write(){
        System.out.println("Paremetresiz method");
    }

    static void write(int a){
        System.out.println("Paremetre: "+a);
    }
    static int write(int a,int b){
        return a+b;
    }
    static double write(double a,int b){
        return a+b;
    }
    static String write(String a){
        a="Rias harikasın";
        return a;
    }

    public static void main(String[] args) {

        System.out.println(write("a"));
        System.out.println(write("b"));
        System.out.println(write("52"));
        write();
        write(6);
        System.out.println(write(5,6));
        System.out.println(write(5.3,6));

    }
}