package Multithreading;


class Counter
{
    private int count=0;
    public synchronized void incre()
    {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class CounterThread extends Thread
{
    private Counter counter;
    CounterThread(Counter counter)
    {
        this.counter=counter;
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++)
        {
            System.out.println(Thread.currentThread());
            counter.incre();

        }
    }
}
public class ClounterTest {
    public static void main(String[] args) throws InterruptedException {
        Counter counter=new Counter();

        Thread t1=new CounterThread(counter);
        Thread t2=new CounterThread(counter);
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("final count = "+ counter.getCount());
    }
}
