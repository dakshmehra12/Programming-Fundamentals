package Function;
import java.util.*;
public class odd_even_function {
    public static void check(int n ) {
        if(n%2==0){
            System.out.print("Evem Number ");
        }
        else{
            System.out.print("Odd Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        check(n);
        sc.close();
    }
}
