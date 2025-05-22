

import java.util.Scanner;

public class p1t10 {
    public static void main(String[] args) {
        int a,b;
        char c;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c= sc.next().charAt(0);
        if(c=='+') System.out.println(a+b);
        else if(c=='-') System.out.println(a-b);
        else if(c=='*') System.out.println(a*b);
        else System.out.println(a/b);
        sc.close();
    }
}
