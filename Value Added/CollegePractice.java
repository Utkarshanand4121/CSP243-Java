class Number{
    // Method Overloading
    void sum(int a, int b) {
        System.out.println("Sum is: "+(a+b));
    }
    void sum(int a, int b, int c) {
        System.out.println("Sum is: "+(a+b+c));
    }
}
// Method Overriding
class Animal{
    void eat() {
        System.out.println("Eat every thing");
    }
}
class Deer{
    void eat() {
        System.out.println("Eat only grass");
    }
}
// Single inheritance
class Number2{
    void arthimetic() {
        System.out.println("Arthimetic Operation");
    }
}
class Sum extends Number2 {
    void sum() {
        super.arthimetic();
        System.out.println("Sumation of any number");
    }
}
// Hierarchial inheritance
class MulSum extends Number2 {
    void mul() {
        super.arthimetic();
        int a = 5;
        int b = 4;
        int mult = a*b;
        System.out.println(mult);
    }
}

class Parents{
    String name;
    int children;
    void setDetails(String name, int children) {
        this.name = name;
        this.children = children;
    }
    void getDetails() {
        System.out.println("Parent name is : "+this.name+" , No. of children = "+this.children);
    }
    void remarks() {
        System.out.println("My parents is best");
    }
}
class Childr extends Parents{
    int count;
    void details(int count) {
        this.count = count;
    }
    void get() {
        System.out.println("No of children of child class = "+this.count);
        super.remarks();
    }
}

// Question no = 10(a)
interface A1 {
    int constantA = 50;
}
interface A2 {
    int constantA2 = 100;
}
interface A12 extends A1,A2 {
    int constant = 75;
}
class B implements A12 {
    int constant2 = 70;

    void method1() {
        System.out.println("Method1 is called");
    }

    void method2() {
        System.out.println("Method2 is called");
    }
}

// Question no = 10(b)
interface Vehicle{
    void stop();
    void start();
}
interface Luxury{
    void parking();
}
class Car implements Vehicle,Luxury {
    @Override
    public void stop() {
        System.out.println("Stop the car when traffic signal is red");
    }
    @Override
    public void start() {
        System.out.println("Start the car when traafic signal is green");
    }
    @Override
    public void parking() {
        System.out.println("Park the car in right place");
    }
}

// Question no = 9(a)
class Integer {
    int num;
    char c;

    void name(int num, char c) {
        System.out.println("Number is = "+num+" Character is = "+c);
    }

    void name(char c, int num) {
        System.out.println("Character is = "+c+" Number is = "+num);
    }
}

// Question no = 11(b)
class Example{
    static int count = 0;

    static void display() {
        System.out.println("Static method");
    }

    static{
        System.out.println("Static block");
    }
}

// Question no = 12(a)
class Even{
    void evenNum() {
        for(int i=1; i<=100; i++) {
            if(i%2==0) {
                System.out.print("Even Number = "+i);
            }
            System.out.println();
        }
    }
}
public class CollegePractice {
    public static void main(String[] args) {
        // Number n1 = new Number();
        // n1.sum(5, 10);
        // n1.sum(5, 10, 15);
        // Animal a1 = new Animal();
        // a1.eat();
        // Deer d1 = new Deer();
        // d1.eat();
        // MulSum m1 = new MulSum();
        // m1.mul();

        // String 
        // String str1 = "abc";
        // String str2 = "abcdefgh";
        // System.out.println(str1.equals(str2));
        // System.out.println(str1 == str2);

        // String str3 = new String("abc");
        // System.out.println(str1 == str3);

        // System.out.println(str1 + str2);
        // System.out.println(str1.replace("a", "b"));
        // System.out.println(str1.length());
        
        // System.out.println("str2 index number 2 having character is : "+str2.charAt(1));
        // System.out.println(str1.compareTo(str2));

        // Parents p1 = new Parents();
        // p1.setDetails("Utkarsh", 2);
        // p1.getDetails();
        // Childr c1 = new Childr();
        // c1.details(2);
        // c1.get();

        // B b1 = new B();
        // b1.method1();
        // b1.method2();

        // Car c1 = new Car();
        // c1.start();
        // c1.stop();
        // c1.parking();

        // Integer i = new Integer();
        // i.name(5, 'U');
        // i.name('A', 10);

        // Example e1 = new Example();
        // Example.display();
        // System.out.println("Count = "+Example.count);
        Even e1 = new Even();
        e1.evenNum();
    }
}
