package Lecture;

public class PatternPrinting {
    public static void main(String[] args) {
        int n = 10;


        for(int i=0; i<n; i++)
        {
        //1 A Pattern Print
            for(int j=0; j<n; j++)
            {
                if (i==0 || j==0 || i ==(n-1)/2 || j==n-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            //2 B Pattern Print
            for(int j=0; j<n; j++)
            {
                if (i==0 && j>0 && j<n-1 ||
                    j==0 && i>0 ||
                    j==n-1 && i>0||
                    i==(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            //B
            for (int j=0; j<n; j++)
            {
                if(i==0 && j<(n-1) ||
                j==0 ||
                i==n-1 && j<(n-1) ||
                j==(n-1) && i>0 && i<(n-1)/2 && i<n-1 ||
                j==(n-1) && i>(n-1)/2 && i<(n-1) ||
                i==(n-1)/2 && j<(n-1) )
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");


            }
            System.out.print("  ");
            //C
           for (int j=0; j<n; j++)
                    {
                        if( i==0 && j>0 && j<n-1 ||
                            i== n-1 && j>0 && j<n-1||
                            j==0 && i>0 && i<(n-1)/2 ||
                            j==0 && i>=(n-1)/2 && i<n-1)

                        {
                            System.out.print("*");
                        }
                        else
                            System.out.print(" ");

            }
            System.out.print("  ");
            //D
            for(int j=0; j<n; j++)
            {
                if(i==0 && j<(n-1) || j==0 || j==(n-1) && i>0 && i<(n-1) ||i==n-1 && j<(n-1))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            //E
            for(int j=0; j<n; j++)
            {
                if (i==0 || j==0 || i==(n-1)/2 ||i==n-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            //F
            for(int j=0; j<n; j++)
            {
                if (i==0 || j==0 || i==(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            //G
            for(int j=0; j<n; j++)
            {
                if (i==0 || j==0 || i==n-1 && j<(n-1)/2 || j==(n-1)/2 && i>(n-1)/2 || i==(n-1)/2 && j>=(n-1)/2 || j==n-1 && i>(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            //H
            for(int j=0; j<n; j++)
            {
                if (j==0 || j==n-1 || i==(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        System.out.println();
        //〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️//
        //〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️//
        //〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️//
        //〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️//


        for(int i=0; i<n; i++)
        {
        //1 Rectangle
            for(int j=0; j<n; j++)
            {
                if (i==0 || j==0 || j==n-1 ||i==n-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            //2 Rectangle with diagonal
            for (int j=0; j<n; j++)
            {
                if(i==0 || j==0 || j==n-1 ||i==n-1 || i==j || i+j ==n-1)
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.print("  ");
            //3  Rectangle with only upper diagonal filled
            for(int j=0; j<n; j++)
            {
                if (i==0 || j==0 || j==n-1 ||i==n-1 ||
                    i+j<=(n-1)/2 || j-i >= (n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
        System.out.println();

//〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️//
//〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️//
//〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️//
//〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️//


        for(int i=0; i<n; i++)
        {
        //4 Rectangle with diagonal and filled sides
            for(int j=0; j<n; j++)
            {
                if (i==0 || j==0 || j==n-1 ||i==n-1 || i>=j || i+j >=n-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            //5 Rectangle with diagonal with more divides
            for(int j=0; j<n; j++)
            {
                if (i==0 || j==0 || j==n-1 ||i==n-1 || i==j || i+j ==n-1||
                    i+j==(n-1)/2 || i+j == (n-1)+(n-1)/2 ||
                    i-j == (n-1)/2 || j-i == (n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            //6 Rectangle with diagonal with more divides but filled
            for(int j=0; j<n; j++)
            {
                if (i==0 || j==0 || j==n-1 ||i==n-1 || i==j || i+j ==n-1||
                    i+j<=(n-1)/2 || i+j >= (n-1)+(n-1)/2 ||
                    i-j >= (n-1)/2 || j-i >= (n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            //7 Rectangle without diagonal with more divides but filled
            for(int j=0; j<n; j++)
            {
                if (i==0 || j==0 || j==n-1 ||i==n-1 ||
                    i+j<=(n-1)/2 || i+j >= (n-1)+(n-1)/2 ||
                    i-j >= (n-1)/2 || j-i >= (n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            //8 Rectangle without diagonal with more divides but filled and hole is moved upside
            for(int j=0; j<n; j++)
            {
                if (i==0 || j==0 || j==n-1 ||i==n-1 || i>=j  || i+j >=n-1 ||
                    i+j<=(n-1)/2 || i+j >= (n-1)+(n-1)/2 ||
                    i-j >= (n-1)/2 || j-i >= (n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            //9 Rectangle without diagonal with more divides but filled and one side stretched
            for(int j=0; j<n; j++)
            {
                if (i==0 || j==0 || j==n-1 ||i==n-1 ||
                    i+j<=(n-1)/2 || i+j >= (n-1)+(n-1)/2 ||
                    i-j >= (n-1)/2 || j-i >= (n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.print("           ");

            //10 Rectangle without diagonal with more divides but filled and one side more stretched
            for(int j=0; j<n; j++)
            {
                if (i==0 || j==0 || j==n-1 ||i==n-1 ||
                    i+j<=(n-1)/2 || i+j >= (n-1)+(n-1)/2 ||
                    i-j >= (n-1)/2 || j-i >= (n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}