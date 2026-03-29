package Function;
import java.util.*;
public class Factorial_Function {
    public static void factotial(int n) {
        int factorial = 1;
        for(int i=1;i<=n;i++){
            factorial=factorial*i;
        }
        System.out.print(factorial);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        factotial(n);
        sc.close();
    }
}
