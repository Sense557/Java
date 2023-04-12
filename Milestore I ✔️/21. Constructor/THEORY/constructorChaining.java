class Person 
{
    private String name;
    private int age;
  
    public Person(String name) 
    {
      this(name, 0);
    }
  
    public Person(String name, int age) 
    {
      this.name = name;
      this.age = age;
    }
    void disp(){
      System.out.println(name);
      System.out.println(age);
    }
  }
  
  public class constructorChaining 
  {
  
    public static void main(String[] args) {
      Person obj = new Person("Rohit");
      obj.disp();
    }
  }
  