
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void speak() {
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal {
    
    Dog(String name) {
        super(name); 
    }

    // @Override
    void speak() {
        super.speak(); 
        System.out.println("Dog barks");
    }

    void displayInfo() {
        System.out.println("Name: " + this.name);
    }
}

public class ThisSuper {

    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");
        myDog.displayInfo();
        myDog.speak();
    }
}
