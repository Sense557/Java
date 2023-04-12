// package Lecture;
// import java.util.*;



// /**
//  *  HashMap & WeakHashMap
//  */

// class Employee
// {
//     String name;
//     int empId;

//     public Employee(String name, int empId)
//     {
//         this.name = name;
//         this.empId = empId;
//     }

//     public String toString()
//     {
//         return name+" "+empId+" ";
//     }

//     public void finalize()
//     {
//         System.out.println("clean up work by GC after before deallocating memory from Heap");
//     }


// }


// public class index4 {
//     public static void main(String[] args) {

//         Employee e = new Employee("Hyder", 171);
        
//         HashMap hm = new HashMap();
//         // WeakHashMap hm = new WeakHashMap();
//         hm.put(e, "Hyder");
//         System.out.println(hm);

//         e = null; //eligible for garbage collection
//         System.gc();
//         System.out.println(hm);
//         System.out.println("Last Line");

        
//     }
// }
