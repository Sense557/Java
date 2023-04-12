// import java.io.*;


// /**
//  *  BurreredWriter and FileWriter 
//  */


// public class LaunchBWFW 
// {
//     public static void main(String[] args) throws Exception
//     {

//         File dir = new File("PW");
//         File file = new File(dir, "pwskill");

//         FileWriter fw = new FileWriter(file, true);
//         BufferedWriter bw = new BufferedWriter(fw);

//         bw.write("java");
//         bw.newLine();
//         bw.write(65);
//         bw.newLine();
//         bw.write(97);
//         bw.newLine();
//         char ch [] = {'j', 'a', 'v', 'a'};
//         bw.write(ch);


//         bw.flush();
//         System.out.println("check the pwskill.txt to see the changes");
//         bw.close();


//     }
// }
