import java.util.Arrays;

/**
 *  Selection Sort
 */


public class SelectionSort 
{
    public static void selectionSort (int arr[])
    {
        for(int i = 0; i< arr.length; i++)
        {
            int min_idx = i;

            for(int j = i+1; j<arr.length; j++)
            {
                if(arr[j] < arr[min_idx]){
                    min_idx = j;
                }
                
            }

        if(min_idx != i)
        {
            //swap between arr[j] & arr[min_idx]
            int temp = arr[i];
            arr[i] = arr [min_idx];
            arr[min_idx] = temp;

        }
    }
}




    public static void main(String[] args) 
    {
        
        int arr [] = {20,50,17,12,19,25,97,16};

       //function calling
       selectionSort(arr);
       System.out.println("Sorted array is: ");
       System.out.println(Arrays.toString(arr));
        
    }
}
