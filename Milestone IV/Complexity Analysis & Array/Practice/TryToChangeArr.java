/**
 *  Try to change the all values present in the array
 */



 // Time Complexity: O(n)
 // Space Complexity: O(1)


public class TryToChangeArr 
{
    public static void main(String[] args) 
    {

        int arr [] = {0,2,4,1,3};

        for(int i = 0; i<arr.length; i++)
        {
            arr [i] = arr[(arr[i]+3) %arr.length];

            System.out.print(arr[i]+" ");
        }
        
    }
}
