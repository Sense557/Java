/**
 *  Addition of Numbers
 *      
 */



// // Time Complexity: O(n)
// // Space Complexity: O(1)

// public class Addition {
//     public static void main(String[] args) {

//         int sum = 0;
//         for(int i=0; i<=10; i++)
//         {
//             sum += i;
//         }
//         System.out.println(sum);
        
//     }
// }




// 🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉



// Time Complexity: O(1)
// Space Complexity: O(1)
// Optimized Solution

// public class Addition {
//     public static void main(String[] args) {

//         int sum = 0;
//         int n = 10;
        
//         sum = (n*(n+1))/2;

//         System.out.println(sum);
        
//     }
// }


// 🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉



// Time Complexity: O(n)
// Space Complexity: O(1)
// Optimized Solution

public class Addition 
{
    public static int add(int n)
    {
        if(n<1)
        {
            return 0;
        }
        else
        {
            return n + add(n-1);    
        }
    }

    public static void main(String[] args) {

        System.out.println(add(1));
    }
}
