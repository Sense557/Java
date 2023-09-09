// public class Power {

//     public static int powerOfElement(int a, int b)
//     {
//         if(b == 1)
//         {
//             return a;
//         }
//         else 
//         {
//             return a * powerOfElement(a, b-1);
//         }
//     }

//     public static void main(String[] args) {
        
//         int a = 2;
//         int b = 3;

//         int result = powerOfElement(a,b);
        
//         System.out.println(result);
//     }
// }


// 🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉


public class Power {

    public static int powerOfElement(int a, int b)
    {
        if(b == 1)
        {
            return a;
        }
        else 
        {
            int mid = b/2;
            int result = powerOfElement(a, mid);
            int finalResult = result * result;

            if(b % 2 != 0)
            {
                return finalResult * a;
            }
            else
            {
                return finalResult;
            }
        }
    }

    public static void main(String[] args) {
        
        int a = 2;
        int b = 5;

        int result = powerOfElement(a,b);
        
        System.out.println(result);
    }
}

// 🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉
