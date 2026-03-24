package Basics;
import java.util.*;
public class area_circle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius Of Circle : ");
        int r = sc.nextInt();
        double area = 3.14*r*r;
        System.out.print("Area Of Circle Is : "+area);
        sc.close();
    }
}
