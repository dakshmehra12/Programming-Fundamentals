package Function;
import java.util.*;
public class average_function {
    public static int avg(int a,int b,int c) {
        int avg =(a+b+c)/3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A : ");
        int a = sc.nextInt();
        System.out.print("Enter B : ");
        int b = sc.nextInt();
        System.out.print("Enter C : ");
        int c = sc.nextInt();

        System.out.print("The Average Is : "+avg(a, b, c));
        sc.close();
    }
}
