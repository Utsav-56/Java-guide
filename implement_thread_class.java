class MyThread extends Thread{
    public void run(){
        for(int i=0; i<30; i++){
            System.out.println("Threading something");
        }
    }
    
}
class Main{
    public static void main(String[] args){
        MyThread thread1 = new MyThread();
        thread1.start()l;
    }
}