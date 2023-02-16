package OTHERS;
class Calc{
    int add(int nums[])
    {
        int result = 0;
        for (int n : nums) 
        {
            result += n;
            
        }
        return result;
    }
}


public class AnonymousArray {
    
    public static void main(String[] args) {
        Calc obj = new Calc();
        // int nums [] = ;
        int result = obj.add(new int[]{5,4,2,7});
        System.out.println(result);
    }
}
