public class Arrays
{
    public static void main(String[] args) {

        //Int arrays when we know the values insde an array
        int nums [] = {5,4,3,7};
            // System.out.println(nums);//[I@d716361 // as the values stored inside the heap memory location name

            System.out.print(nums[0]+" ");
            System.out.print(nums[1]+" ");
            System.out.print(nums[2]+" ");
            System.out.print(nums[3]+" ");
            System.out.println();
            


            //To automatically print all the values inside an array use loop

            // for(int i=0; i<=3; i++)
            // {
            //     System.out.println(a[i]);
            // }

            



        // String Arrays when we know the values inside the array
            // String names[] = {"Navin","Shakti","Sachin","Tendulkar"};
            // System.out.println(names[0]);
            // System.out.println(names[1]);
            // System.out.println(names[2]);
            // System.out.println(names[3]);

            //To automatically print all those values
            // for(int i=0; i<=3; i++)
            // {
            //     System.out.println(names[i]);
            // }


        //When we do not know the values inside an array or we want to assign the values in the respective places in an array
        // int nums[] = new int [4];
        // nums[0] = 1;
        // nums[2] = 3;

        // System.out.println(nums[0]); //1
        // System.out.println(nums[1]); //0
        // System.out.println(nums[2]); //3
        // System.out.println(nums[3]); //0
        // System.out.println(nums[4]); //Exception


        //When we do not the all values inside an array (Showing error)👍👍👍👍👍👍ERROR
        // String names [] = new String[3];
        //     names[0] = "Shakti";
        //     names[1] = "Amar";
        //     names[2] = "Alok";
        //     names[3] = "Bibek";

            // System.out.println(names[0]); //Shakti
            // System.out.println(names[1]); //Amar
            // System.out.println(names[2]); //Alok
            // System.out.println(names[3]); //Bibek
            // System.out.println(names[4]); //Exception
            // System.out.println(names[5]); //Exception
            // System.out.println(names[6]); //Exception
            

    }
}