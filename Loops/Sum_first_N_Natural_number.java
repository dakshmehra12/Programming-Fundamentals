package Loops;
import java.util.*;
public class Sum_first_N_Natural_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Last Number : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum = sum +i;
        }
        System.out.println(sum);
        sc.close();
    }
}
