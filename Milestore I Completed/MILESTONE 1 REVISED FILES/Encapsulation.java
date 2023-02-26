


// 〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️----ENCAPSULATION---------------〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️

//  PRINT THE DEFAULT VALUES OF THE OBJECT
//  HOW TO PRINT THE DETAILS OF AN OBJECT

// class Student
// {
//     String name;
//     int age;
//     void show()
//     {
//         System.out.println(name+" "+age);
//     }
// }


// public class Encapsulation
// {
//     public static void main(String[] args) 
//     {
//         Student obj = new Student();
//         obj.show();

//     }
// }

// 〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️----ENCAPSULATION---------------〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️


// PRINT THE DEFAULT VALUES PROVIDED BY 

// class Student
// {
//     String name;
//     int age;

    
        
//     void show()
//     {
//         name = "Alok";
//         age =30; 
    
       
//         System.out.println(name+" "+age);
//     }
// }


// public class Encapsulation
// {
//     public static void main(String[] args) 
//     {
//         Student obj = new Student();
//         obj.show();

//     }
// }

// 〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️----ENCAPSULATION---------------〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️


//USER GIVING THE INTPUT TO THE OBJECT AS VALUES

// class Student
// {
//     String name;
//     int age;

    

//     void show()
//     {
//         System.out.println(name+" "+age);
//     }
// }


// public class Encapsulation
// {
//     public static void main(String[] args) 
//     {
//         Student obj = new Student();
//         obj.name = "Amar";
//         obj.age =28;
//         obj.show();

//     }
// }




// 〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️----ENCAPSULATION---------------〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️


///HIDING THE USER INPUT DATA FOR GETTING DIRECTLY ACCESSED

// class Student
// {
//     private String name;
//     private int age;

//     public void setDetail(String name, int age)
//     {
//         this.name = name;
//         this.age = age;
//     }

//     void show()
//     {
        
//         System.out.println(name+" "+age);
//     }
// }


// public class Encapsulation
// {
//     public static void main(String[] args) 
//     {
//         Student obj = new Student();
//         obj.setDetail("Alok",30);

//         obj.show();

//     }
// }

// 〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️----ENCAPSULATION---------------〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️

///HIDING THE USER INPUT DATA FOR GETTING DIRECTLY ACCESSED
//AND SETTING AND GETTING THE VALUES AS INDUSTRY STANDARD SO THAT OTHER IN THE COMMUNITY CAN ACCESSED
// BUT THIS METHOD HAS ONE SERIOUS CONFUSING THING THAT WHICH DATA I AM SETIING FOR IS NOT DISTINGUISHED i.e. NOT CLEAR
// SO FOR THAT THIS METHOD HAS NOT SOLVED THE DESIRED PROBLEM
// FROM THE INDUSTRY STANDARD PROSPECTIVE WE HAVE TO FOLLOW SOME RULE THAT 
// WE HAVE TO DEFINE INDIVIDUAL METHOD FOR THE INDICIDUAL VARIABLE SO THAT U CAN LATER IN FUTURE NOT BE IN TROUBLE TO MANAGE THINGS

// class Student
// {
//     private String name;
//     private int age;

//     public void setDetail(String name)
//     {
//         this.name = name;
//     }
//     public void setDetail(int age)
//     {
//         this.age = age;
//     }

//     public void show()
//     {
        
//         System.out.println(name+" "+age);
//     }
// }


// public class Encapsulation
// {
//     public static void main(String[] args) 
//     {
//         Student obj = new Student();
//         obj.setDetail("Alok");
//         obj.setDetail(20);

//         obj.show();

//     }
// }
// 〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️----ENCAPSULATION---------------〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️

// FROM THE INDUSTRY STANDARD PROSPECTIVE WE HAVE TO FOLLOW SOME RULE THAT 
// WE HAVE TO DEFINE INDIVIDUAL METHOD FOR THE INDICIDUAL VARIABLE SO THAT U CAN LATER IN FUTURE NOT BE IN TROUBLE TO MANAGE THINGS


// class Student
// {
//     private String name;
//     private int age;

//     public void setName(String name)
//     {
//         this.name = name;
//     }
//     public void setAge(int age)
//     {
//         this.age = age;
//     }

//     public void show()
//     {
        
//         System.out.println(name+" "+age);
//     }
// }


// public class Encapsulation
// {
//     public static void main(String[] args) 
//     {
//         Student obj = new Student();
//         obj.setName("Alok");
//         obj.setAge(20);

