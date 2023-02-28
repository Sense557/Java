////
////// 〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️
////
//////  USING SETTER WE CAN ACHIEVE DEPENDENCY INJECTION
//////  USING CONSTRUCTOR WE CAN ACHIEVE DEPENDENCY INJECTION
////
////
////// 〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️SETTER〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️
////
// class Student1
// {
//     private Heart1 h;
//
//     public Student1(Heart1 h)
//     {
//         this.h = h;
//     }
//
//     public void setH(Heart1 h)
//     {
//         this.h = h;
//     }
//
//     public void call()
//     {
//         h.Heart1Beart1();
//     }
//
//
// }
//
// class Heart1
// {
//
//     void Heart1Beart1()
//     {
//         System.out.println("Heart1 is beating");
//     }
// }
//
//
// public class DependencyInjection
// {
//     public static void main(String[] args)
//     {
//         Heart1 h = new Heart1();
//         Student1 s = new Student1(h);
//         s.call();
//     }
// }
//
//
////
////// 〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️CONSTRUCTOR〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️
////
////class Car
////{
////    private Engine e;
////
////    public Car(Engine e)
////    {
////        this.e = e;
////    }
////
////
////
////    public void startEngine()
////    {
////        e.start();
////    }
////
////
////}
////
////class Engine
////{
////
////    void start()
////    {
////        System.out.println("Heart1 is beating");
////    }
////}
////
////
////public class DependencyInjection
////{
////    public static void main(String[] args)
////    {
////        Engine e = new Engine();
////        Car c = new Car(e);
////        c.startEngine();
////    }
////}
