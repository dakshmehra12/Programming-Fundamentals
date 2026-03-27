package Loops;
import java.util.*;
public class printing_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Last Number : ");
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
            System.out.println(i);
        }
        sc.close();
    }
}
