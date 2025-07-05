class MyThread implements Runnable{
    public void run(){
        System.out.println("Thread has started ");
        for(int i = 0; i<10; i++){
            System.out.println("Doing Something" +i);
        }
    }
}
class Main{
    public static void main(String[] args){
        Thread thread2 = new Thread(new myThread());
        thread2.start();
    }
}