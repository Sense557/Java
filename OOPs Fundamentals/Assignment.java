package Operators.java;
class Assignment
{
    public static void main(String [] args)
    {
        int m1, m2, m3, m4;

        m1 = m2 = m3 = m4 = 10;

        System.out.println(m1 + " " + m2 + " "+m3+ ' '+ m4);

        int a = 10;
        a += 5;
        System.out.println(a);  //15

        int b = 5;
        b -= 3;
        System.out.println(b);  //2

        int c = 10;
        c /= 5;
        System.out.println(c);   //2

        int d = 10;
        d *= 2;
        System.out.println(d);  20
    }
}