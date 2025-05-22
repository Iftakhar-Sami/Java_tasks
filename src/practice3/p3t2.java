

import java.util.Scanner;

public class p3t2 {
    public static void main(String[] args) {
        int sales ,attendance;;
        Scanner sc = new Scanner(System.in);
        sales = sc.nextInt();
        attendance = sc.nextInt();
        int bonus;
        if(sales>=95 &&attendance ==100) bonus =60;
        else if(sales>=95 && attendance>=90)bonus=40;
        else if(sales>=80 && attendance==100)bonus=40;
        else if(sales>=80 && attendance>=90)bonus=20;
        else bonus =5;
        System.out.println(bonus);
    }
}
