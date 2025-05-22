package src.practice3;

import java.util.Scanner;

public class p3t4 {
     public static void main(String[] args) {
        int []arr ={5,6, 3, 25,76,32,77};
        int max =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)max=arr[i];
        }
        System.out.println(max);
    }
}
