public class Main {
    static int f(int x) {
        int result = 0;
        for (int i = 1; i <= x; i++) {
            result += i;
        }
        return result;
    }

    static int f2(int k) {
        System.out.println(k);
        if (k == 1) {
            return 1;
        }
        return f2(k - 1)+k;
    }

    static int f1(int x) {

        if (x > 0) {
            return x + f1(x - 1);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        //   System.out.println(f(4));
        //   System.out.println(f1(5));
        f2(4);
    }
}
