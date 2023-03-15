/**
 *  Synchronized Keyword
 */
class Car implements Runnable
{
    public void run()
    {
        
        try{
            System.out.println(Thread.currentThread().getName()+"  has entered the parking lot" );
            Thread.sleep(2000);

            synchronized(this)
            {
                System.out.println(Thread.currentThread().getName()+" Got into the car" );
                Thread.sleep(2000);

                System.out.println(Thread.currentThread().getName()+" Driving the car" );
                Thread.sleep(2000);

                System.out.println(Thread.currentThread().getName()+" Come back & Parked the car" );
                Thread.sleep(2000);
            }

        }

        catch(Exception e)
        {
            System.out.println("Something went wrong");
        }
    
    }
}


public class Synchronize {
    public static void main(String[] args) 
    {
        Car c = new Car();

        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(c);

        t1.setName("SON-1");
        t2.setName("SON-2");
        t3.setName("SON-3");

        t1.start();
        t2.start();
        t3.start();
        
    }
}
