import java.util.*;
public class Voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age : ");
        int n = sc.nextInt();
        if(n>=18){
            System.out.println("Elegible");
        }
        else{
            System.out.println("Not");
        }
        sc.close();
    }
}
