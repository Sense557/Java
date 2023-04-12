package THEORY;
class Student2{
    private String name;
    private int age;

    Student2(){
        // super();
        this("Rohit", 19);
        System.out.println("THIS IS DEFAULT CONSTRUCTOR CALLED");
        name = "ROHAN";
        age = 18;
    }
    Student2(String name){
        this();
        this.name = name;
        age = 19;
    }
    Student2(String name, int age){
        this.name = name;
        this.age = age;
    }
    void disp(){
        System.out.println(name);
        System.out.println(age);
    }
    
}
public class Launch4 {
    public static void main(String[] args) {
        Student2 stud1 = new Student2();
        stud1.disp();

        Student2 stud2 = new Student2("Rustam");
        stud2.disp();
    }
}
