// 🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️------HANDLE THE EXCEPTION------🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️


/**
 * HandleTheException
 *      - using the try and catch method 
 *      - Exception in java is an object so we need to create an obj reference to catch it if persists any error 
 * 
 * Why we need to handle else what happened?
 *      - We need to because if any such error came it will crash the system or the flow & stopped the later exection things 
 *      - So we need to 
 * 
 *  There are two types of statements 
 *      1. Normal -- no need to as it is normal we can check
 *      2. Critical --- use try method here (Where calculation happens)
 * 
 *  Note
 *      - How to handle Exeception
 *          --No need to worry 
 *          --it is just to handle the error that stopping workflow or have the impact of stoppint the later execution
 *          -- i.e. give error name a dialogue and continue to the next execution
 *          -- this is all possible because of try and catch method
 */

 

 // 🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️---TRY AND CATCH----🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️
/**
 *  Try and catch
 */



//  public class HandleTheException {

//     public static void main(String[] args) {
//         int num1= 6;
//         int num2 = 2;
//         int result =0;

//         // String name = null;

//         try
//         {
//             result = num1/num2;
//         }

//         catch (ArithmeticException e)
//         {
//             System.out.println("Can't divide by 0"+e);
//         }

//         System.out.println(result);

//         System.out.println("Bye");
        
//     }
// }


// 🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️---MULITPLE TRY AND CATCH----🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️
/**
 *  Multiple try and catch
 */



// public class HandleTheException {

//     public static void main(String[] args) {
//         int num1= 6;
//         int num2 = 2;
//         int result =0;
//         int values [] = {5,4,3,2};
//         // String name = null;

//         try
//         {
//             result = num1/num2;
//             System.out.println(values[0]);
//             // result = num1/name.length();
            
//         }

//         catch (ArithmeticException e)
//         {
//             System.out.println("Can't divide by 0"+e);
//         }
//         catch (ArrayIndexOutOfBoundsException e)
//         {
//             System.out.println("Stay in your limit"+e);
//         }
//         catch(Exception e)
//         {
//             System.out.println("Something found error.....");
//         }
        

//         System.out.println(result);

//         System.out.println("Bye");
        
//     }
// }