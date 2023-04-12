package REVISION;

class calculate
{
    int result = 0;

    
    //additioon of two numbers
    int add (int a, int b)
    {
        result = (a + b);
        return result;
    }
    


    //addtion of elements of  an array 
    //using this method we are doing addition of elements of annonymous array
    
    int add (int arr [])
    {
        for (int n : arr) 
        {
            result += n; //21
            // result =+ n;  //10
        }
        return result;
    }
}



public class anonymArr {
    public static void main(String[] args) {
        calculate obj = new calculate();
        // System.out.println(obj.add(3,2)); //two number addition

        int arr[] = {1,3};      

        System.out.println(obj.add(arr));  //addition of an array

        // int result = obj.add(new int []{3,4,4});  //anonymous array used only once so u need to be very selective as u cant use it always
        // System.out.println(result);
    }
}
