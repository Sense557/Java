import java.io.*;

/**
 *  File & Directory checking and Creation 
 */


class HelloWorld 
{
    public static void main(String[] args) throws IOException
    {
        // // 🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉
        // //file checking and creation
        // File file = new File("pwskill.txt");
        // System.out.println(file.exists());  //false
        
        // file.createNewFile();
        // System.out.println(file.exists());  //true



        // // 🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉
        // //directory checking and creation
        // File dir = new File("PW");
        // System.out.println(dir.exists());

        // dir.mkdir();
        // System.out.println(dir.exists());



        // // 🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉
        // File dir = new File("PWSKILLS");
        // // System.out.println(dir.isDirectory());
        // dir.mkdir();

        // File file = new File(dir, "hello.txt");
        // // System.out.println(file.isFile());
        // file.createNewFile();
        // System.out.println(file.isFile());


        // 🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉
        // Checking the directory files counting and printing the names of those files

        int count = 0;
        
        File f = new File("PWJAVA");
        String str [] = f.list();

        for(String name :str)
        {
            count++;
            System.out.println(name);
        }
        System.out.println("No. of files present in the PWJAVA: "+count);

    }
}
