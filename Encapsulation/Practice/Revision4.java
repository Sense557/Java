package Practice;

class Student4
{
    private String name;
    private int age;
    void setData(int age)
    {
        //this just created a new object 
        //but we wanted the same object so to solve this we need use "this" keyword
        Student4 obj = new Student4();
        obj.age = age;
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
public class Revision4 
{
    public static void main(String[] args) 
    {
        Student4 obj = new Student4(); 
        obj.setData(20);   
        obj.disp();

        Student4 obj2 = new Student4();
        obj2.setData(15);  
        obj2.disp();
        
    }
}
