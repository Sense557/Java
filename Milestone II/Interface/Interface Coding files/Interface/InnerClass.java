package Interface;

class Y
{
    int age;
    String name;
    // String city;
    // String pincode;
    
    Address add;
    class Address
    {
        String city;
        String pincode;
    }
    void show ()
    {
        System.out.println("in outer");
    }
    // static class M
    class M
    {
        void abc()
        {
            System.out.println("in abc");
        }
    }
}



public class InnerClass {
    public static void main(String[] args) {
        Y obj = new Y();
        obj.show();
        
        // Y.M obj1 = new Y.M();
        Y.M obj1 = obj.new M();
        obj1.abc();
    }
}
