package Loops;
import java.util.*;
public class prime_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        boolean isprime = true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                isprime=false;
            }
        }
        if(isprime){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime ");
        }
        sc.close();
    }
}
