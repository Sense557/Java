
// 🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️----------HANDLING Vs DUCKLING-----------🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️

/**
 *  HANDLING Vs DUCKLING
 * 
 */

//  🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️----------HANDLING Vs DUCKLING-----------🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️

/**
 * Here everone B is handling the exception
 * 
 */

// class Demo {
//     public void a() {
//         b();
//     }

//     public void b() {
//         int num1 = 6;
//         int num2 = 0;
//         int result = 0;
//         try
//         {
//             result = num1 / num2;
//         }
//         catch(Exception e)
//         {
//             System.out.println("error"+e.getMessage());
//         }
//         System.out.println(result);
//     }
// }

// public class HandlingVsDuckling {
//     public static void main(String[] args) {
//         Demo obj = new Demo();
//         obj.a();

//     }
// }



//  🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️----------HANDLING Vs DUCKLING-----------🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️

/**
 * Here everone is avoiding to handle the exception
 * -- so main method is handling the exception
 */

// class Demo
// {
// public void a() throws Exception
// {
// b();
// }
// public void b() throws Exception
// {
// int num1 = 6;
// int num2 =0;
// int result = num1 / num2;
// System.out.println(result);
// }
// }

// public class HandlingVsDuckling {
// public static void main(String[] args) {
// Demo obj = new Demo();
// try
// {
// obj.a();
// }
// catch(Exception e)
// {
// System.out.println("error"+e.getMessage());
// }

// }
// }
