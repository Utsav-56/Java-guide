package threads;

class MyThread extends Thread {
  public void run() {
    for(int i=1; i<=5; i++) {
//      System.out.printf("%d from thread %s \n", i, this.getName());
      System.out.println(i + " from " + this.getName());
    }
  }

  public static void main(String[] args) {
    MyThread t1 = new MyThread();
    MyThread t2 = new MyThread();
    t1.start(); // starts t1 thread
    t2.start(); // starts t2 thread
  }
}




class MyRunnable implements Runnable {
  public void run() {
    for(int i=1; i<=5; i++) {
      System.out.println( i + "task doing using threading");
    }
  }

  public static void main(String[] args) {
    MyRunnable r = new MyRunnable();
    Thread t1 = new Thread(r);
    Thread t2 = new Thread(r);
    t1.start();
    t2.start();
  }
}



