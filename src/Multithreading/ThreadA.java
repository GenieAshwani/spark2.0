package Multithreading;

public class ThreadA {
    public static void main(String[] args) throws InterruptedException {

        ThreadB b=new ThreadB();
        b.start();
        synchronized (b)
        {
            System.out.println("main thread is waiting for calculation");
            b.wait();
            System.out.println("main thread got notification");
            System.out.println("total is = "+b.total);
        }
    }
}

class ThreadB extends Thread{
    int total=0;

    @Override
    public void run() {
        synchronized (this)
        {
            System.out.println("child thread starts cal :");
            for (int i=0;i<100000;i++)
            {
                total=total+i;
            }
            System.out.println("child thread giving notification call");
            this.notify(); ///this.notifyAll()
        }
    }
}
