import java.util.ArrayList;
import java.util.Arrays;

public class PrintAllSubsequence {

    public static void PrintSubsequences(int arr[], int index, ArrayList<Integer> tempArr)
    {
        // Base Case
        if(index == arr.length)
        {
            //print the subsequence but donot print the empty entries
            if(tempArr.size() > 0)
            {
                System.out.println(tempArr);
            }
            return;
        }

        // Recursive Call

        // include
        PrintSubsequences(arr, index+1, tempArr);

        //add the value in tempArr
        tempArr.add(arr[index]);

        // donot include
        PrintSubsequences(arr, index+1, tempArr);
        
        //remove the last value
        tempArr.remove(tempArr.size()-1);

    }

    public static void main(String[] args) {
        int arr1 [] = {1,2};
        System.out.println("For the array- "+Arrays.toString(arr1));
        PrintSubsequences(arr1, 0, new ArrayList<>());

        System.out.println();

        int arr2 [] = {1,2,3};
        System.out.println("For the array- "+Arrays.toString(arr2));
        PrintSubsequences(arr2, 0, new ArrayList<>());
    

    }
}
