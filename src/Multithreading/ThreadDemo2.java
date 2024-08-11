package Multithreading;

class MyThread implements Runnable
{
    @Override
    public void run() {
        for (int i=0;i<5;i++)
        {
            System.out.println(Thread.currentThread());
            System.out.println("child thread:");
        }
    }
}
public class ThreadDemo2 {
    public static void main(String[] args) {
        Thread t=new Thread(new MyThread());
        t.setName("genie");
        t.start();

        for (int i=0;i<5;i++)
        {
            System.out.println(Thread.currentThread());
            System.out.println("main thread:");
        }
    }
}
