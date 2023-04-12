import java.io.*;



/**
 *  PrintWriter and File Writer 
 *      why printwriter because we can write the primitive data type in the file also
 *      so the best method is the printwriter 
 */



public class LaunchPW 
{
    public static void main(String[] args) throws Exception
    {
        File dir = new File("PW");
        File file = new File(dir,"pw.txt");

        PrintWriter pw = new PrintWriter(file);
        pw.write(65);
        pw.println();
        pw.write("java");
        pw.println();

        pw.println(65);
        pw.println(97);
        pw.println(true);
        pw.println(50.5);

        pw.flush();
        System.out.println("see the pw.txt to see the changes");
        pw.close();


    }    
}
