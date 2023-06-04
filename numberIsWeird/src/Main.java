import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int N;
        Scanner inp = new Scanner(System.in);
        N = inp.nextInt();

        if((N>=1 && N<=100)){
            if((N%2)==0){
                if(N>=2 && N<=5)
                    System.out.print("Not Weird");
                else if(N>=6 && N<=20){
                    System.out.print("Weird");
                }else{
                    System.out.print("Not Weird");
                }
            }else{
                System.out.print("Weird");
            }}
    }
}
