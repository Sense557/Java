// time complexity : O(n)
// space complexity: O(1)

/**
 *  Missing Number in an array
 *  
 */



public class MissingNumber 
{
    public static void main(String[] args) 
    {

        int arr [] = {1,2,4,7,6,5};
        int n = arr.length;
        int sum = 0;

        //sum of natural numbers in an arr
        int sum_natural_num = ((n+1)*(n+2))/2;

        //sum of current element of an arr
        for(int i = 0; i<n; i++)
        {
            sum += arr[i];
        }
        int missing_element = 0;
        missing_element = sum_natural_num - sum;
   
        System.out.println("The missing number is: "+ missing_element);    

    }
}
