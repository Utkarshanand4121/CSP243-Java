abstract class Shape {
    
    void printArea() {
    }
}

class Rectangle {
    int leng;
    int brea;
    void getInfo(int leng , int brea) {
        this.leng = leng;
        this.brea = brea;
    }
    void printArea() {
        System.out.println("Area of rectangle: "+leng*brea);
    }
}

class Triangle {
    int side1;
    int side2;
    int side3;
    void getInfo2(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    void printArea() {
        System.out.println("Area of triangle : "+(side1+side2+side3)/3);
    }
}

class Circle {
    int r;
    void getInfo3(int r) {
        this.r = r;
    }
    void printArea() {
        System.out.println("Area of circle : "+3.14*r);
    }
}
public class Exp9 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.getInfo(10, 5);
        r.printArea();
        Triangle t = new Triangle();
        t.getInfo2(5, 3, 2);
        t.printArea();
        Circle c = new Circle();
        c.getInfo3(2);
        c.printArea();
    }
}
