import java.util.*;
class Anagram {
    public static void main(String[] args) {
        String str1= "jasmine";
        String str2="minejs";
        
        boolean anagram=checkAnagram(str1,str2);
        
        if(anagram){
            System.out.println("is anagram");
        }else{
            System.out.println("is not anagram");
        }
    }
    
    public static boolean checkAnagram(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        
        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        return Arrays.equals(arr1,arr2);
    }
}
