



public class p3t6 {
     public static void main(String[] args) {
        int []arr={1,3,5,7,8,3,692,3423,23};
        int odd=0,even=0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]%2==0) even++;
            else odd++;
        }
        System.out.println("even: "+even+" "+"odd: "+odd);
    }
}
