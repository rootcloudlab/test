package test;



// 1. ABSTRACTION
abstract class Animal {

    // Abstract method
    abstract void sound();

    // Normal method
    void eat() {
        System.out.println("Animal is eating");
    }
}

// 2. INHERITANCE
class Dog extends Animal {

    // 3. POLYMORPHISM (Method Overriding)
    @Override
    void sound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

class Cat extends Animal {

    // 3. POLYMORPHISM (Method Overriding)
    @Override
    void sound() {
        System.out.println("Cat says: Meow Meow!");
    }
}

// 4. ENCAPSULATION
class Student {

    // Private data members
    private String name;
    private int age;

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Main class
public class hello {

    public static void main(String[] args) {

        // Demonstrating Encapsulation
        Student s = new Student();
        s.setName("Rahul");
        s.setAge(20);

        System.out.println("ENCAPSULATION:");
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());

        // Demonstrating Inheritance
        Dog d = new Dog();

        System.out.println("\nINHERITANCE:");
        d.eat();

        // Demonstrating Polymorphism
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        System.out.println("\nPOLYMORPHISM:");
        a1.sound();
        a2.sound();

        // Demonstrating Abstraction
        System.out.println("\nABSTRACTION:");
        Animal animal = new Dog();
        animal.sound();
    }
}


