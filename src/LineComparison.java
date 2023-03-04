import java.util.Scanner;
public class LineComparison
{
    public static void main(String[] args)
    {
        System.out.println ("Welcome to Line Comparison Computation Program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the co-ordinate x1");
        int x1 = sc.nextInt();
        System.out.println("Enter the co-ordinate y1");
        int y1 = sc.nextInt();
        System.out.println("Enter the co-ordinate x2");
        int x2 = sc.nextInt();
        System.out.println("Enter the co-ordinate y2");
        int y2 = sc.nextInt();
        System.out.println("Enter the co-ordinate x3");
        int x3 = sc.nextInt();
        System.out.println("Enter the co-ordinate y3");
        int y3 = sc.nextInt();
        System.out.println("Enter the co-ordinate x4");
        int x4 = sc.nextInt();
        System.out.println("Enter the co-ordinate y4");
        int y4 = sc.nextInt();
        //Calculating length
        int l1 = (int) Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
        int l2 = (int) Math.sqrt(((x4 - x3) * (x4 - x3)) + ((y4 - y3) * (y4 - y3)));

//The program also compares the two strings using the equals and
// compareTo methods of the String class
        String s1=String.valueOf(l1);
        String s2=String.valueOf(l2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s2));
    }
}