package Practice;

class Student5
{
    private String name;
    private int age;
    void setData(int age)
    {
        //this just created a new object 
        //but we wanted the same object so to solve this we need use "this" keyword
        this.age = age;
    }
    void setData1(String name)
    {
        this.name = name;
    }

    void disp()
    {
        System.out.println(name+ " "+age);
    }
}
public class Revision5 
{
    public static void main(String[] args) 
    {
        Student5 obj = new Student5(); 
        obj.setData(20);
        obj.setData1("Rahul");
        obj.disp();

        Student5 obj2 = new Student5();
        obj2.setData(15);
        obj2.setData1("Kiran");  
        obj2.disp();
        
    }
}
