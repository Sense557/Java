
/**
 *  TYPES OF EXCEPTION
 *      1. Syntax
 *      2. Runtime
 *      3. Logic
 */

//🎗️🎗️🎗️🎗️🎗️🎗️🎗---SYNTAX EXCEPTION-----️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️
//public class Trial {
//    public static void main(String[] args) {
//        int num1 = 6;
//        int num2 = 5;
//        int result = num1+num2;
//
////        Syntax error
////        system.out.println(result);
//
//    }
//}



//🎗️🎗️🎗️🎗️🎗️🎗️🎗--- LOGIC EXCEPTION-----️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️
//public class Trial {
//    public static void main(String[] args) {
//        int num1 = 6;
//        int num2 = 5;
//        int result = num1-num2;
//
////        Logic error
////        Here we have applied the logic of substraction ans expecting addition of two numbers
//        System.out.println("Addition of two numbers is: "+result);
//
//    }
//}


//🎗️🎗️🎗️🎗️🎗️🎗️🎗--- RUNTIME EXCEPTION-----️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️
//public class Trial {
//    public static void main(String[] args) {
//        int num1 = 6;
//        int num2 = 0;
//        int result = num1/num2;
//
////        Runtime error
////        The error that we don't know will going to happen but during execution time it came to know that stopped all
////        And not printing or executing the later executions
//        System.out.println(result);
//        System.out.println("Bye");
//
//    }
//}


//🎗️🎗️🎗️🎗️🎗️🎗️🎗---HANDLE THE EXCEPTION-----️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️

/**
 *  Handle the exception
 *      - try catch
 *      - try with multiple catch
 *      - try finally
 *      - try with resource
 */



//🎗️🎗️🎗️🎗️🎗️🎗️🎗---TRY CATCH----️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️

/**
 *  Here we are using the try-catch approach to handle the exception
 *
 *      There are two types of statements
 *          --1. Critical --> we have to check it using try & catch the exception
 *          --2. Normal
 */


//public class Trial {
//    public static void main(String[] args) {
//        int num1 = 6;
//        int num2 = 0;
//        int result = 0;
//        try
//        {
//            //critical
//            result = num1 / num2;
//        }
//        catch (Exception e)
//        {
////            catching the error i.e catching the exception obj and when error came what to print
////            which will help to run our programme smoothly even after error came
////            later execution will not stopped
//            System.out.println("Something wrong happened.....");
//        }
//

//        System.out.println(result);
//        System.out.println("Bye");
//
//    }
//}




//🎗️🎗️🎗️🎗️🎗️🎗️🎗---TRY with MULTIPLE CATCH----️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️

/**
 *  Here we are using the try-catch approach to handle the MULTIPLE exception
 *      -i.e. for one specific Exception one specific handle
 *      - we can also print the Exception object what is saying it just using it in print time
 *      - we can print the Exception object msg also what specific error giving msg
 */


//public class Trial {
//    public static void main(String[] args) {
//        int num1 = 6;
//        int num2 = 2;
//        int result = 0;
//        int values [] = {5,4,3,2};
//        String str = null;
//        try
//        {
//            result = num1 / num2;
//            System.out.println(values[0]);
//            result = num1 / str.length();
//
//        }
//        catch (ArithmeticException e)
//        {
//            System.out.println("can't divide by zero"+e);
//        }
//        catch (ArrayIndexOutOfBoundsException e)
//        {
//            System.out.println("Stay in your limit"+e);
//        }
//        catch (Exception e)
//        {
//            System.out.println("Something went wrong....."+e);
//        }
//
//        System.out.println(result);
//        System.out.println("Bye");
//
//    }
//}



//🎗️🎗️🎗️🎗️🎗️🎗️🎗---TRY FINALLY----️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️

import java.util.Scanner;

/**
 *  Try finally
 *      -Here we are taking input from the user  instead of giving input manually
 *      -using the keyword finally
 *          -- To print a thing whether error came or not
 *          -- we have to perform that particular task anyhow
 *          -- we are here not handling the exception
 *          -- we are looking that what finally can do without catch can we do the thing what are expected
 *          -- error ane k baad b jo task execute  karna tha wo karega
 *          -- need to close sc leak manually
 */

//public class Trial {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        try
//        {
//
//            int num = sc.nextInt();
//            System.out.println(num);
//        }
//
////        catch (Exception e)
////        {
////            System.out.println("Enter a number"+e);
////            sc.close();
////        }
//        finally
//        {
//            sc.close();
//            System.out.println("Resource closed");
//        }
//
//
//    }
//}


//🎗️🎗️🎗️🎗️🎗️🎗️🎗---TRY with RESOURCE----️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️

//import java.util.Scanner;

