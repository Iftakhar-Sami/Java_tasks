

import java.util.Scanner;

public class p1t9{
    public static void main(String[] args) {
        int a;
        String s;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a<40)s="F";
        else if(a<60)s="C+";
        else if(a<70)s="B";
        else if(a<80)s="A-";
        else if (a<90)s="A";
        else s="A+";
        System.out.println(s);
        sc.close();
    }
  
}