package Basics;
import java.util.*;
public class Arithmatic_Operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int b = sc.nextInt();
        int sum = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;
        System.out.println("Sum "+sum);
        System.out.println("Sub "+sub);
        System.out.println("Mul "+mul);
        System.out.println("Div "+div);
        sc.close();
    }
}
