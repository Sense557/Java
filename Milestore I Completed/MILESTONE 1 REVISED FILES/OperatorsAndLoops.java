
//  ASSIGNMENT OPERATOR
//  LOGICAL OPERATOR
//  FOR LOOPS
//  RELATIONAL OPERATOR
//  CONDITIONAL OPERATOR
//  TERNARY OPERATOR
//  SWITCH CASE

//🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟--------ASSIGNMENT OPERATORS------🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟
//public class OperatorsAndLoops {
//    public static void main(String[] args) {
//        int m1, m2, m3, m4;
//
//        m1 = m2 = m3 = m4 = 10;
//
//        System.out.println(m1 + " " + m2 + " "+m3+ ' '+ m4);
//
//        int a = 10;
//        a += 5;
//        System.out.println(a);  //15
//
//        int b = 5;
//        b -= 3;
//        System.out.println(b);  //2
//
//        int c = 10;
//        c /= 5;
//        System.out.println(c);   //2
//
//        int d = 10;
//        d *= 2;
//        System.out.println(d);  //20
//
//    }
//}
//〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️






//🚃🚃🚃🚃🚃🚃🚃🚃🚃🚃---------LOGICAL OPERATORS---------------🚃🚃🚃🚃🚃🚃🚃🚃🚃🚃🚃🚃🚃🚃🚃🚃🚃🚃🚃🚃🚃🚃🚃🚃🚃
//public class OperatorsAndLoops
//{
//    public static void main(String[] args) {
//         int a =10;
//         int b = 20;
//         int c = 30;

//         boolean result =  (a == b && a < b && a > b);  // FALSE
//          boolean result =  (a < b && a <= b && a < c);  //TRUE
//          boolean result =  (10 == 10 || 10 <20 || 10 < 30);  //TRUE

//         boolean result =  (10 < 20 || 10 > 20 || 10 > 50);  //TRUE
//         System.out.println(!false);  // USE OF ! FOR MAKING OPPOSITE STATEMENTS

//         System.out.println(result);  //simply printing the result
//    }
//}
//〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️






//  🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴-----FOR-LOOPS----------------🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴
//  DISCUSSED MORE ABOUT FOR AND ADVANCED FOR EACH LOOP IN THE STRING AND ARRAY CLASSES

//public class OperatorsAndLoops
//{
//    public static void main(String[] args) {
//        int n = 5;
//
//        //using the loop in this statement
//        for(int i=0; i<=n; i++){
//            System.out.print("*");
//        }
//    }
//}
//〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️





//✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️--------RELATIONAL OPERATOR -------------✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️
//class Main
//{
//    public static void main(String[] args)
//    {
//
//        //Relational operator
//        int a = 10;
//        int c = 20;
//        boolean result = a<c;
//
//        System.out.println(result);  //true
//        System.out.println(a>c);  // false
//
//    }
//}
//〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️




//✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️------CONDITIONAL OPERATOR----✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️
//class Conditional {
//    public static void main(String[] args) {
//        int age = 19;
//
//        if (age >= 18) {
//            System.out.println("You are an adult");
//        } else
//            System.out.println("You are a child");
//    }
//}


//        int age = 70;
//
//        if (age >= 18 && age < 60) {
//            System.out.println("You are an adult");
//        } else if (age >= 60) {
//            System.out.println("You are an old man");
//        } else
//            System.out.println("You are a child");
//    }
//}




//        int age = 7;
//
//        if(age >=18 && age < 60)
//        {
//            if (age >= 18 && age <30) {
//                System.out.println("You are in 20's");
//            }else if (age >= 30 && age <40) {
//                System.out.println("You are in 30's");
//            }else if (age >=40 && age <50) {
//                System.out.println("You are in 40's");
//            }else
//                System.out.println("You are not old enough to get retired");
//
//        }
//        else if(age >= 60){
//            if (age >= 60 && age <70) {
//                System.out.println("You are in 60's");
//            }else if (age >= 70 && age <80) {
//                System.out.println("You are in 70's");
//            }else
//                System.out.println("You are very old and your name is going to be in gunius book record");
//        }
//        else if (age > 12 && age <18)
//            {
//                System.out.println("You are now teen");
//            }
//        else
//            {
//                System.out.println("You are just born");
//            }
//
//    }
//}
//〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️







//  🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️-------------TERNARY OPERATOR------️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️
//  ALTERNATIVE TO IF ELSE
//  LIKEWISE FOR EACH LOOP IS THE ALTERNATIVE TO FOR LOOP IN SOME CASES

class Ternary
{
    public static void main(String[] args)
    {
        int a = 30;
        int b = 20;
        int c = 40;

//        int res = (a<b)? a : b;
//        System.out.println(res);  //20

//        int result = (a > b) ? a : b;
//        System.out.println(result);   //30



//        String res1 = (a<b) ?"a is less":"b is less";
//        System.out.println(res1);    //b is less


//        int res2 = (a<b)? (a<c? a:c) : (b<c? b:c);
//        System.out.println(res2);       //20


//         if (a<b) {
//             if (a<c)
//             {
//                 System.out.println(a);
//             }
//             else
//             {
//                 System.out.println(c);
//             }
//         }
//         else
//             if (b<c)
//             {
//                 System.out.println(b);
//             }
//             else
//             {
//                 System.out.println(c);
//             }
    }
}
//〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️





//✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️--------SWITCH CASE-------------✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️
//class Switch {
//    public static void main(String[] args) {
//        int num = 300;
//        switch(num)
//        {
//            case 200: System.out.println("case1");
//                break;
//            case 300: System.out.println("case2");
//                break;
//            case 100: System.out.println("case3");
//                break;
//            default: System.out.println("default");
//        }
//    }
//}
//〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️





//🧱🧱🧱🧱🧱🧱🧱🧱🧱🧱🧱🧱🧱🧱🧱-----WHILE LOOP--------------------------🧱🧱🧱🧱🧱🧱🧱🧱🧱🧱🧱🧱🧱🧱🧱🧱🧱🧱🧱🧱🧱
//class WhileLoop {
//    public static void main(String[] args) {
//        int i = 0;
//
//
//        //while loop
//        while (i < 5) {
//            System.out.println("*");
//            i++;
//        }
//    }
//}
//〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️






//🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴-----DO--WHILE-LOOPS----------------🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴
//class doWhileLoop {
//    public static void main(String[] args) {
//        //Do while loop
//         int i =3;
//
//         do
//         {
//             System.out.println("*");
//             i++;
//         }while(i<0);
//    }
//}
//〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️



