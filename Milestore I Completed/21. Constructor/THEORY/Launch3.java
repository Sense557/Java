package THEORY;


//Constructor overloading
class Student1{
    private String name;
    private int age;

    Student1(){
        System.out.println("This is default constructor called");
        name = "Rohan";
        age = 18;
    }
    Student1(String name){
        this.name = name;
        age = 19;
    }
    Student1(String name, int age){
        this.name = name;
        this.age = age;
    }
    void disp(){
        System.out.println(name);
        System.out.println(age);
    }
}

public class Launch3 {

    public static void main(String[] args) {
        Student1 stud1 = new Student1();
        stud1.disp();

        Student1 stud2 = new Student1("Rahul");
        stud2.disp();

        Student1 stud3 = new Student1("Rohit", 19);
        stud3.disp();
    }
}
