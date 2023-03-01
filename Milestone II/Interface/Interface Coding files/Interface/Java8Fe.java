package Interface;

interface Z
{
    void show();
    default void abc()
    {
        System.out.println("In abc");
    }
    static void config()
    {
        System.out.println("In config");
    }
}

class S implements Z
{
    public void show()
    {
        System.out.println("in show");
    }
}




public class Java8Fe {
    public static void main(String[] args) {
        Z.config();
        Z obj = new S();
        obj.show();

        
    }
}
