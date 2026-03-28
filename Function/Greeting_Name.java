package Function;
import java.util.*;
public class Greeting_Name {
    public static void Greet(String name) {
        System.out.print("Good Morning "+name);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String name = sc.nextLine();
        Greet(name);
        sc.close();
    }
}
