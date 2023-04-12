
public class Reverse3 {
    public static void main(String[] args) {

        // Before Reversing: pwskill java 
        // After Reversing:  llikswp avaj
        
        String str1 = "pwskill java";
        String str2 = "";

        String sarr[] = str1.split(str2);

        for (String elem : sarr) 
        {
            for(int i=elem.length()-1; i>=0; i--)
            {
                str2 += elem.charAt(i);
            }    
            str2 = str2+" ";
            
        }
        System.out.println("Before Reversing: "+str1+" ");
        System.out.println("After Reversing: "+str2+" ");
    }
}