//         obj.show();

//     }
// }

// 〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️----ENCAPSULATION---------------〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️

//FROM THE INDUSTRY STANDARD PROSPECTIVE WE HAVE TO FOLLOW SOME RULE THAT 
// WE HAVE TO DEFINE INDIVIDUAL METHOD FOR THE INDICIDUAL VARIABLE SO THAT U CAN LATER IN FUTURE NOT BE IN TROUBLE TO MANAGE THINGS

// class Student
// {
//     private String name;
//     private int age;

//     public void setName(String name)
//     {
//         this.name = name;
//     }
//     public void setAge(int age)
//     {
//         this.age = age;
//     }

//     public String getName()
//     {
//         return name;
//     }
//     public int getAge()
//     {
//         return age;
//     }

//     public void show()
//     {
//         System.out.println(name+" "+age);
//     }
// }

// public class Encapsulation
// {
//     public static void main(String[] args) 
//     {
//         Student obj = new Student();
//         obj.setName("Alok");
//         obj.setAge(20);

//         obj.getName();
//         obj.getAge();

//         obj.show();
//     }
// }


// 〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️----ENCAPSULATION---------------〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️

//  LAST AND FINAL METHOD FOR ENCAPSULATION

// class Student
// {
//     private String name;
//     private int age;

//     public void setName(String name)
//     {
//         this.name = name;
//     }
//     public void setAge(int age)
//     {
//         this.age = age;
//     }

//     public String getName()
//     {
//         return name;
//     }
//     public int getAge()
//     {
//         return age;
//     }

// }

// public class Encapsulation
// {
//     public static void main(String[] args) 
//     {
//         Student obj = new Student();
//         obj.setName("Alok");
//         obj.setAge(20);

//         System.out.println(obj.getName());
//         System.out.println(obj.getAge());
//         System.out.println(obj.getClass());
//     }
// }




// 〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️---------CONSTRUCTOR---------------〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️


                                                            //CONSTRUCTOR


// WHY CONSTRUCTOR METHOD CAME AND WHY 
// JUST IN CASE WE NEED THAT THE VARIABLES SHOULD INITIALIZE FIRST BEFORE THE OBJECT CREATION IN THAT CASE 
// WE WANT THIS METHOD
// IT ENHANCES THE PERFORMACE OF THE CODE

// THIS IS JUST THE EXAMPLE OF THE PRINTING THE VALUES OF THE OBJECT
// class Student
// {
//     String name;
//     int age;
    
//     void show()
//     {
//         age = 30;
//         name = "Ajay";
//         System.out.println(name+" "+age);
//     }

// }


// public class Encapsulation 
// {
//     public static void main(String[] args) 
//     {
//         Student obj = new Student();
//         obj.show();
//     }
    
// }
// 〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️---------CONSTRUCTOR---------------〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️

//  WHEN THERE IS NO CONSTRUCTOR DEFAULT CONSTRUCTOR WILL BE CALLED
//  WHEN THERE IS ANY CONSTRUCTOR OTHER THAN DEFAULT OR ZERO PARAMETERIZED THEN IT WILL SHOW ERROR
//  IT IS BECAUSE JAVA KNOWS THAT HE KNOWS PROGRAMMING SO NO NEED OF DEFAULT CONSTRUCTOR

// class Student
// {
//     Student()
//     {
//         System.out.println("This is zero parameterized constructor and default as well");
//     }


// public class Encapsulation 
// {
//     public static void main(String[] args) 
//     {
//         Student obj = new Student();
//     }
    
// }


// 〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️---------CONSTRUCTOR---------------〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️
//  WHEN THERE IS NO CONSTRUCTOR DEFAULT CONSTRUCTOR WILL BE CALLED
//  WHEN THERE IS ANY CONSTRUCTOR OTHER THAN DEFAULT OR ZERO PARAMETERIZED THEN IT WILL SHOW ERROR
//  IT IS BECAUSE JAVA KNOWS THAT HE KNOWS PROGRAMMING SO NO NEED OF DEFAULT CONSTRUCTOR
// WE CANNOT COPY OR CLONE THE CONSTRUCTOR IT WILL GIVE ERROR THAT DUPLICATE CONSTRUCTOR
//  SO WE NEED TO USE CONSTRUCTOR OVERLOADING CONCEPT 

// class Student
// {
//     Student()
//     {
//         System.out.println("This is zero parameterized constructor and default as well");
//     }
//     Student (int age)
//     {
//         this.age = age;
        
