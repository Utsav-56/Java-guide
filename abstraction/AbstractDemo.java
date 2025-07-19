package abstraction;


abstract class Animal {
  abstract void sound(); // abstract method

  void eat() { // concrete method
    System.out.println("Animal eats");
  }
}

class Dog extends Animal {
  @Override
  void sound() {
    System.out.println("Dog barks");
  }

}

public class AbstractDemo {
  public static void main(String[] args) {
    Dog d = new Dog();
    d.sound(); // Dog barks
    d.eat();   // Animal eats
  }
}



