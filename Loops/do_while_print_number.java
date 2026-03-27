package Loops;
import java.util.*;
public class do_while_print_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Last Number : ");
        int n = sc.nextInt();
        int i=0;
        do{
            System.out.println(i);
            i++;
        }while(i<=n);
        sc.close();
    }
}
