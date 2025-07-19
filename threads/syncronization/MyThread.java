package threads.syncronization;


/*

    Adding static before variable and method
    yesto garda hamle instance banai rakhna parena direct
    classname bata call garna pauxa
    sajilo hunxa bhanera static thapeko hai

*/

class Counter {
    static int count = 0;

    static synchronized  void increment() {
        count++;
    }
}


class MyThread extends Thread {
    public void run() {
        for(int i=1; i<=5; i++) {
            Counter.increment();
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start(); // starts t1 thread
        t2.start(); // starts t2 thread
    }
}

