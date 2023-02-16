package THEORY;
//Doing all this things Explictily


    // 🍚🍚🍚🍚🍚🍚🍚🍚🍚🍚🍚🍚🍚🍚
// public class defaultConstructor {
//     private String name;
//     private int age;

//     defaultConstructor(){
//         this("name",0);
//         System.out.println("Default");
//     }
//     defaultConstructor(String name, int age)
//     {
//         this.name = name;
//         this.age = age;
//     }
//     void disp()
//     {
//         System.out.println(name);
//         System.out.println(age);
//     }
//     public static void main(String[] args) {
//         defaultConstructor o = new defaultConstructor();
//         o.disp();
//     }
// }



// 😶‍🌫️😶‍🌫️😶‍🌫️😶‍🌫️😶‍🌫️😶‍🌫️😶‍🌫️
class Default{
    private String name;
    private int age;

    Default()
    {
        System.out.println("Default implicitly");
    }

    // Default(){
    //     this("name",0);
    //     System.out.println("Default");
    // }
    // Default(String name, int age)
    // {
    //     this.name = name;
    //     this.age = age;
    // }
    void disp()
    {
        System.out.println(name);
        System.out.println(age);
    }
}
public class defaultConstructor {
    public static void main(String[] args) {
        Default o = new Default();
        o.disp();
    }
}
