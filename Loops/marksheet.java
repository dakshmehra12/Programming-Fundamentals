package Loops;
import java.util.*;
public class marksheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Choice : ");
        int n = sc.nextInt();
        if(n==0){
            System.out.println("Exiting...");
        }
        else if(n==1){
            System.out.print("Enter How Many Marks You Enter : ");
            int a = sc.nextInt();
            for(int i=1;i<=a;i++){
                System.out.print("Enter Marks : ");
                int marks = sc.nextInt();
                if(marks>=90 && marks<=100){
                    System.out.println("Excellent");
                }
                else if(marks>=60 && marks <=89){
                    System.out.println("Good");
                }
                else if(marks>=0 && marks<=59){
                    System.out.println("Marks Not Matter");
                }
                else{
                    System.out.print("Invalid");
                }
            }
        }
        else{
            System.out.println("Invalid");
        }
        sc.close();
    }
}