/**
 *  Try WITH Resource
 *      -Here we are taking input from the user  instead of giving input manually and that too passing in the try as parameter
 *      - Updated version of try finally
 *      - no need to close the sc leak manually
 */

//public class Trial {
//    public static void main(String[] args) {
//        int num = 0;
//
//        try (Scanner sc = new Scanner(System.in)) {
//            num = sc.nextInt();
//
//        }
//        System.out.println(num);
//        System.out.println("Resource closed");
//
//    }
//}




//🎗️🎗️🎗️🎗️🎗️🎗️🎗---CUSTOM EXCEPTION & THROW KEYWORD----️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️

import java.util.Scanner;

/**
 *  Custom Exception is rarely used in the industry
 *  Most of the time we will use the inbuilt exception to handle it
 *
 *      --What if negative input is done by the user how will u handle it ?
 *          -- what will we do have to set a condition for negative number input
 *
 *      --DRY
 *
 */


////🎗️🎗️🎗️🎗️🎗️🎗--DRY---🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️
/**
 *  DRY --> Don't Repeat Yourself
 */



//public class Trial {
//    public static void main(String[] args) {
//
//        int num1 = 6;
//        int num2 = -2;
//
//        int result = 0;
//        try
//        {
//            if(num2<0)
//            {
//                //DRY-- Dont Repeat Yourself
//                System.out.println("Enter a valid number....");
//            }
//            else
//            {
//                result = num1 / num2;
//            }
//        }
//
//        catch(Exception e)
//        {
//            System.out.println("Enter a valid number...."+e.getMessage());
//        }
//        System.out.println(result);
//
//
//    }
//}



//////🎗️🎗️🎗️🎗️🎗️🎗️----CUSTOM EXCEPTION----️🎗️🎗️🎗️🎗️🎗️🎗️
/**
 *  CUSTOM EXCEPTION
 */



//class MyException extends Exception
//{
//    public MyException(){};
//    public MyException(String msg)
//    {
//        super(msg);
//    }
//}
//public class Trial {
//    public static void main(String[] args) {
//
//        int num1 = 6;
//        int num2 = -2;
//
//        int result = 0;
//        try
//        {
//            if(num2<0)
//            {
//                Exception e = new MyException("negative number");
//                throw e;
//            }
//            else
//            {
//                result = num1 / num2;
//            }
//        }
//        catch(Exception e)
//        {
//            System.out.println("Enter a valid number...."+e.getMessage());
//        }
//        System.out.println(result);
//    }
//}


//🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗---HANDLINDG Vs DUCK️LING----🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️
/**
 *  Handling Vs Duckling
 *      --Duckling
 *          -avoiding from the handling the exception
 *      --Handling
 *          - Handling the exception not avoiding
 */

/**
 * Duckling by a and b both but handling by main method
 *  -- here anyone has to handle the exception
 *  -- we cannot say that i will not do that
 */


//class Demo
//{
//    public void a() throws Exception
//    {
//        b();
//    }
//    public void b() throws Exception
//    {
//        int num1= 6;
//        int num2 = 0;
//        int result = num1/num2;
//        System.out.println(result);
//    }
//
//}
//
//public class Trial {
//    public static void main(String[] args) {
//        Demo obj = new Demo();
//        try
//        {
//            obj.a();
//        }
//        catch (Exception e)
//        {
//            System.out.println("Error");
//        }
//        System.out.println("Bye");
//
//    }
//}


//🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️


/**
 * Duckling by a but handling by  b  here main method only calling the method
 *  -- here anyone has to handle the exception
 *  -- we cannot say that i will not do that
 */

//
//class Demo
//{
//    public void a()
//    {
//        b();
//    }
//    public void b()
//    {
//        int num1= 6;
//        int num2 = 0;
//        int result = 0;
//        try
//        {
//            result = num1/num2;
//        }
//        catch (Exception e)
//        {
//            System.out.println("error");
//        }
//        System.out.println(result);
//
//    }
//
//}
//
//public class Trial {
//    public static void main(String[] args) {
//        Demo obj = new Demo();
//        obj.a();
//    }
//}

//🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️---HIEREARCHY OF EXCEPTION----️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️

/**
 *  Hierarchy of Exception
 *      Note-

 *          -Exception is an object which we can throw i.e it is throwable
 *
 *          -- 2 Types of
 *           - Exception
 *              - Runtime
 *              - IOE
 *              - AWT
 *              - SQL
 *              - Interrupted
 *           - Error
 *              - Virtual Machine
 *                  -- out of memory
 *                  -- Stack overflow
 *
 *              - Exception Initializer
 *              - Assertion Error
 *              - IOE Error
 *              - AWT
 *
 *           Note-
 *             - Runtime & its subclasses--> unchecked
 *  *          - Error & its subclasses --> unchecked
 *  *               except these above twos all  are checked
 */