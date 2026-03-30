package Function;
import java.util.*;
public class Count_type {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        int zeros = 0;
        System.out.print("Enter How Many Number You Enter : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print("Enter Number : ");
            int num = sc.nextInt();
            if(num <0)
                negative++;
            else if(num>0)
                positive++;
            else
                zeros++;
        }
        System.out.println("Positive :"+positive);
        System.out.println("Negative :"+negative);
        System.out.println("Zeros :"+zeros);
        sc.close();
    }
}
