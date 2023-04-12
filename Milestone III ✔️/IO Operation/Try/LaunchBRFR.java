// import java.io.*;



// /**
//  *  BufferReader and FileReader
//  */



// public class LaunchBRFR 
// {
//     public static void main(String[] args) throws Exception
//     {
//         File dir = new File("PW");
//         File file = new File(dir, "pw.txt");

//         FileReader fr = new FileReader(file);
//         BufferedReader br = new BufferedReader(fr);

//         //best method to read line by line as here using the br we can do this without using the 
//         //for each loop

//         // String line = br.readLine();
        
//         // while(line!=null)
//         // {
//         //     System.out.println(line);
//         //     line = br.readLine();
//         // }

//         // br.close();


//         // 🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉
//         //not effective as br reading line by line instead of char 
//         //so this is not good the above method is good
//         // char ch [] = new char [(int)file.length()];
//         // br.read(ch);

//         // for (char data : ch) 
//         // {
//         //     System.out.print(data);    
//         // }

//         // br.close();

//     }
// }
