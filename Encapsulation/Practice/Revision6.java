package Practice;

class Student6
{
    private String name;
    private int age;

    void setAge(int age)
    {
        this.age = age;
    }
    int getAge()
    {
        return age;
    }


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
public class Revision6 
{
    public static void main(String[] args) 
    {
        Student6 obj = new Student6(); 
        obj.setData(20);
        obj.setData1("Rahul");
        obj.disp();

        Student6 obj2 = new Student6();
        obj2.setData(15);
        obj2.setData1("Kiran");  
        obj2.disp();

        int stud6Age = obj.getAge();
        System.out.println(stud6Age);
        
    }
}
