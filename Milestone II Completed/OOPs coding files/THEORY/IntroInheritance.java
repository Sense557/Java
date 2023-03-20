package THEORY;
class Aeroplane
{
    public void takeOff()
    {
        System.out.println("Aeroplane is taking off");
    }
    public void fly()
    {
        System.out.println("Aeroplane is flying");
    }

}
class CargoPlane extends Aeroplane
{

}
class PassengerPlane extends Aeroplane
{
    public void fly ()
    {
        System.out.println("PassengerPlane is flying");
    }
    public  void landing()
    {
        System.out.println("Passenger plane is landing");
    }
}


public class IntroInheritance
{
    public static void main(String[] args)
    {
        PassengerPlane pp = new PassengerPlane();

        pp.takeOff();  //inherited behaviour
        pp.fly();       //overriden behaviour
        pp.landing();   //specialized behaviour

    }
}
