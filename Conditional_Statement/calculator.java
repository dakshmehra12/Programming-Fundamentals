import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Choice : ");
        int n = sc.nextInt();
        System.out.print("Enter 1st Value : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Value : ");
        int b = sc.nextInt();
        if(n==1){
            int sum = a+b;
            System.out.println(sum);
        }
        else if(n==2){
            int sub = a-b;
            System.out.println(sub);
        }
        else if(n==3){
            int mul = a*b;
            System.out.println(mul);
        }
        else if(n==4){
            int div = a/b;
            System.out.println(div);
        }
        else if(n==5){
            int rem =a%b;
            System.out.println(rem);
        }
        else{
            System.out.println("Invalid");
        }
        sc.close();
    }
}
