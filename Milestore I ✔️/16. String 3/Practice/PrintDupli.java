public class PrintDupli {
    public static void main(String[] args) {
        
        String s = "PWSKILLS";
        char s1 [] = s.toCharArray();
        int count;

        System.out.println("this is the string before printing duplicates: "+s);
        for(int i = 0; i<s1.length; i++){
            count = 1;
            for(int j = i+1; j<s1.length; j++){
                if (s1[i]==s1[j] && s1[i] != ' ') {
                    count++;
                    s1[j]='0';
                    
                }
            }
            if(s1[i] != '0'  && count >1){
                
                System.out.println(s1[i]);
       
                
            }
        }
        

    }
}
