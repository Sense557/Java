/**
 *  CUSTOM EXCEPTION & THROW KEYWORD
 * 
 *      custom exception
 *          -- rarely used 
 *          -- use inbuilt exception
 */



// // 🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️------SETTING CONDITION FOR NEGETIVE NUMBERS------🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️

// public class CustomException {
//     public static void main(String[] args) {

//         int num1 = 6;
//         int num2 = 0;

//         int result =0;
//         try
//         {
//             if(num2<=0)
//             {
//                 System.out.println("Enter a valid number");
//             }
//             else
//             {
//                 result = num1/num2;
//             }
//         }
//         catch(Exception e)
//         {
//             System.out.println("Enter a valid number"+e);
//         }
        
//         System.out.println(result);
        
//     }
// }




// 🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️------SETTING CONDITION FOR NEGETIVE NUMBERS------🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️


class MyException extends Exception
{
    public MyException(){}
    public MyException(String msg)
    {
        super(msg);
    }
}



public class CustomException {
    public static void main(String[] args) {

        int num1 = 6;
        int num2 = -20;

        int result =0;
        try
        {
            if(num2<0)
            {
                Exception e = new MyException ("negetive number");
                throw e;
            }
            else
            {
                result = num1/num2;
            }
        }
        catch(Exception e)
        {
            System.out.println("Enter a valid number"+e);
        }
        
        System.out.println(result);
        
    }
}
