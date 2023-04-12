/**
 * Array
 */
public class Array {

    public static void main(String[] args) {
        //assigning values to a 1d array and printing manuallywithot a loop
        // int nums [] = new int[5];
        // nums[0] = 1;
        // nums[1] = 2;
        // nums[2] = 3;
        // nums[3] = 4;
        // nums[4] = 5;
        // System.out.println(nums[0]);
        // System.out.println(nums[1]);
        // System.out.println(nums[2]);
        // System.out.println(nums[3]);
        // System.out.println(nums[4]);


        //assigning names to a 1d array and printing manually with a loop
        // String names [] = {"Shyam", "Adil", "Amar"};
        // for(int i=0; i<=2; i++){
        //     System.out.println(names[i]);
        // }
        // System.out.println();

        //using a for loop
        // for(int i=0; i<5; i++)
        // {
        //     System.out.print(nums[i]+" ");
        // }
        // System.out.println();

        //using a for-each loop
        // for(int n:nums){
        //     System.out.print(n);
        // }
        // System.out.println();


        //assigning values to a 2d array and printing manually without using a loop
        // int nums[][] = new int [3][2];
        // nums[0][0] = 1;
        // nums[0][1] = 2;
        // nums[1][0] = 3;
        // nums[1][1] = 4;
        // nums[2][0] = 5;
        // nums[2][1] = 6;
        

        // //using a for loop
        // for(int i=0; i<=3; i++)
        // {
        //     for(int j=0; j<2; j++)
        //     {
        //         System.out.print(nums[i][j]+" ");
        //     }
        //     System.out.println();
        // }


        //using a for-each loop
        // for(int a[]:nums){
        //     for(int b : a){
        //         System.out.print(b+"  ");
        //     }
        //     System.out.println();
        // }
        


        //Concepts of jagged array in java 
        //where the size of row is fixed but not the column size
        int nums [][] = {
            {5,2,4,3},
            {1,3},
            {4,6,1}
        };

        for(int a[]:nums){
            for(int b:a){
                System.out.print(b+" ");
            }
            System.out.println();
        }



        
    }
}