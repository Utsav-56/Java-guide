class Animal{

    static void sout(String msg){
        System.out.println(msg);
    }

    void sound(){
        sout("Animal makes sound");
    }

}


class Dog extends Animal{
    @Override
    void sound(){
        sout("Dog barks");
    }

}


class PolyDemo{
    public static void main(String[] args)
    {
        Animal a = new Animal();
        a.sound();

        Dog d = new Dog();
        d.sound();
    }
}







class Cat extends Animal{

    @Override
    void sound(){
        sout("Cat meows");
    }

}

class Cow extends Animal{
    //pass
}


class Test2{
    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.sound();

        Cat c = new Cat();
        c.sound();

        Cow c2 = new Cow();
        c2.sound();
        
    }
}