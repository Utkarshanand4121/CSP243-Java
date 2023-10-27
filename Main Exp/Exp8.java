class Parent {
    void child() {
        System.out.println("Have 2 child");
    }
    void eat() {
        System.out.println("Eat throw hand");
    }
}

class Child1 extends Parent {
    String name;
    int age;

    void getInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void setInfo() {
        System.out.println(this.name+ " is " +this.age+" year old ");
    }
}
public class Exp8 {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        p1.child();
        Child1 c1 = new Child1();
        c1.getInfo("Ram", 10);
        c1.setInfo();
    }
    
    
}
