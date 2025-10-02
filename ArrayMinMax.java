
class Main {
    public static void main(String[] args) {
        int[] arr={12,32,13,2,7};
        
        int max=arr[0];
        int min=arr[0];
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
-----------------------------------------------
    //collections
    import java.util.*;

class Main {
    public static void main(String[] args) {
         List<Integer> list=new LinkedList<>(Arrays.asList(1,2,43,21));
         int min=Collections.min(list);
         int max=Collections.max(list);
         
         System.out.println(min);
         System.out.println(max);
    }
}
