package inheritance;

// Parent class
class Animal {
  void sound() {
    System.out.println("Animal makes sound....");
  }
}

// Child class
class Dog extends Animal {
  void bark() {
    System.out.println("Dog barks....");
  }
}

public class InheritanceDemo {
  public static void main(String[] args) {
    Dog d = new Dog();
    d.sound(); // inherited from Animal
    d.bark(); // Dog's own method
  }
}




