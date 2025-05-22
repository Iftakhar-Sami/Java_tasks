package src.practice2;

public class p2t3 {
    public static void main(String[] args) {
        int sum =0;
        for(int i =1;i<=20;i+=2) System.out.println(i);
        int i =1;
        while(i<20){
            System.out.println(i);
            sum+=i;
            i+=2;
        }
        int j =1;
        sum=0;
        do{
            System.out.println(j);
            sum+=j;
            j+=2;
            
        }while(j<20);
    }
}