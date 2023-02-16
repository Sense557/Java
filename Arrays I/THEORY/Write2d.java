import java.util.Scanner;

public class Write2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter the no. of cols: ");
        int cols = sc.nextInt();

        int nums [][] = new int [rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print("Enter the value for nums[" + i + "][" + j + "]: ");
            
            
            nums[i][j] = sc.nextInt();
        }
    }
        

        
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(nums[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }
}


// import java.util.Scanner;

// public class Write2d {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the number of rows: ");
//     int rows = sc.nextInt();
//     System.out.print("Enter the number of columns: ");
//     int columns = sc.nextInt();

//     int[][] matrix = new int[rows][columns];

//     // Fill the matrix with values
//     for (int i = 0; i < rows; i++) {
//       for (int j = 0; j < columns; j++) {
//         System.out.print("Enter the value for matrix[" + i + "][" + j + "]: ");
//         matrix[i][j] = sc.nextInt();
//       }
//     }

//     // Print the matrix
//     for (int i = 0; i < rows; i++) {
//       for (int j = 0; j < columns; j++) {
//         System.out.print(matrix[i][j] + " ");
//       }
//       System.out.println();
//     }

//     sc.close();
//   }
// }
