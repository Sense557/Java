// HERIRARCHICAL LEVEL INHERITANCE

class Animal   //extends object
{
    void sleep ()
    {
        System.out.println("Animal need sleep");
    }
}
class Tiger extends Animal
{

}
class Monkey extends Animal
{

}
class Deer extends Animal
{

}

public class inheritance4 {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.sleep();      //Animal need sleep
        



        Animal a = new Animal(); //extends object behind the scene 
        a.toString();
        
    }
}

