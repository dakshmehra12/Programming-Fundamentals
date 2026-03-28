package Function;
import java.util.*;
public class Greatest_Number {
    public static void Greatest (int a,int b,int c) {
        if(a>b && a>c){
            System.out.print("Number A Is Greater ");
        }
        else if(b>c && b>a){
            System.out.print("Number B Is Greater ");
        }
        else if(c>b && c>a){
            System.out.print("Nimber C Is Greater ");
        }
        else{
            System.out.print("Equal");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a = sc.nextInt();
        System.out.print("Enter Number : ");
        int b = sc.nextInt();
        System.out.print("Enter Number : ");
        int c = sc.nextInt();
        Greatest(a, b, c);
        sc.close();
    }
}
