package Practice;

import java.util.TreeSet;

/**
 *  TreeSet
 *      Note-
 *          - Duplicates not allowed
 *          - Binary Search is fast
 *          - Sorted Order
 */


public class index4 
{
    public static void main(String[] args) 
    {
        TreeSet ts = new TreeSet();
        ts.add(100);
        ts.add(200);
        ts.add(300);
        ts.add(25);
        ts.add(30);
        ts.add(80);
        ts.add(90);
        

        ts.ceiling(10);
        ts.floor(20);
        ts.higher(50);
        ts.lower(30);
        ts.add(100);
        System.out.println(ts);

        // character  and string is not allowed
        // ts.add("Java");

        System.out.println(ts);

    }
}
