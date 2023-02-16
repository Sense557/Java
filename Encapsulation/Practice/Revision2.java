package Practice;

class Student1
{
    private String name;
    private int age;
    void setData()
    {
        age = 18;
        name = "Rahul";
    }
    void disp()
    {
        System.out.println(name+ " "+age);
    }
}
public class Revision2 
{
    public static void main(String[] args) 
    {
        Student1 obj = new Student1(); 
        obj.setData();   
        obj.disp();
    }
}
