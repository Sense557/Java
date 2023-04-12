package Lecture;

public class Arrays {
    public static void main(String[] args) {


        // ⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️
        //Array Revision
        //1d regular array
        //Normally creating an array of length 5
        //giving values to the respective index of an array
        //printing the array index manually

        // int arr []= new int [5];

        // arr[0] = 1;
        // arr[1] = 2;
        // arr[2] = 3;
        // arr[3] = 4;
        // arr[4] = 35;


        // System.out.print(arr[0]+" ");
        // System.out.print(arr[1]+" ");
        // System.out.print(arr[2]+" ");
        // System.out.print(arr[3]+" ");
        // System.out.print(arr[4]+" ");

        // System.out.println();




        //printing the array index using advanced for each loop or advanced loop or for each loop
        //Disadvantages of for each loop ----->
            //you don't have full control over an array where to start and where to stop
            //once it started it will traverse the whole array indexes
        // for(int elem: arr)
        // {
        //     System.out.print(elem+" ");
        // }



        //printing the array index using for loop
        //Advantages of for loop ------>
            //you have full control over an array where to start and where to stop
            //you can start from which index u want and stop in that way also
        // for(int i =0; i<arr.length; i++){
        //     System.out.println(arr[i]);
        // }



        // ✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️✌️
        //traverse an 2d array
        //giving the values to the array indexes manually

        // int arr1 [][] = new int [3][2];

        // arr1 [0][0] = 1;
        // arr1 [0][1] = 1;
        // arr1 [1][0] = 1;
        // arr1 [1][1] = 1;
        // arr1 [2][0] = 1;
        // arr1 [2][1] = 1;

        // System.out.print(arr1[0][0]);
        // System.out.println(arr1[0][1]);
        // System.out.print(arr1[1][0]);
        // System.out.println(arr1[1][1]);
        // System.out.print(arr1[2][0]);
        // System.out.println(arr1[2][1]);




        //traverse a 2d regular array
        //using for each loop /advanced loop

        // for(int elem []: arr1)
        // {
        //     for(int n : elem)
        //     {
        //         System.out.print(n);
        //     }
        //     System.out.println();
        // }





        //traverse a 2d array
        //using for loop

        // for(int i=0; i<arr1.length; i++){
        //     for(int j=0; j<arr1[i].length; j++){
        //         System.out.print(arr1[i][j]);
        //     }
        //     System.out.println();
        // }





        //😀😀😀😀😀😀😀😀😀😀
        //jagged 2d array


        //directly giving the values without using the length of the array
        //manually println the values
        // int arr2 [][] = {
        //                 {1,2,3},
        //                 {2,3},
        //                 {3,4,5,6}
        //                         };


        // System.out.print(arr2[0][0]);
        // System.out.print(arr2[0][1]);
        // System.out.println(arr2[0][2]);
        // System.out.print(arr2[1][0]);
        // System.out.println(arr2[1][1]);
        // System.out.print(arr2[2][0]);
        // System.out.print(arr2[2][1]);
        // System.out.print(arr2[2][2]);
        // System.out.println(arr2[2][3]);




        //How to declare the size of the jagged array & printing manually
        // int arr2 [][] = new int [3][];

        // arr2 [0] = new int [3];
        // arr2 [1] = new int [2];
        // arr2 [2] = new int [4];





        // System.out.println(arr2.length);

        // arr2 [0][0] = 1;
        // arr2 [0][1] = 1;
        // arr2 [0][2] = 1;
        // arr2 [1][0] = 1;
        // arr2 [1][1] = 1;
        // arr2 [2][0] = 1;
        // arr2 [2][1] = 1;
        // arr2 [2][2] = 1;
        // arr2 [2][3] = 1;

        // System.out.print(arr2[0][0]);
        // System.out.print(arr2[0][1]);
        // System.out.println(arr2[0][2]);
        // System.out.print(arr2[1][0]);
        // System.out.println(arr2[1][1]);
        // System.out.print(arr2[2][0]);
        // System.out.print(arr2[2][1]);
        // System.out.print(arr2[2][2]);
        // System.out.println(arr2[2][3]);






        //printing jagged array using for each loop /advanced for loop

        // for(int elem[]: arr2)
        // {
        //     for(int n : elem)
        //     {
        //         System.out.print(n);
        //     }
        //     System.out.println();
        // }




        //printing jagged array using for loop
        //for loop cant print the jagged array
        //as it can only traverse the only regular arrays
        //it  is the disadvantage of the for loop

        // for(int i =0; i<arr2.length; i++)
        // {
        //     for(int j=0; i<arr2[i].length; j++)
        //     {
        //         System.out.print(arr2 [i][j]);
        //     }
        //     System.out.println();
        // }







        // ⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️
        //take user input for the 1d regular array



//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the length of the 1d array: ");
//        int length = sc.nextInt();

//        int nums [] = new int [length] ;
//        for(int i=0; i<nums.length; i++)
//        {
//            System.out.print(nums[i]+" ");
//        }
//        System.out.println();
//        sc.close();





        //take user input for the 2d regular array

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the rows length of the array: ");
        // int rows = sc.nextInt();
        // System.out.println("Enter the length of the column:");
        // int column = sc.nextInt();

        // int arr1 [][] = new int [rows][column];

        // for(int i =0; i<arr1.length; i++)
        // {
        //     for(int j=0; j<arr1[i].length; j++)
        //     {
        //         System.out.print(arr1[i][j]);
        //     }
        //     System.out.println();
        // }

        // sc.close();

    }
}
