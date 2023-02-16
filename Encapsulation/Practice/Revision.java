package Practice;

class Student
{
    String name;
    int age;

    // void detials()
    // {
    //     name = "Amar";
    //     age = 20;
    // }

    // void detials1()
    // {
    //     name = "Raja";
    //     age = 30;
    // }
    void disp()
    {
        System.out.println(name+ " "+age);
        
    }
}
public class Revision 
{
    public static void main(String[] args) 
    {
        Student obj = new Student();
        // obj.detials();
        obj.name = "Alok";
        obj.age = 20;
        obj.disp();

        // Student obj1 = new Student();
        // obj1.detials1();
        // obj1.disp();
    }
}
