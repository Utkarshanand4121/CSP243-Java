import java.util.*;
public class Exp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the num2: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.print("Sum of two num is : "+sum);
        System.out.println();
        int pro = num1 * num2;
        System.out.print("Product of two num is: "+pro);
        System.out.println();
        int div = num1 / num2;
        System.out.print("Divide of two num is: "+div);
        System.out.println();
        int mod = num1 % num2;
        System.out.print("Modulus of two num is: "+mod);
        System.out.println();
    }
}
