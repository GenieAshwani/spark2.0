package Multithreading;

class SumTest implements Runnable{

     static int sum=0;
    @Override
    public void run() {
        for (int i=0;i<5;i++)
        {
            //1+2+3+4=
            sum=sum+i;
        }
    }
}
public class SumDemo {

    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(new SumTest(),"Sum1");
        Thread t2=new Thread(new SumTest(),"Sum2");
        t1.start();  //main--->multi
        t1.join();
    }
}
