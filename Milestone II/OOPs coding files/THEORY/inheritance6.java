class Aeroplane
{
    void takeoff()
    {
        System.out.println("Aeroplane is taking off");
    }
    void fly()
    {
        System.out.println("Aeroplane is flying high");
    }
    
}

class Cargoplane extends Aeroplane
{
    void fly()
    {
        System.out.println("Cargoplane is flying at low");
    }
    void CarryGoods()
    {
        System.out.println("Cargoplane is carrying goods");
    }

}

class Passengerplane extends Aeroplane
{
    void fly()
    {
        System.out.println("Passengerplane is flying at medium");
    }
    void CarryPassenger()
    {
        System.out.println("Passenger Plane is carrying passenger");
    }
}





public class inheritance6 
{
    public static void main(String[] args) 
    {
        Cargoplane cp = new Cargoplane();
        cp.takeoff();
        cp.fly();

        Passengerplane pp = new Passengerplane();
        pp.takeoff();
        pp.fly();
        
        
    }
}
