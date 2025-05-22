package src.practice3;

public class p3t7 {
    public static void main(String[] args) {
        int first = 0,second = 1,third = 0;
        System.out.println(first+" "+second);
        for(int i =0;i<12;i++){
            third = first + second;
            System.out.println(third);
            first = second;
            second = third;
        }
    }
}
