//Best method
class StringReverse {
    public static void main(String[] args) {
        String str= "jasmine";
        String reversed="";
        
        char[] chArray=str.toCharArray();
        
        for(int i=chArray.length-1;i>=0;i--){
            reversed+=chArray[i];
        }
        System.out.println("String is:"+reversed);
    }
}
---------------------------------------------------------------
  //using StringBuilder
class StringReverse {
    public static void main(String[] args) {
        String str= "jasmine";
        StringBuilder sb =new StringBuilder(str);
        System.out.println(sb.reverse().toString());
    }
}
--------------------------------------------------------------
  //Two pointer
  
class StringReverse {
    public static void main(String[] args) {
        String str= "jasmine";
        char[] chArray= str.toCharArray();
        
        int left=0;
        int right=chArray.length-1;
        
        while(left<right){
            char temp=chArray[left];
            chArray[left]=chArray[right];
            chArray[right]=temp;
            
            left++;
            right--;
        }
        String reversed= new String(chArray);
        System.out.println("reversed:"+reversed);
    }
}
