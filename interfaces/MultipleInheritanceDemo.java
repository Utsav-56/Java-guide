package interfaces;

interface Sleepable{
    void sleep();
}

interface Eatable{
    void eat();
}

class Animal implements Sleepable, Eatable{
    @Override
    public void sleep(){
        System.out.println("Sleeping");
    }

    @Override
    public void eat(){
        System.out.println("Eating");
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sleep();
        a.eat();
    }
}




