
import java.util.Scanner;

public class Powerfunction {

    static int pow(int a,int b,int c){
        int pow=0;
        if (b==0){
            return 1;
        }
        if(b==1) {
            return a;
        }
        return pow(a,b/2,c);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(pow (a,b,c));
    }}