import java.io.*;

/**
 *      Writing on the file
 */


public class LaunchFW 
{
    public static void main(String[] args) throws IOException 
    {

        // //going to the dir PW
        // File dir = new File("PW");

        // //going to the file pw.txt
        // File file = new File(dir, "pw.txt");

        // //invoking the method FileWriter to write on the file 
        // // FileWriter fw = new FileWriter(file); 

        // //it ensures that the newly added data will not override the old one
        // //we have to do this as FileWriter is overriding in natue 
        // FileWriter fw = new FileWriter(file, true);
        // fw.write("java");
        // fw.write("\n");
        // fw.write(65);
        // fw.write("\n");
        // fw.write(97);
        // fw.write("\n");
        // char ch [] = {'j', 'a', 'v', 'a'};
        // fw.write(ch);
        // fw.write("\n");

        
        // System.out.println("Open the pw.txt to see the Result");

        // //recommended to close otherwise the data will not be added in the file
        // // fw.close();

        // //alternatively use this method instead of close but not recommemded
        // //as after this also you can add data
        // fw.flush();
    

    }
}
