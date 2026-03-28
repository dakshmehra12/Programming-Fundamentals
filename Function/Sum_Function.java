package Function;
import java.util.*;
public class Sum_Function {
    public static int sum(int a,int b) {
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int b = sc.nextInt();
        int n = sum(a, b);
        System.out.print("Sum Is :"+n);
        sc.close();
    }
}
