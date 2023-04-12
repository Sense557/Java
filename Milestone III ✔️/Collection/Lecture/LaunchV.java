import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 *      Vector Legacy Class
 * 
 */




public class LaunchV 
{
    public static void main(String[] args) 
    {
        Vector v = new Vector();

        v.add(100);
        v.add(200);
        v.add(300);
        v.add(400);

        System.out.println(v);


        //Using Enumeration
        // Enumeration en = v.elements();

        // while(en.hasMoreElements())
        // {
        //     System.out.println(en.nextElement());
        // }


        //Using Iterator
        // Iterator itr = v.iterator();

        // while(itr.hasNext())
        // {
        //     System.out.println(itr.next());
        // }
    }
}
