/**
 *  join () & isAlive() Method
 */

 
class Printing implements Runnable{
    public void run()
    {
        System.out.println("Example 2 (Printing) Task Started **********************");

        try 
        {
            for(int i=0; i<3; i++) 
            {
                System.out.println("*");
                Thread.sleep(3000);
            }
        } 
        catch (Exception e) 
        {
            System.out.println("Something went wrong");
        }
        System.out.println("Example 2 (Printing) Task Ended **********************");
    }
}


public class LaunchMulti1{
    public static void main(String[] args) throws Exception{

        Printing p = new Printing();

        Thread t1 = new Thread(p);

        System.out.println(t1.isAlive()); 

        t1.start();
        System.out.println(t1.isAlive()); 

        t1.join();
        



    }
}

    