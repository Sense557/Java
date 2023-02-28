package Interface;



interface Carr 
{
    void drive (int avg, int ts);

}

public class LambdaExpre {
    public static void main(String[] args) {

        // Car obj = new WagonR();

        // Carr obj = (int avg) -> System.out.println("Driving...."+avg);
        Carr obj = (avg, ts) -> System.out.println("Driving...."+avg+" "+ts);
            
        obj.drive(16,140);
    }
}




// 💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡


//  Zero Parameter interface


// @FunctionalInterface
// interface Carr 
// {
//     void drive ();
// }

// public class LambdaExpre 
// {
//     public static void main(String[] args) 
//     {
//         Carr obj = () -> System.out.println("Driving....");

                 
//         obj.drive();
    
//     }
// }

// 💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡


//  One  Parameter interface 

// interface Carr 
// {
//     void drive (int avg);

// }

// public class LambdaExpre {
//     public static void main(String[] args) {

//         // Car obj = new WagonR();

//         // Carr obj = (int avg) -> System.out.println("Driving...."+avg);
//         Carr obj = avg -> System.out.println("Driving...."+avg);
            
//         obj.drive(16);
//     }
// }


// 💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡




//  two  Parameter interface 

// interface Carr 
// {
//     void drive (int avg);

// }

// public class LambdaExpre {
//     public static void main(String[] args) {

//         // Car obj = new WagonR();

//         // Carr obj = (int avg) -> System.out.println("Driving...."+avg);
//         Carr obj = avg -> System.out.println("Driving...."+avg);
            
//         obj.drive(16);
//     }
// }