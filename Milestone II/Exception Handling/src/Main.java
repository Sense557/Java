public class Main {

    public static void main(String[] args) {
        int num1= 6;
        int num2 = 2;
        int result =0;
        int values [] = {5,4,3,2};

        try
        {
            result = num1/num2;
            System.out.println(values[10]);

        }

        catch (ArithmeticException e)
        {
            System.out.println("Can't divide by 0"+e);
        }
         catch (ArrayIndexOutOfBoundsException e)
         {
             System.out.println("Stay in your limit"+e);
         }


        System.out.println(result);
        // System.out.println(values[10]);
        System.out.println("Bye");

    }
}