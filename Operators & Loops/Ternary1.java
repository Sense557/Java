
public class Ternary1
{
    public static void main(String[] args) 
    {
        int a = 30;
        int b = 20;
        int c = 40;
        int res = (a<b)? a : b;
        System.out.println(res);  //20

        String res1 = (a<b)?"a is less":"b is less";  
        System.out.println(res1);    //b is less

        int res2 = (a<b)? (a<c? a:c) : (b<c? b:c);  
        System.out.println(res2);       //20

        // if (a<b) {
        //     if (a<c) 
        //     {
        //         System.out.println(a);
        //     }
        //     else
        //     {
        //         System.out.println(c);
        //     }
        // }
        // else 
        //     if (b<c) 
        //     {
        //         System.out.println(b);
        //     }
        //     else 
        //     {
        //         System.out.println(c);
        //     }
        
        }
    }
