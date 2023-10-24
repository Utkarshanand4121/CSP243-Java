import java.util.Scanner;

public class Pallindrome {
    public static boolean pallindrome(int num) {
        int originalNum = num;
        int lastdigit;
        int reverseNum = 0;
        while(num>0) {
            lastdigit = num%10;
            reverseNum = (reverseNum*10) + lastdigit;
            num = num/10;
        }

        return reverseNum == originalNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num1: ");
        int num = sc.nextInt();
        System.out.println(pallindrome(num));
    }
}
