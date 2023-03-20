//class Aeroplane2
//{
//    void takeoff()
//    {
//        System.out.println("Aeroplane2 is taking off");
//    }
//    void fly()
//    {
//        System.out.println("Aeroplane2 is flying high");
//    }
//
//}
//
//class Cargoplane2 extends Aeroplane2
//{
//    void takeoff()
//    {
//        System.out.println("Cargoplane2 is taking off");
//    }
//    void fly()
//    {
//        System.out.println("Cargoplane2 is flying at low");
//    }
//
//
//}
//
//class Passengerplane2 extends Aeroplane2
//{
//    void takeoff()
//    {
//        System.out.println("Passengerplane2 is taking off");
//    }
//    void fly()
//    {
//        System.out.println("Passengerplane2 is flying at medium");
//    }
//
//}
//
//class Fighterplane2 extends Aeroplane2
//{
//    void takeoff()
//    {
//        System.out.println("FighterPlane2 is taking off");
//    }
//    void fly()
//    {
//        System.out.println("FighterPlane2 is flying at medium");
//    }
//
//}
//
////simly we are building the parent class reference to invoke all the child class
////this will reduce the code size
////enhance the performance also
//class Airport
//{
//    public void poly(Aeroplane2 ref)
//    {
//        ref.takeoff();
//        ref.fly();
//        System.out.println("---------------------------------");
//    }
//}
//
//
//
//
//
//public class LaunchPoly1
//{
//    public static void main(String[] args)
//    {
//        Cargoplane2 cp = new Cargoplane2();
//
//        Passengerplane2 pp = new Passengerplane2();
//
//        Fighterplane2 fp = new Fighterplane2();
//
//        //here we are passing the child class references to the parent class reference
//        //invoking all the methods of the child class at once using the polymorphism
//
//        Airport a = new Airport();
//        a.poly(cp);
//        a.poly(pp);
//        a.poly(fp);
//
//
//
//
//
//
//
//
//
//        // cp = ref;  //error
//        // pp = ref;   //error
//        //cp==pp;   //error because only parent class has the capacity to hold the reference of the child class
//        //same things multiple form ---> polymorphism
//
//
//        // ref = cp;
//        // ref.takeoff();
//        // ref.fly();
//
//        // System.out.println("---------------------------------");
//
//        // ref = pp;
//        // ref.takeoff();
//        // ref.fly();
//
//
//    }
//}
