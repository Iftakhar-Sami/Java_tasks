

import java.util.Scanner;

public class p1t4 {
   
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b= (a-32)*5/9;
        System.out.println(b);
        sc.close();
    }
    

}
