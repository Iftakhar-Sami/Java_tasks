
import java.util.Scanner;

public class p1t6 {
    
    public static void main(String[] args) {
        double a,b,c,d;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c= sc.nextInt();
        double s = (a+b+c)/2.0;
        d = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println(d);
        sc.close();
    }
  
}
