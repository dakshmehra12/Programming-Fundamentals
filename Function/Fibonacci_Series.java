package Function;
import java.util.*;
public class Fibonacci_Series {
    public static void fibonacci(int n) {
        int a=0;
        int b =1;
        if(n==0)
            return;
        else if(n==1){
            System.out.print(a);
        }
        else{
            System.out.print(a+" "+b);
            for(int i=3;i<=n;i++){
                int temp = a+b;
                System.out.print(" "+ temp);
                a=b;
                b=temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Last Sequence Number : ");
        int n = sc.nextInt();
        fibonacci(n);
        sc.close();
    }
}
