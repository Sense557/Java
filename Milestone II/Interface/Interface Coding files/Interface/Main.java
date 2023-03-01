package Interface;

interface Computer
// abstract class Computer
{
    public void compileCode();
    // abstract void compileCode();
}

class Laptop implements Computer
{
    public void compileCode()
    {
        System.out.println("You got 5 errors");
    }
}

class Desktop implements Computer
{
    public void compileCode()
    {
        System.out.println("You got 5 errors, faster");
    }
}

class Developer
{
    void buildApp(Computer obj)
    {
        System.out.println("Building an app");

        obj.compileCode();
    }
}

public class Main {
    public static void main(String[] args) {
        // Laptop obj = new Laptop();
        Computer obj = new Desktop();
        Developer dev = new Developer();
        dev.buildApp(obj);
         
    }
}
