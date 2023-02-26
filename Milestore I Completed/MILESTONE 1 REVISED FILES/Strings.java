package Lecture;//import java.util.Lecture.Arrays;

class Strings
{
    public static void main (String [] args)
    {
//        ⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️CONCEPT OF STRING STARTED ✌️✌️✌️✌️✌️✌️
//        Declaration of a string
//        String can be declared in many ways like below

//        🥟🥟🥟🥟🥟🥟🥟🥟🥟---------NOTE----🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟
//        String s = new String("Amar"); //creating a new obj and assigning value at the same time
//        String s50= "Amar";  //just giving the value to a string
//        🥟🥟🥟🥟🥟🥟🥟🥟🥟-----------------🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟

//        String s = new String("Amar");
//
//        System.out.println(s); //Amar
//        System.out.println(s.length()); //4
//        String s1 = s.concat(" Meher"); //added Meher to the stirng s and stored in the new string s1
//        System.out.println("Before concatination: " +s); //Amar because we printing the old s string
//        System.out.println("After Concatination: "+s1); //Amar Meher

//        ❔❔❔❔❔❔❔❔❔❔❔❔❔❔❔❔❔❔❔❔❔❔❔❔❔❔❔❔❔❔❔❔❔
//        Is there any other way so that we can resolve the issue of concatination in the samw existing string
//        No but we can store do it in the StringBuffer and StringBuilder


//        ⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️
//        Decalaration of StringBuffer and StringBuilder
//        Like StringBuffer we can do for the StringBuilder also

//        StringBuffer s2 = new StringBuffer("Amar");
//        s2.append(" Meher"); // we are adding meher to the Amar in the string s
//        System.out.println(s2); //Amar Meher
//        👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌




//        ⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️
//        which one is better i.e.  StringBuffer vs StringBuilder
//        StringBuffer ---> single threading, safe threading, sync
//        when we need single threading with safe threading go for StringBuffer
//        StringBuilder --->multi threading, not safe threading, un-sync
//        when we need multi threading with no safe threading go for StringBuilder
//        we prefer <Stringbuilder>
//        👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌



//        ⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️
//        length vs length()
//        length ---> length of the array
//        length() ---> length of the String
//        👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌



//         👍👍👍👍👍👍
//        As it is stored outside String constant pool but inside Heap area only
//        where duplicated are not allowed
//        which is why it reacts as different not the same one
//        printing =false

//        String s3 = new String("pw");
//        String s4 = new String("pw");
//        System.out.println(s3==s4);   //FALSE


        // 🍿🍿🍿🍿🍿🍿🍿🍿🍿
        //As it is stored inside String Constant Pool
        //Where duplicates are allowed
        //which is why it prints true

//        String s5 = "pw";
//        String s6 = "pw";
//        System.out.println(s5==s6);  //TRUE

//-----------------------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------------------





//  ⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️
//        CHAPTER 2 STARTED
//  ⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️

//        TRAVERSING THORUGH A STRING ARRAY USING FOR LOOP AND FOR EACH LOOP
//                Advantages of for loop ---->
//                      we have full control where to start and stop
//                Disadvantages of for each loop ---->
//                      we dont have that control as in for loop
//        ------------------------------------------------------------------


//        🙋🏻‍♂️🙋🏻‍♂️🙋🏻‍♂️🙋🏻‍♂️🙋🏻‍♂️🤔🤔🤔🤔🤔🤔🤔🤔🤔🤔🤔🤔🤔🤔
//        How to declare a string
//        You cannot use the keywords(the words registered in java) for any other things
//        for example you cant keep the file name same as the keyword
//        otherwise errors will be shown
//        like we can't save the file name as String, int etc....


//      ✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️
//        this way we can add multiples names or string values in String array
//        Print using the for each loop & for loop also
//        Declaring multiple values in a string and printing

//        String nameAr []  = {"Alok", "Adil", "Amar"};

//        🙋🏻‍♂️🙋🏻‍♂️🙋🏻‍♂️🙋🏻‍♂️🙋🏻‍♂️🙋🏻‍♂️🙋🏻‍♂️🙋🏻‍♂️🙋🏻‍♂️🙋🏻‍♂️🙋🏻‍♂️🙋🏻‍♂️🙋🏻‍♂️🙋🏻‍♂️🙋🏻‍♂️🙋🏻‍♂️🙋🏻‍♂️🙋🏻‍♂️🙋🏻‍♂️🙋🏻‍♂️🙋🏻‍♂️🙋🏻‍♂️🙋🏻‍♂️🙋🏻‍♂️🙋🏻‍♂️🙋🏻‍♂️
////        Using for each loop
//        for (String elem : nameAr) {
//            System.out.print(elem +" ");
//        }
//        System.out.println();
//        System.out.println(nameAr);
//        ️🙋🏻‍♂️🙋🏻‍♂️🙋🏻‍♂️🙋🏻‍♂️🙋🏻‍♂️🙋🏻‍♂️🙋🏻‍♂️🙋🏻‍♂️🙋🏻‍♂️🙋🏻‍♂️🙋🏻‍♂️🙋🏻‍♂️🙋🏻‍♂️🙋🏻‍♂️🙋🏻‍♂️🙋🏻‍♂️🙋🏻‍♂️🙋🏻‍♂️🙋🏻‍♂️🙋🏻‍♂️🙋🏻‍♂️🙋🏻‍♂️🙋🏻‍♂️🙋🏻‍♂️🙋🏻‍♂️


//        ✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️
//        Using for loop
//        for (int i=0; i< nameAr.length; i++)
//        {
//
//            System.out.println(nameAr[i]);  ////printing the elements of the array
//        }
//        System.out.println(nameAr);  //showing the address value
//        ✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️






//  🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴️️
//        ------------------------CHAPTER 2 STARTED------------------------

//        STRING INBUILT METHODS
//        COMPARE
//        CONCATENATE (USING INBUILT AND OPERATORS)
//        ADVANTAGES AND DISADVANTAGES OF CONCAT METHOD
//        DELETE ALL CONSONANTS
//        FIND A LETTER
//        INPUT EXAMPLE
//        LENGTH VS LENGTH()
//        LENGTH PROGRAMME
//        🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴️



//        ⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️---STRING INBUILT METHODS---⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️
//        STRING INBUILT METHODS
//        String str = "PW Skill java";
//
//         System.out.println(str.toUpperCase()); //PW SKILL JAVA
//         System.out.println(str.toLowerCase()); //pw skill java
//         System.out.println(str.indexOf("a")); //10
//         System.out.println(str.lastIndexOf("a")); //12
//         System.out.println(str.charAt(1)); //W
//         System.out.println(str.length()); //13
//         System.out.println(str.indexOf("S")); //3
//         System.out.println(str.substring(3, 8)); //Skill (inclusive and exclusive)(because lowercase type is not stored
//         ⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️---STRING INBUILT METHODS---⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️


//        〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️------COMPARE-----〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️
//
//        〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️------Note-----〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️
//        in the Heap duplicates are allowed but in the SCP not allowed
//        〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️-----------〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️
//        COMPARE-------
//        It compares the length of the two string and returns the length difference
//         String s1 = "Skills";
//         String s2 = "Skill";
//         int s3 = s1.compareTo(s2);
//         System.out.println(s3); //1

//        Compare the two strings differently
//         String s1 = "skills";
//         String s2 = new String("SKILLS");
//         String s3 = new String("skills");

//         System.out.println(s1==s2);  //false
//         System.out.println(s1.equals(s2));  //false
//         System.out.println(s1.equals(s3));  //true    //because both are same
//         System.out.println(s1.equalsIgnoreCase(s2));  //ture //Ignoring the upper lower cases only comparing the values
//        〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️------COMPARE-----〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️



//         🥟🥟🥟🥟🥟🥟🥟🥟🥟---------NOTE----🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟
//        (==) Compares the String Objects
//        .equals method compares the elements of the string or contents of the string
//        .compareTo() method compares to the length of the strings returns int value of length difference
//        🥟🥟🥟🥟🥟🥟🥟🥟🥟-----------------🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟

//         String s1 = "pw";
//         String s2 = new String("pw");
//         int s3 = s2.compareTo(s1);
//         System.out.println(s3);  //0
//
//
//         System.out.println(s1==s2); // false // s1 and s2 are two different String
//         System.out.println(s1.equals(s2)); // true  // s1 and s2 elements are equal
//         System.out.println(s3); //0  //difference after comparing values is 0


//        👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩----CONCATENATE (USING INBUILT AND OPERATORS------‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳
//        Advantages of concat method ------>
//              It can do both can concat the string and  the int values also
//        Disadvantages of concat method ---------->
//              only can concat string not the int values
//        👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩--------------------NOTES---------------‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳

//        CONCATENATE (USING INBUILT AND OPERATORS


//         String s1 = "pw";
//         String s2 = "skills";
//         String s3 = s1 + s2;
//         System.out.println(s3); //pwskills

//         String s4 = s1.concat(s2);
//         System.out.println(s4); //pwskills

//        Using Operator +
//        It has advantages many
//         String s1 = "PW";
//         String s2 = "JAVA ";
//         String s3 = s1+" "+s2;
//         System.out.println(s3+" "); //PW JAVA
//
//         //Using inbuilt method
//         //It cannot handle int value
//        3rd Example (adding integers in a string as well)

//         String str = "pw"+100+90;
//         System.out.println(str);
//
//
//         String s1 = "pw";
//         String s2 = "skills";
//         String s3 = s1 + s2;
//         String s4 = "Very Good";
//         System.out.println(s2.concat(" "+s4)); //JAVA Very God
//        ‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩-----------------------------------‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳



//        👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩----DELETE ALL CONSONANTS------‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳
//        DELETE ALL CONSONANTS
//        Deleting all consonants of a given String
//         String s1 ="Hello, have a good day";
//         String result = s1.replaceAll("[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]", "");
//         System.out.println(result); //eo, ae a oo a

//         String s2 = "Helicopter";
//         String s3 = s2.replaceAll("[abcdefghijlkmnopqrstuvwxyx]", " ");
//         System.out.println(s3);  //H
//        ‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩-----------------------------‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳


//        ‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩----FIND A LETTER------‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳
//        FIND A LETTER
//         Check whether the string containing the char of different string in it or not find out using inbuilt method
//         String s1 = "Umbrella";
//         String s2 = "e";
//         System.out.println("The letter 'e' is present in the word 'Umbrella': "+s1.contains(s2)); //false
//        🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩------------------‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳



//        🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩----INPUT EXAMPLE------‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳
//        INPUT EXAMPLE
//        🍚🍚🍚🍚🍚How to take input from the user
//         System.out.println("Enter Your Name");
//         Scanner sc = new Scanner(System.in);
//         String input = sc.nextLine();
//         System.out.println("Your Name is: "+input);
//        🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩------------------------‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳👩‍🦳



//        ⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️---LENGTH VS LENGTH()-------⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️
//        length vs length()
//        length ---> length of the array
//        length() ---> length of the String
//
//
//         System.out.print("Find the length of: ");
//         Scanner sc = new Scanner(System.in);
//         String input = sc.nextLine();
//
//         System.out.println(input.length());
//        👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌-------------👌👌👌👌👌👌👌👌👌👌👌👌👌👌👌

//-------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------------------




//        🕍🕍🕍🕍💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉
//        CHAPTER - 3 (DSA)
//        🕍🕍🕍🕍💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉
//        PALINDROME
//        REMOVE DUPLICATED
//        PRINT DUPLICATES
//        ANAGRAM
//        PANGRAM
//        COUNT-MAX FREQUENCY
//        UNIQUE CHARACTER CHECKER
//        COUNT CONSONANTS








//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------

//        🕍🕍🕍🕍💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉
//        CHAPTER - 4 (STRINGBUILDER AND STRINGBUFFER)
//        🕍🕍🕍🕍💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉💉

//        1. STRINGBUILDER INBUILT METHODS
//        2. FINAL VS IMMUTIBILITY
//        3. USING THE SORTING INBUILT METHODS ALPHABATICALLY
//        4. REVERSE A STRING NOT USING STRINGBUILDER

//        1. 🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️----STRINGBUILDER INBUILT METHODS------🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️
//        STRINGBUILDER INBUILT METHODS
//        StringBuilder s = new StringBuilder("Amar");
//
//        System.out.println(s.capacity());  //20
//        System.out.println(s.append(" Meher"));  //Amar Meher
//        System.out.println(s.charAt(5));  //   M
//        System.out.println(s.capacity()); //20
//        System.out.println(s.append(" Hello how are you what are you doing?")); //follows the (+1*2) principle to increase length
//        System.out.println(s.capacity()); //47
//        System.out.println(s.deleteCharAt(5));  //deleted the M present at 5 index
//        System.out.println(s.insert(5,'M')); // inserted a char M at index 5
//        System.out.println(s.length()); //48
//        System.out.println(s.reverse());  //?gniod uoy era tahw uoy era woh olleH reheM ramA
//        StringBuilder s1 = new StringBuilder("Rahul");
//        StringBuilder s2 = new StringBuilder("Hii");
//        System.out.println(s.compareTo(s1)); //-19  //?
//        System.out.println(s1.compareTo(s2));  //10  //??
//        System.out.println(s1.toString());  //Rahul --- but it is a string // suggesting to remove as redundant
//        System.out.println(s1.append(" Hii"));  //this is why it printed Rahul Hii
//        System.out.println(s1.concat);   //this is why it is opposing to use concat
//        s.setCharAt(5,'x');  //set char x at 5th index
//        System.out.println(s);  //?gniox uoy era tahw uoy era woh olleH reheM ramA
//        System.out.println(s.length());  //48
//        StringBuilder s5 = new StringBuilder(500);  //new string blank
//        System.out.println(s5.capacity()); // 500
//        s5.trimToSize();  //48
//        System.out.println(s5.length());  //0
//        System.out.println(s5);  //Blank or nulll
//        System.out.println(s.reverse()); //Amar Meher Hello how are you what are you xoing?
//        🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️------------------------------------🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️




//        2. 🧱🧱🧱🧱🧱🧱🧱🧫🧫🧫🗜️🗜️🗜️🗜️🗜️🗜️------FINAL VS IMMUTIBILITY---------️🗜️🗜️🗜️🗜️🗜️🗜️🗜️🗜️🗜️🗜️🗜️🗜️🗜️🗜️🗜️
//        (after declaring a data type final we cant assign value to a variable)

//        int num = 10;
//        System.out.println(num);  //10
//        System.out.println(num=50);  //50
//
//        final int nums =10;
//        System.out.println(nums); //10
//        System.out.println(nums =100);  //10  //can't assign a value to final variable nums

//        StringBuilder s = new StringBuilder("Hello");
//        System.out.println(s.append(" Hii"));  //Hello Hii
//        final StringBuilder s1 = new StringBuilder(("Final"));
//        System.out.println(s1.append(" Mahasihivratri")); //not affecting the mutability just changing the reference

//        final StringBuffer s = new StringBuffer("Hello");
//        System.out.println(s.append(" Hii"));  //Hello Hii
//        s = new StringBuffer("Namaste");  ////It will show compile error and can't assgin value
//        System.out.println(s); //cannot assign a value to final variable
//        🧱🧱🧱🧱🧱🧱🧱🧫🧫🧫🗜️🗜️🗜️🗜️🗜️🗜️-----------------------------------️🗜️🗜️🗜️🗜️🗜️🗜️🗜️🗜️🗜️🗜️🗜️🗜️🗜️🗜️🗜️


//        //👌👌👌👌👌👌👌👌👌👌👌👌
//        //Using the sorting inbuilt methods

//         String input = new String("AmarMeher");
//         char chArr [] = input.toLowerCase().toCharArray();
//         System.out.println(chArr); //amarmeher
//         Lecture.Arrays.sort(chArr);
//         System.out.println(chArr); //aaeehmmrr




//        🍚🍚🍚🍚🍚🍚🍚🍚🍚🍚🍚
//        //reverse a string not using the stringBuilders inbuilt method
//            String s = "THINK TWICE";
//            char chArr [] = s.toCharArray();
//            StringBuilder sb = new StringBuilder();
//
//            for(int i=chArr.length-1; i>=0; i--){
//             sb.append(chArr[i]);
//            }
//            System.out.println(sb.toString());


//        🧫🧫🧫🧫🧫🧫🧫🧫🧫🧫🧫🧫🧫🧫🧫🧫
//        Example I made for practice
//        String s = "Hello";
//        char chArr [] = s.toCharArray();
//        StringBuilder sb = new StringBuilder();
//
//        for (int i=0; i<chArr.length; i++)
//        {
//             sb.append(chArr[i]);
//        }
//        System.out.println(sb.reverse());


//        Self Practice
//        String s = new String("Hello");
//        char chArr [] = s.toLowerCase().toCharArray();
//        Lecture.Arrays.sort(chArr);
//        System.out.println(chArr);



//         //🍚🍚🍚🍚🍚🍚🍚🍚🍚🍚🍚 (Alternative method of the above Q)
//         //reverse a string not using the stringBuilders inbuilt method
//
//         String s = "PW SKILLS";
//         String chArr [] = s.split(" ");
//         StringBuilder sb = new StringBuilder();
//
//         //traverse through the charArr to get the elements put in the stringBuilder in a reverse order
//         for( int i = chArr.length-1; i>=0; i--) {
//
//             //adding all the char in the reverse order
//             sb.append(chArr[i]);
//
//             //adding a space in what we have removed from
//             if (i > 0)
//                 sb.append(" ");
//         }
//         //printing the string from sb
//         System.out.println(sb);
//         -----------------------------------------------------------

    }
}



