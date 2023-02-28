package Interface;


interface A
{
    
    void show();

}
interface X
{
    
    void show2();

}



class B implements A,X
{
    public void show()
    {
        System.out.println("in show");
    }
    public void show2()
    {
        System.out.println("in show2");
    }
}




public class Demo1 {
    public static void main(String[] args) {
        // A obj = new A();
        // obj.show();
        // System.out.println(A.show);
        B obj = new B();
        obj.show();
        obj.show2();
        

        
        
    }
}
