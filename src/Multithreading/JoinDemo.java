package Multithreading;

class JoinTest implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<5;i++)
        {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class JoinDemo {

    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(new JoinTest(),"Shadi-Venue");
        t1.start();
        t1.join(); //main thread
        System.out.println("Shadi Card print...");

    }
}
