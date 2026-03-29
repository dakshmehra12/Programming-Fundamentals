package Function;
import java.util.*;
public class GCD {
    public static int Greatest_Divisor(int a ,int b) {
        while(a != b){
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a = sc.nextInt();
        System.out.print("Enter Number : ");
        int b = sc.nextInt();
        System.out.print("GCD Is : "+Greatest_Divisor(a, b));
        sc.close();
    }
}
