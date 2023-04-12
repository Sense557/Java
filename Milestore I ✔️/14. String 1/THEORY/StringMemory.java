public class StringMemory {
    public static void main(String[] args) {
        👍👍👍👍👍👍
        //As it is stored outside String constant pool but inside Heap area only 
        //where duplicated are not allowed
        //which is why it reacts as different not the same one 
        //printing =false

        String s1 = new String("pw");
        String s2 = new String("pw");
        System.out.println(s1==s2);


        🍿🍿🍿🍿🍿🍿🍿🍿🍿
        //As it is stored inside String Constant Pool
        //Where duplicates are allowed
        //which is why it prints true

        String s3 = "pw";
        String s4 = "pw";
        System.out.println(s3==s4);
    }
}
