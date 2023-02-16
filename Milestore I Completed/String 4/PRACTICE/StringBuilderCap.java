package PRACTICE;

// import java.util.Arrays;

public class StringBuilderCap {
    public static void main(String[] args) {
        ////😶‍🌫️😶‍🌫️😶‍🌫️😶‍🌫️😶‍🌫️😶‍🌫️😶‍🌫️😶‍🌫️😶‍🌫️😶‍🌫️😶‍🌫️
        //Using the String builder inbuilt methods
        // StringBuilder sb = new StringBuilder();
        // System.out.println(sb.capacity()); //16
        // System.out.println(sb.append("the quick brown f")); //the quick brown f
        // System.out.println(sb.length()); //17
        // System.out.println(sb.capacity()); //34
        // sb.trimToSize();  // to resize the size of the Stringbuilder
        // System.out.println(sb.capacity()); //17
        // System.out.println(sb.charAt(5)); //u
        // sb.setCharAt(5, 'z'); //careful how to set a character in the specific index in Stringbuilder
        // System.out.println(sb); //print after the setting the character in the index
        // System.out.println(sb.reverse()); //f nworb kciuq eht


        ////🍚🍚🍚🍚🍚🍚🍚🍚🍚🍚🍚🍚🍚
        //Using the StringBuilder inbuilt methods
        // StringBuilder s = new StringBuilder(145); //capacity 145 no output
        // System.out.println(s.append("s"));  //s
        // s.trimToSize(); //print after trim no output
        // System.out.println(s.capacity()); //1


        ////🍚🍚🍚🍚🍚🍚🍚🍚🍚🍚🍚🍚🍚
        // //Reversing a string using Stringbuilder with the use of inbuilt methods
        // String s = new String("AMAR");
        // StringBuilder sb = new StringBuilder(s);
        // sb.reverse();
        // System.out.println(sb.toString());


        // //🍚🍚🍚🍚🍚🍚🍚🍚🍚🍚🍚🍚🍚🍚🍚🍚🍚🍚🍚🍚🍚
        //we just appended the string builder without creating new string builder 
        //and then converting it to the string
        //1st it was a StringBuilder and in the last it was a string
    
        // StringBuilder sb = new StringBuilder("Hello");
        // sb.append(",");
        // sb.append("world!");
        // String result = sb.toString();
        // System.out.println(result);


        // // 😀😀😀😀😀😀😀😀😀😀😀😀😀😀😀😀😀
        //APPENDING THE STRINGBUILDER
        // StringBuilder sb = new StringBuilder("VIRAT");
        // sb.append(" Kohli");
        // System.out.println(sb);




        //⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️
        //After declaring final int it is giving error
        //As it is now acting as constant after using final 
        // final int age = 20;
        // System.out.println(age);  //20
        // age = 30;
        // System.out.println(age);




        //🍚🍚🍚🍚🍚How can we add any data to a StringBuilder Example
        //This is why StringBuilder is Mutable

        // StringBuffer sb = new StringBuffer("Virat");
        // sb.append("Kohli");
        
        // // System.out.println(sb);  //Kohli
        // sb = new StringBuffer("Sachin");  
        // System.out.println(sb);    //Sachin
        



        // // 😀😀😀😀😀😀😀😀😀😀😀😀😀😀😀😀😀
        //Use of final in a StringBuilder and How does it affecting
        // final StringBuilder sb = new StringBuilder("Virat");   
        // sb.append("Kohli");   //no output
        // System.out.println(sb);  //ViratKohli
        // sb = new StringBuilder("Sachin"); //It will show compile error
        // System.out.println(sb);  //error


        // StringBuilder sb = new StringBuilder("Virat");   
        // sb.append("Kohli");   //no output
        // System.out.println(sb);  //ViratKohli
        // sb = new StringBuilder("Sachin"); //(Sachin) It will not show compile error 
        // System.out.println(sb);  //(Sachin) 





        //
        // public static String main (String input) {
            String input = "Think Twice";
            String[] words = input.split(" ");
            StringBuilder sb = new StringBuilder();
            for (int i = words.length - 1; i >= 0; i--) {
                sb.append(words[i]);
                if (i > 0) {
                    sb.append(" ");
                }
            }
            System.out.println(sb.toString());
        }

        




        ////👌👌👌👌👌👌👌👌👌👌👌👌 
        //Using the sorting inbuilt methods
        
        // String input = new String("Amar Meher");
        // char chArr [] = input.toLowerCase().toCharArray();
        // System.out.println(chArr);
        // Arrays.sort(chArr);
        // System.out.println(chArr);




    //     //🍚🍚🍚🍚🍚🍚🍚🍚🍚🍚🍚
    //    //reverse a string not using the stringBUilsers inbuilt method
    //    String s = "THINK TWICE";
    //    char chArr [] = s.toCharArray();
    //    StringBuilder sb = new StringBuilder();

    //    for(int i=chArr.length-1; i>=0; i--){
    //     sb.append(chArr[i]);
    //    }
    //    System.out.println(sb.toString());






    // // 👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍 
    //sorting alphabetically  using the inbuilt methods of array
    // String s = "PW SKILLS";
    // char chArr [] = s.toCharArray();
    // Arrays.sort(chArr);
    // System.out.println(chArr);







//         //🍚🍚🍚🍚🍚🍚🍚🍚🍚🍚🍚 (Alternative method of the above Q)
//         //reverse a string not using the stringBUilsers inbuilt method
    
//         String s = "PW SKILLS";
//         String chArr [] = s.split(" ");
//         StringBuilder sb = new StringBuilder();

//         //traverse throught the charArr to get the elemtnts put in the StringbUilser in a reverse order
//         for( int i = chArr.length-1; i>=0; i--){
//             for(int j = chArr[i].length()-1; j >=0; j--){

//                 //adding all the char in the revrese order
//                 sb.append(chArr[i].charAt(j));
//             }
//             //adding a space in what we have removed
//             if(i>0)
//             sb.append(" ");
//         }
//         //printing the string from sb
//         System.out.println(sb.toString());



    }
}