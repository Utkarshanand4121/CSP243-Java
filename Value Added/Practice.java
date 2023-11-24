class Number {
    void sum(int a, int b) {
        System.out.println("Sum is : "+(a+b));
    }
    void sum(int a, int b, int c) {
        int sum2 = a+b+c;
        System.out.println("Sum2 is :" +sum2); 
    }
    void res() {
        System.out.println("Required result is of sumation");
    }
}
class Mul extends Number {
    void mul(int a, int b) {
        System.out.println("Multiplication is : "+(a*b));
    }
    void res() {
        System.out.println("Required result is of multiplication");
    }
}


public class Practice {
    public static void main(String[] args) {
        Number n1 = new Number();
        n1.sum(5, 10);
        n1.sum(5, 10, 15);
        n1.res();
        Mul m1 = new Mul();
        m1.mul(5, 2);
        m1.res();
    }
}
