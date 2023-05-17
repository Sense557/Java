/**
 *  Second Large Number
 */

// Time complexity: O(n)
// Space complexity: O(1)

public class SecondLarge 
{
    public static void main(String[] args) {

        int arr [] = {34,21,80,90,100};

        int secondLarge = arr[0];
        int largest = arr[0];

        for(int i = 0; i< arr.length; i++)
        {
            if(arr[i]>largest)
            {
                secondLarge = largest;
                largest = arr[i];
            }
            else if(arr[i]>secondLarge)
            {
                secondLarge = arr[i];
            }
        }
        System.out.println("The Second largest number is: "+secondLarge);

    }
}
