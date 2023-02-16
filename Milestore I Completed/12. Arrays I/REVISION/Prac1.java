package REVISION;

public class Prac1 {
    public static void main(String[] args) {
        
        // 😀😀😀😀😀
        //why we use array 
        //to avoid storing the multiple variables
        //we store multiple values of same type in one array
        //easy to read and 
        // int a = 12;
        // int b = 13; 
        // int c = 14;

        // int a = 12, 13, 14; //error as it as array we need to follow some rules


        // 🍚🍚🍚🍚🍚🍚🍚🍚🍚🍚🍚🍚
        //just giving value that the length of the array would be only 4
        // int arr[] = new int[4];
        // System.out.println(arr);  //giving the memory address hexa decimal






        //✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️
        //initializing an array of length 4
        //giving or putting the values in the respective index of that array
        // //this is the process if you want to assign values manually for each index
        // int nums [] = new int[4];
        // System.out.println(nums[2]); //0
        //     nums[0] = 1;
        //     nums[1] = 2;
        //     nums[2] = 3;
        //     nums[3] = 4;
        //     System.out.println(nums[0]); //1
        //     System.out.println(nums[1]); //2
        //     System.out.println(nums[2]); //3
        //     System.out.println(nums[3]); //4
        //     System.out.println(nums[4]); //index out of bounds error and program stopped




        
        // ⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️
        //alternate methods for assigning value to an array
        //initializing an array with array rules with elements
        // int a [] = {12,13,14};
        // System.out.println(a.length); //3
        // System.out.println(a.length-2); //1

        // //printing the array elements
        // for(int i=0; i<a.length; i++){
        //     System.out.print(a[i] + " ");
        // }
        // System.out.println();

        ////traversing the array using the for loop






            // 🍿🍿🍿🍿🍿🍿🍿🍿🍿🍿🍿🍿
        // // String names[] = new String{3}; //value or length of the String array is 3
        // String names [] = {"Amar", "Alok", "Adil"};
        // System.out.println(names);  // giving the String address


        // //printing the String array elements
        // for(int i=0; i<names.length; i++)
        // {
        //     System.out.print(names[i]+" ");
        // }
        // System.out.println();



        ////traversing the array using the for loop






        //❔❔❔❔❔❔❔❔❔❔❔❔❔❔❔❔❔❔❔❔❔❔❔
        // //Error this is not the rigt way to initialize an array
        // names [0] = new integer [0]; //
        // System.out.println(names);






        // //✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️
        // //initializing a 2d array
        // //Printing a 2d array
        // int nums [][] =new int [3][2]; //6 elements


        // //before assigning values to the respective indec of an array
        // System.out.println(nums[0][1]); //0

        // System.out.print(nums[0][0]+" ");
        // System.out.println(nums[0][1]+" ");
        // System.out.print(nums[1][0]+" ");
        // System.out.println(nums[1][1]+" ");
        // System.out.print(nums[2][0]+" ");
        // System.out.println(nums[2][1]+" ");

        // //assigning values to the respextive index of an  array
        // nums[0][0]= 1;
        // nums[0][1]= 2;
        // nums[1][0]= 3;
        // nums[1][1]= 4;
        // nums[2][0]= 5;
        // nums[2][1]= 6;


        // //after assigning values to the respective indec of an array
        // System.out.print(nums[0][0]+" ");
        // System.out.println(nums[0][1]+" ");
        // System.out.print(nums[1][0]+" ");
        // System.out.println(nums[1][1]+" ");
        // System.out.print(nums[2][0]+" ");
        // System.out.println(nums[2][1]+" ");

        



        //⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️👌👌👌👌👌👌👌👌👌👍👍👍👍👍👍
        //Jagged array
        //what is jagged array---->
        //How to print jagged array --- when the rows of the array is not equal to print all elements of jagged array
        //we have to traverse the elements of the ith row
        // int arr [][] = {
        //                 {5,2,3,6},
        //                 {8,3},
        //                 {9,4,8}
        //                 };
        //     for(int i=0; i<arr.length; i++)
        //     {
        //         for(int j=0; j<arr[i].length; j++)
        //         {
        //             System.out.print(arr[i][j]);
        //         }
        //         System.out.println();
        //     }


        //traversing the jagged array using the for loop




        

        // //⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️✌️✌️✌️✌️✌️✌️✌️✌️
        // //How can we assign values to a jagged array 
        // //this the method showing below
        // //how to print the jagged array after assigning values to the respective index
        // int nums[][] = new int [3][];
        // nums [0] = new int [4];
        // nums [1] = new int [2];
        // nums [2] = new int [3];
        

        // nums[0][0]= 1;
        // nums[0][1]= 2;
        // nums[0][2]= 1;
        // nums[0][3]= 2;
        // nums[1][0]= 3;
        // nums[1][1]= 4;
        // nums[2][0]= 5;
        // nums[2][1]= 6;
        // nums[2][2]= 6;


        //traversing the jagged array using the for loop
        // for(int i=0; i<nums.length; i++)
        // {
        //     for(int j=0; j<nums[i].length; j++)
        //     {
        //         System.out.print(nums[i][j]);
        //     }
        //     System.out.println();
        // }



        //traversing the jagged array using the for each loop





    }
}
