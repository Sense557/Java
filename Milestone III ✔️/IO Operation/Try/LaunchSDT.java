import java.io.*;


/**
 *  
 */
class Cricketer implements Serializable {
    String name;
    transient int age;
    int marks;

    public Cricketer(String name, int age, int marks)
    {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
    public void disp()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(marks);
    }

    
}

public class LaunchSDT 
{
    public static void main(String[] args) throws Exception
    {
        // File dir = new File("PW");
        // File file = new File("pw.txt"); 

        //Serialization
        // Cricketer cr = new Cricketer("Sachin", 35, 30000);
        
        // FileOutputStream fos = new FileOutputStream("pw.txt");
        // BufferedOutputStream bos = new BufferedOutputStream(fos);
        // ObjectOutputStream oos = new ObjectOutputStream(bos);
        // oos.writeObject(cr);
        // oos.close();


        // ⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐


        //Deserialization
        // FileInputStream fis = new FileInputStream("pw.txt");
        // ObjectInputStream ois = new ObjectInputStream(fis);
        // Cricketer cr = (Cricketer)ois.readObject();
        // cr.disp();
        
        // ois.close();



        // ⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐


        //Deserialization of transient
        FileInputStream fis = new FileInputStream("pw.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Cricketer cr = (Cricketer)ois.readObject();
        cr.disp();
        
        ois.close();



    }
}
