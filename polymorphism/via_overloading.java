class OverloadingEg{
    void greet(String name){
        System.out.println("Hello " + name + "!");
    }
    void greet(int times){
        do{
            System.out.println("Hello!");
        }while(--times>0);
    }
    void greet(String name, int times){
        do{
            greet(name);
        }while(--times>0);
    }
}
class Test{
    public static void main(String[] args){
        OverloadingEg ole = new OverloadingEg();
        ole.greet("Utsav");
        ole.greet(5);
        ole.greet("Utsav",5);
    }
}