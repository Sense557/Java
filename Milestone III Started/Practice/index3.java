package Practice;
import java.util.*;
import java.util.LinkedHashSet;

public class index3 
{
    public static void main(String[] args) 
    {
        HashSet hs = new HashSet();
        hs.add(300);
        hs.add(500);
        hs.add("PW");

        System.out.println(hs);

        Iterator itr = hs.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next()+" ");
        }
        

        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add(300);
        lhs.add(500);
        lhs.add("PW");

        System.out.println(lhs);

    }
}
