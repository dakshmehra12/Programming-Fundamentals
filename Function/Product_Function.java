package Function;
import java.util.*;
public class Product_Function {
    public static int product(int a,int b) {
        int product = a*b;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int b = sc.nextInt();
        int n = product(a, b);
        System.out.print("The Product Is : "+n);
        sc.close();
    }
}
