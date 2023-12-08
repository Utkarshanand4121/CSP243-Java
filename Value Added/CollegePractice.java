import java.util.Scanner;

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

// Creating threads by extending thread class
class MyThread1 extends Thread {
    public void run() {
        System.out.println("Starting Thread1");
    }
}

class MyThread2 extends Thread {
    public void run() {
        System.out.println("Starting Thread2");
    }
}

// Creating thread using interface
class MyThreadRunnable1 implements Runnable{
    public void run() {
        System.out.println("Thread 1 is executing -- by interface");
    }
}

class MyThreadRunnable2 implements Runnable{
    public void run() {
        System.out.println("Thread 2 is executing -- by interface");
    }
}

public class CollegePractice {
    public static void main(String[] args) {
        

        // Example e1 = new Example();
        // Example.display();
        // System.out.println("Count = "+Example.count);
        // Even e1 = new Even();
        // e1.evenNum();

        // MyThread1 m1 = new MyThread1();
        // m1.start();
        // MyThread2 m2 = new MyThread2();
        // m2.start();

        // MyThreadRunnable1 t11 = new MyThreadRunnable1();
        // Thread t1 = new Thread(t11);
        // MyThreadRunnable2 t12 = new MyThreadRunnable2();
        // Thread t2 = new Thread(t12);

        // t1.start();
        // t2.start();

        // int a = 60;
        // int b = 0;
        // try {
        //     int c = a/b;
        //     System.out.println(c);
        // } catch (Exception e) {
        //     System.out.println("Not able to divide");
        // }
        // System.out.println("End of the program");

        int marks[] = new int[3];
        marks[0] = 56;
        marks[1] = 2;
        marks[2] = 3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index: ");
        int ind = sc.nextInt();

        System.out.println("Enter the num: ");
        int num = sc.nextInt();

        try {
            System.out.println("Marks = "+marks[ind]);
            System.out.println("After divide by num = "+marks[ind]/num);
        } catch (ArithmeticException e) {
            System.out.println("AE occured");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("AIBE occured");
        } catch (Exception e ) {
            System.out.println("Some exception occured");
        }
    }
}