//     }

// }


// public class Encapsulation 
// {
//     public static void main(String[] args) 
//     {
//         Student obj = new Student();  //NOW IT IS NOT PRINTING , IT IS GIVING ERROR DUE TO ANOTHER CONSTRUCTOR PRESENCE IN THE SAME CLASS
//     }
    
// }


// 〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️---------CONSTRUCTOR---------------〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️


//Example 1 
//CONSTRUCTOR EXAMPLE 

// class Student
// {
//     String name;
//     int age;
//     Student()
//     {
//         age = 30;
//         name = "Ajay";
//     }

//     void show()
//     {
        
//         System.out.println(name+" "+age);
//     }

// }


// public class Encapsulation 
// {
//     public static void main(String[] args) 
//     {
//         Student obj = new Student();
//         obj.show();
//     }
    
// }

// 〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️---------CONSTRUCTOR---------------〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️

// CONSTRUCTOR OVERLOADING

// class Student
// {
//     String name;
//     int age;
//     Student()
//     {
//         System.out.println("Zero Parameterized constructor");
//     }
//     Student(int age)
//     {
//         System.out.println(age);
//     }
//     Student(String name, int age)
//     {
//         System.out.println(name+" "+age);
//     }

//     void show()
//     {
        
//         System.out.println(name+" "+age);
//     }

// }


// public class Encapsulation 
// {
//     public static void main(String[] args) 
//     {
//         Student obj = new Student();
//         // obj.show();
//         Student obj1 = new Student(30);
//         // obj1.show();
//         Student obj2 = new Student("Alok",400);
//         // obj2.show();
        
        
//     }
    
// }



// 〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️---------CONSTRUCTOR---------------〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️


// Direct value also passed through using the concept of constructor


// class Student
// {
//     String name;
//     int age;
//     Student()
//     {
//         System.out.println("Zero Parameterized constructor");
//     }
//     Student(int age)
//     {
//        this.age = age;
//     }
//     Student(String name, int age)
//     {
//         this.name = name;
//         this.age = age;
//     }

//     void show()
//     {
        
//         System.out.println(name+" "+age);
//     }

// }


// public class Encapsulation 
// {
//     public static void main(String[] args) 
//     {
//         Student obj = new Student(30);
//         obj.show();

//         Student obj1 = new Student("Happy", 30);
//         obj1.show();

//         // Student obj1 = new Student(30);
//         // Student obj2 = new Student("Alok",400);
        
        
//     }
    
// }



// 〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️---------CONSTRUCTOR---------------〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️


// using the keyword this() in the constructor to enhance the performance of the constructor
// this () is essential  for constructor chaining 


// class Student
// {
//     String name;
//     int age;
//     Student()
//     {
        
//         System.out.println("Zero Parameterized constructor");
//     }
//     Student(int age)
//     {
       
//        this.age = age;
//        System.out.println(age);
//     }
//     Student(String name, int age)
//     {
//         this();
//         this.name = name;
//         this.age = age;
//         System.out.println(name+" "+age);
//     }
//     void show()
//     {
//         System.out.println(name+" "+age);
//     }

// }
// public class Encapsulation 
// {
//     public static void main(String[] args) 
//     {
//         Student obj2 = new Student("Alok",50);
//         // obj2.show();
//     }
    
// }

// 〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️---------CONSTRUCTOR---------------〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️


//this() is used as the reference for the current object
//if the object is passing the arguments for holding the which data type then it will store than maax data type not more than this
// though the this() is referencing the more than obj can hold it will not print the other than his max limit
// most important thing

// class Student
// {
//     String name;
//     int age;
//     Student()
//     {
        
//         System.out.println("Zero Parameterized constructor");
//     }
//     Student(int age)
//     {
       
//        this.age = age;
//        System.out.println(age);
//     }
//     Student(String name, int age)
//     {
//         this();
//         this.name = name;
//         this.age = age;
//         System.out.println(name+" "+age);
//     }

// }
// public class Encapsulation 
// {
//     public static void main(String[] args) 
//     {
//         Student obj2 = new Student("Alok",50);
//         Student obj1 = new Student();
//         Student obj3 = new Student(0);
//     }
    
// }


// 〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️COMPLETED (ENCAPSULATION + CONSTRUCTOR)〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️

// NEXT GO FOR STATIC
// STRING III
// ARRAY 
// THAN IN THE SAME ORDER 
