package Multithreading;

class PriorityTest implements  Runnable{
    @Override
    public void run() {
        for (int i=0;i<5;i++)
        {
            System.out.println(Thread.currentThread());
        }
    }
}
public class PriorityDemo {
    public static void main(String[] args) {

        Thread t1=new Thread(new PriorityTest(),"Thread-1");
        Thread t2=new Thread(new PriorityTest(),"Thread-2");
        System.out.println("t1 ki priority = "+t1.getPriority());
        System.out.println("t2 ki priority = "+t2.getPriority());

        //t1.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(1);
        System.out.println("t1 ki priority = "+t1.getPriority());
        t1.start();
        t2.start();
        for (int i=0;i<5;i++)
        {
            System.out.println(Thread.currentThread());
        }
    }
}
