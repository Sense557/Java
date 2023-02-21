//SINGLE LEVEL INHERITANCE


class Human
{
    int age;
    void sleep ()
    {
        age = 18;
        System.out.println("Human need sleep");
        System.out.println(age);
    }
}

class Student extends Human
{

}


public class inheritance1 
{

    public static void main(String[] args) 
    {
        Student obj = new Student();
        obj.sleep();
        
    }
}