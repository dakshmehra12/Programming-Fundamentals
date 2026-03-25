import java.util.*;
public class Switch_Case_Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Choice :");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Ram Ram");
                break;
            default:
                System.out.println("Invalid");
        }
        sc.close();
    }
}
