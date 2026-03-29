package Function;
import java.util.*;
public class power_number_function {
    public static double pouwer(int p,int b) {
        double power = Math.pow(b,p);
        return power;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base : ");
        int b = sc.nextInt();
        System.out.print("Enter Power : ");
        int p = sc.nextInt();
        System.out.print("Power Is : "+pouwer(p, b));
        sc.close();
    }
}
