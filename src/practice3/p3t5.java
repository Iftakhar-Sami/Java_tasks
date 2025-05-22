


public class p3t5{
     public static void main(String[] args) {
        int []arr={5,6,7,8,9,10};
        int[]revrse = new int[arr.length];
        for(int i =0;i<arr.length;i++){
            revrse[i]=arr[arr.length-1-i];
        }
        for(int i =0;i<arr.length;i++){
            System.out.println(revrse[i]);
        }
    }
}