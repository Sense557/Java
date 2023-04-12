import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

/**
 *  Hirarchy of Exception class and checked Unchecked exception
 *      
 */



public class HererarchicyOfException {
    public static void main(String[] args) {

        int result = 7/10;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = br.readLine();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
