package Interface;

interface Car
{
    void drive ();

}
// //because only to do implemt the behaviour why will we make a class
// //we need to maintain it so go for anonymous inner class
// class WagonR implements Car
// {
//     public void drive()
//     {
//         System.out.println("Driving......");
//     }
// }


public class AIC {
    public static void main(String[] args) {

        // Car obj = new WagonR();

        Car obj = new Car()
        {
            public void drive()
            {
                System.out.println("Driving....");
            }
        };
        obj.drive();

        
    }
}
