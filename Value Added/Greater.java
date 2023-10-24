import java.util.*;
public class Greater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the num2: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the num3: ");
        int num3 = sc.nextInt();

        if(num1>num2 && num1>num3) {
            System.out.println(num1 + " is greater");
        } else if(num2>num1 && num2>num3) {
            System.out.println(num2+ " is greater");
        } else if(num3>num1 && num3>num2) {
            System.out.println(num3 + " is greater");
        } else {
            System.out.println("All are equal");
        }
    }
}
