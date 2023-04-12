/**
 *  Interrupt Method
 */

 
class MyThread implements Runnable{
    public void run()
    {
        for(int i=0; i<3; i++)
        try
        { 
            System.out.println("*");
            Thread.sleep(3000);
        }
        catch (InterruptedException e)
        {
            System.out.println("interrupted");
        }
    }
}

public class Interrupt {
    public static void main(String[] args) {

        MyThread m = new MyThread();

        Thread t = new Thread(m);

        t.start();
        t.interrupt();
        
    }
}
