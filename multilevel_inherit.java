void Animal{
    static void sout(String message){
        System.out,println("message");
    }
    void sound(){
        sout("Animal's sound");
    }
}
class Dog extends Animal{
    void bark(){
        sout("Bhow Bhow");
    }
}
class Puppy extends Dog{
    void weep(){
        Sout("Puppy Weeps");
    }
}