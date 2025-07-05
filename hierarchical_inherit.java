class Animal{
    String name="Animal";
    void sound(){
        System.out.println("Animal's Sound");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks");
    }

}
class Cat extends Animal{
    void meow(){
        System.out.println("Cat meows");
    }
}