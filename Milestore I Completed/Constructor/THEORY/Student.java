package THEORY;

public class Student {
    private int age;
    private String name;


    //How to make constructor method replacing the setters only and passing the value in obj
    Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    // void setAge(int age){
    //     this.age = age;
    // }

    // void setName(String name){
    //     this.name = name;
    // }

    int getAge(){
        return age;

    }
    
    String getName(){
        return name;
    }

    public static void main(String[] args) {
        Student obj = new Student(18,"Rahul");

    //    obj.setAge(60);
    //    obj.setName("Jyotsnamayee");

       int stud1Age = obj.getAge();
       String stud1Name = obj.getName();

       System.out.println(stud1Age);
       System.out.println(stud1Name);
    }
}