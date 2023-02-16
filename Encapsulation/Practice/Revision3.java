package Practice;

class Student2
{
    private String name;
    private int age;
    void setData(int a)
    {
        age = a;
    }
    void setData1()
    {
        name = "Rahul";
    }

    

    void disp()
    {
        System.out.println(name+ " "+age);
    }
}
public class Revision3 
{
    public static void main(String[] args) 
    {
        Student2 obj = new Student2(); 
        obj.setData(20);   
        obj.disp();

        Student2 obj2 = new Student2();
        obj2.setData(15);  
        obj2.disp();
        
    }
}
