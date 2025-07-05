class Animal{
    static void sout(String msg){
        System.out.println(msg);
    }
    void sound(){
        sout("Animal makes sound");
    }
}
class Dog extends Animal{
    @override
    void sound(){
        sout("Dog barks");
    }
}
class Cat extends Animal{
    @override
    void sound(){
        sout("Cat meows");
    }
}
class Test{
    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.sound();

        Cat c = new Cat();
        
    }
}