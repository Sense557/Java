// abstract class Aeroplane3
// {
//     abstract void takeoff();
    
//     abstract void fly();

//     //if i use this block we will achieve the 100% abstraction so for now i avoided
    
//     public void landing()
//     {
//         System.out.println("Cargoplane is landing....");
//     }
   
    
// }

// class Cargoplane3 extends Aeroplane3
// {
//     public void landing()
//     {
//         System.out.println("Cargoplane is landing....");
//     }
//     void takeoff()
//     {
//         System.out.println("Cargoplane3 is taking off");
//     }
//     void fly()
//     {
//         System.out.println("Cargoplane3 is flying at low");
//     }
//     public void alert()
//     {
//         System.out.println("alert....");
//     }
    

// }

// class Passengerplane3 extends Aeroplane3
// {
//     void takeoff()
//     {
//         System.out.println("Passengerplane3 is taking off");
//     }
//     void fly()
//     {
//         System.out.println("Passengerplane3 is flying at medium");
//     }
    
// }
    

// public class LaunchAbs
// {
//     public static void main(String[] args) 
//     {
//         Aeroplane3 ref1 = new Cargoplane3();
//         ref1.takeoff();
//         ref1.fly();
//         ref1.landing();
//         ((Cargoplane3) ref1).alert();  //just to get the reference of the child class in the parent class we use downcasting
        

//         Aeroplane3 ref3 = new Passengerplane3();
//         ref3.takeoff();
//         ref3.fly();
//         ref3.landing();
//         ref3.alert();  //you cant call the spexialized method of the another child class
//     }
// }
