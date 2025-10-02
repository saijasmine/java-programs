import java.util.*;
class FrequencyCount {
    public static void main(String[] args) {
        String str="sai jasminee";
        str=str.replaceAll("\\s","").toLowerCase();
        char[] arr=str.toCharArray();
        
        TreeMap<Character,Integer> map=new TreeMap<>();
        
        for(char ch:arr){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        
        for(char ch: map.keySet()){
            System.out.println(ch+":"+map.get(ch));
        }
        
    }
}
