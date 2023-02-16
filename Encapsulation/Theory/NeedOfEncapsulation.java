

class Student{

    private int age;
    private String name;

   

    public int getAge() {
        return age;
    }



    public void setAge(int age) {
        this.age = age;
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    void show(){
        System.out.println(age + " " + name );
    }

}

public class NeedOfEncapsulation {

    public static void main(String[] args) {
        
        Student obj = new Student();
        Student obj1 = new Student();
    
        obj.setAge(15);
        obj1.setAge(30);
        obj.setName("Sachin");
        obj1.setName("Rahul");
        int stud1Age = obj.getAge();
        System.out.println(stud1Age);        
        
    }
}