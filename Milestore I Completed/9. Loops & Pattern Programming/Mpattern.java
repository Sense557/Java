public class Mpattern {
    public static void main(String[] args) {
        int n = 10;

        for(int i =0; i<n; i++){
            
            //printing M
            for(int j =0; j<n; j++){
                if(j==0 || j==n-1 || i==j && i<=(n-1)/2 || i+j == n-1 && i<=(n-1)/2){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
                
            }
            System.out.println();
        }
        
    }
}
