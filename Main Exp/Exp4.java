import java.util.*;
public class Exp4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the num2: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the num3: ");
        int num3 = sc.nextInt();
        if(num2 > num1 && num3 > num2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
