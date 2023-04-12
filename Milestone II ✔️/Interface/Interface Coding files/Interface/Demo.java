package Interface;

interface C
{
    // public static final int num = 6;  //by default it is printing this 
    // You cannot change the value as it is final by default
    
    
    int num = 6;


    // public void show();             // by default it is printing this
    // you cannot define the method as it is abstract by default 

    void show();
     
}



public class Demo 
{
    public static void main(String[] args) 
    {
        // interface obj = new interface();     // cannot create object then how to access the value
        
        // System.out.println(A.num);

        // C.num = 8;                              //  Giving error as it is final by default
        // C obj = new A();                         //  cannot create object then how to access the value

        
    }    
}
