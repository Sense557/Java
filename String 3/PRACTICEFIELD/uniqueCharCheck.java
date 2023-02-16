class uniqueCharCheck {

    static boolean uniChCheck(String s)
    {
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            for(int j = i+1; j<s.length(); j++){
                if (s.charAt(j)==ch) {
                    return false;
                }
            }
            
        }
        return true;

    }
    public static void main(String[] args) {
        String s = "hello";
        if(uniChCheck(s)){
            System.out.println("all unique");
        }else{
            System.out.println("no unique");
        }
    }
}
