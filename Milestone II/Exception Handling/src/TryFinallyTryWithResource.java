 import java.util.Scanner;
//  🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️--------TRY FINALLY & TRY WITH RESOURCE----------🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️

/**
 *  Try finally and Try with Resource
 *      - Try Finally
 *          -- When we need to execute a thing whether you are getting exception or not 
 *          -- but bad thing is sc is leaked
 *          -- We are not handling the exception here
 * 
 *      - Try with resource
 *          -- When we need to take input and no sc leakage needed 
 *          -- good thing is sc not leaked and no need to use finally, catch
 *          -- We are not handling the exception here
 */



//  🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️--------TRY FINALLY----------🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️

/**
 *  Try finally
 */

// public class TryFinallyTryWithResource {
//     public static void main(String[] args) {
//
//         // try with finally
//         Scanner sc = new Scanner(System.in);
//         try
//         {
//
//             int num = sc.nextInt();
//             System.out.println(num);
//
//         }
////         catch(Exception e)
////         {
////             System.out.println("Enter a number");
////
////         }
//         finally
//         {
//
//             sc.close();
//         }
//     }
// }


//  🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️--------TRY WITH RESOURCE----------🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️
/**
 *  Try with resource
 *      -- updated version of try finally
 */


     public class TryFinallyTryWithResource {
         public static void main(String[] args) {

         int num = 0;

         //try with resource
         try(Scanner sc = new Scanner(System.in))
         {
             num = sc.nextInt();
         }
             System.out.println(num);

         System.out.println("Resource closed");


     }
 }
