//using runnable interface
class myThread_ implements Runnable {
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println("in runnable interface thread:" + i);
    }
  }
}

// using Thread class
class myThread extends Thread {
  public void run() {
    System.out.println("test task ");
    for (int i = 0; i < 10; i++) {
      System.out.println("in t thread:" + i);
    }
  }
  // System.out.println(Thread.currentThread().getName());
}

public class simpleThread {
  public static void main(String[] args) {
    // using Thread class
    myThread t = new myThread();
    t.start();
    // using runnable interface
    myThread_ t_ = new myThread_();
    Thread tt = new Thread(t_);
    tt.start();
    System.out.println("main task ");
    for (int i = 0; i < 10; i++) {
      System.out.println("in main thread:" + i);
    }

    System.out.println(t.getName());
    System.out.println(tt.getName());
    System.out.println(Thread.currentThread().getName());

  }
}