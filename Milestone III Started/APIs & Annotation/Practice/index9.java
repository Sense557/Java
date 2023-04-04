// import java.util.*;
// import java.lang.*;

// /**
//  *     Introduction to Annotation
//  *      @ - Helps in bug traclking
//  *      // - only simply just to beautify the content i.e. comments 
//  */

// @FunctionalInterface
// interface demo 
// {
//     void disp();
//     // void disp2();
// }



// @Deprecated
//  //Parent class
// class Plane
// {
//     public void flyAtHighAltitude()
//     {
//         System.out.println("Plane is flying");
//     }
// }

// //child class

// class Aeroplane extends Plane
// {
//     @Override    
//     public void flyAtHighAltitude()
//     {
//         System.out.println("Aeroplane is flying");
//     }
// }

// class index9
// {
//     public static void main(String[] args) 
//     {
//         // Object of child classloosely coupled
//         Plane p = new Aeroplane();
//         p.flyAtHighAltitude(); 
        
//     }
// }