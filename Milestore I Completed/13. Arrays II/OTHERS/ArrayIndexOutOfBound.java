package OTHERS;
public class ArrayIndexOutOfBound {
    public static void main(String[] args) {
        //after exception it will not give any result
        //before exception it will run as it is.
        //To avoid that error in this we can take less value which is present not out of array

        int nums [] = {1,2,3,4};
        //     System.out.println(nums[0]);  // 1
        //     System.out.println(nums[5]);  //error index
        //     System.out.println(nums[2]);  //3


        //To avoid Exception in for loop
        //either use i<nums.length or
        //use i<=nums.length-1

        // for(int i=0; i<=nums.length-1;i++)
        for(int i = 0; i<nums.length; i++)
        {
            System.out.print(nums[i]);
        }
        System.out.println();

            
    }
}
