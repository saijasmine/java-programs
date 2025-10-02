//Right-rotation
import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int k=3;
        int n=arr.length;
        int[] result=new int[n];
        
        for(int i=0;i<n;i++){
            result[(i+k)%n]=arr[i];      //result[(i+n-k)%n]=arr[i];   //left-rotation
        } 
        
        System.out.println(Arrays.toString(result));
        
    }
}
-------------------------------------------------
