package inheritance.superuse;

class Animal {
  void sound() {
    System.out.println("Animal makes sound.....");
  }

}

class Dog extends Animal {
  @Override
  void sound() {
    System.out.println("Dog makes barking sound.....");
  }

  void printEat() {
    super.sound(); // calls parents class sound() method
    sound(); // calls Dog's sound()
  }
}

public class SuperDemo {
  public static void main(String[] args) {
    Dog d = new Dog();
    d.printEat();
  }
}

