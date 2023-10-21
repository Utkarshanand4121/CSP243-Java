import java.util.*;
public class Exp3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int num1 = sc.nextInt();
        if(num1 %2 == 0) {
            System.out.print(+num1+" is a Even num");
        } else{
            System.out.print(+num1+" is a Odd num");
        }
    }
}
