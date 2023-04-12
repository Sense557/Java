// import java.io.File;
// import java.io.FileReader;
// import java.io.IOException;

// /**
//  *  FileReading helps in reading the data or the char present on the file
//  *      we can use loop for this to read effectively recommended foreach loop
//  */




// public class LaunchFR 
// {
//     public static void main(String[] args) throws IOException
//     {
//         File dir = new File("PW");
//         File file = new File(dir, "pw.txt");
        
//         FileReader fd = new FileReader(file);


//         // int i = fd.read();

//         //as it is not that much effective as it in every line invokes the fd.read()
//         //performancewise not good
//         // while(i!=-1)
//         // {
//         //     System.out.print(i +"----->");
//         //     System.out.println((char)i);
//         //     i = fd.read();

//         // }

//         //very much effective approach to read
//         char ch [] = new char[(int) file.length()];
//         fd.read(ch);

//         for(char data:ch)
//         {
//             System.out.print(data);
//         }
//     }
// }
