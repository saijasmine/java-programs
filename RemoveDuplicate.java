//Integer--Set
import java.util.*;
class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> list =Arrays.asList(1,2,3,1,2,3);
        HashSet<Integer> set=new HashSet<>(list);
        for(int i:set){
            System.out.println(i);
        }
    }
}
--------------------------------------------------------
//String --Set
import java.util.*;
class RemoveDuplicate {
    public static void main(String[] args) {
        List<String> list =Arrays.asList("sai","sai","jas");
        HashSet<String> set=new HashSet<>(list);
        for(String i:set){
            System.out.println(i);
        }
    }
}
---------------------------------------------------------
//in a string
import java.util.*;
class RemoveDuplicate {
    public static void main(String[] args) {
        String str="programming";
        HashSet<Character> set=new HashSet<>();
        char[] arr=str.toCharArray();
        StringBuilder result=new StringBuilder();
        
        for(char ch:arr){
            if(!set.contains(ch)){
                set.add(ch);
                result.append(ch);
            }
        }
        System.out.println(result.toString());
    }
}
--------------------------------------------------------------
//without Set
import java.util.*;
class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,3,2,1);
        List<Integer> result=new LinkedList<>();
        for(int i=0;i<list.size();i++){
            int a=list.get(i);
            boolean duplicate=false;
            for(int j=0;j<result.size();j++){
                if(a==list.get(j)){
                    duplicate=true;
                }
            }
            if(!duplicate){
                result.add(a);
            }
        }
        System.out.println(result);
    }
}
