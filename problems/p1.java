import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
    
   Scanner sc = new Scanner(System.in);
System.out.println("Enter the radius");
   double radius = sc.nextDouble();


double conferencecircle = 2 * Math.PI * radius;
double area = Math.PI * Math.pow(radius , 2);

System.out.println("the conference of circle is " + conferencecircle);
System.out.println(area);
    }
}
