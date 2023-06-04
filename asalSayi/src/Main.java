public class Main {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {
            int counter = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                System.out.println(i);
            }
        }
    }
}





        /*
        int n1 = 100;
        for (int i = 2; i <= 100; i++) {
            int counter = 0;
            for (int k = 1; k <= i; k++) {

                if ((i % k == 0)) {
                    counter++;
                    //System.out.println(k + " bir asal sayıdır!");
                }
                if (counter <= 2) {
                    System.out.println(k);
                }
            }
        }

    }
}*/