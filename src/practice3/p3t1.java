
public class p3t1 {
    public static void main(String[] args) {
        
        int []arr={1,2,3,4,5,6,7,8,9,10}; 
        double sum =0,avg;

        for(int i =0 ;i<arr.length;i++){
            sum+=arr[i];
        }
        avg=sum/arr.length;
        System.out.println(avg);
    }
}
