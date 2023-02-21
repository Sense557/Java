class Aeroplane1
{
    void takeoff()
    {
        System.out.println("Aeroplane1 is taking off");
    }
    void fly()
    {
        System.out.println("Aeroplane1 is flying high");
    }
    
}

class Cargoplane1 extends Aeroplane1
{
    void takeoff()
    {
        System.out.println("Cargoplane1 is taking off");
    }
    void fly()
    {
        System.out.println("Cargoplane1 is flying at low");
    }
    

}

class Passengerplane1 extends Aeroplane1
{
    void takeoff()
    {
        System.out.println("Passengerplane1 is taking off");
    }
    void fly()
    {
        System.out.println("Passengerplane1 is flying at medium");
    }
    
}





public class LaunchPoly 
{
    public static void main(String[] args) 
    {
        Cargoplane1 cp = new Cargoplane1();
        

        Passengerplane1 pp = new Passengerplane1();
        
        Aeroplane1 ref;

        // cp = ref;  //error
        // pp = ref;   //error
        //cp==pp;   //error because only parent class has the capacity to hold the reference of the child class
        //same things multiple form ---> polymorphism


        ref = cp;
        ref.takeoff();
        ref.fly();

        System.out.println("---------------------------------");

        ref = pp;
        ref.takeoff();
        ref.fly();
        
        
    }
}
