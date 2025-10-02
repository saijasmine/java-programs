import java.util.*;
class Main {
    public static void main(String[] args) {
        String str1= "jasmine sai";
        String str2="minejsasai";
        
        boolean anagram=checkAnagram(str1,str2);
        
        if(anagram){
            System.out.println("is anagram");
        }else{
            System.out.println("is not anagram");
        }
    }
    
    public static boolean checkAnagram(String str1,String str2){
        str1=str1.replaceAll("\\s","").toLowerCase();
        str2=str2.replaceAll("\\s","").toLowerCase();
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
