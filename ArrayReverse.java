//two-pointer
import java.util.*;

class ArrayReverse {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4};
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            
            right--;
            left++;
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
--------------------------------------------------
  //Collections
  import java.util.*;

class ArrayReverse {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>(Arrays.asList(11,2,3,72,21));
        Collections.reverse(list);
        System.out.println(list);
    }
}
-------------------------------------------------
  //without collections
  import java.util.*;

class ArrayReverse {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>(Arrays.asList(11,2,3,72,21));
        LinkedList<Integer> result=new LinkedList<>();
        for(int i=list.size()-1;i>=0;i--){
            result.add(list.get(i));
        }
        System.out.println(result);
    }
}
