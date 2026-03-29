package Function;
import java.util.*;
public class Prime_check {
    public static void prime(int n) {
        boolean isprime = true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                isprime=false;
            }
        }
        if(isprime){
            System.out.print("Prime Number");
        }
        else{
            System.out.print("Not a Prime Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        prime(n);
        sc.close();
    }
}
