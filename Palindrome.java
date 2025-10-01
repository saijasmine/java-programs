//String Palindrome-- Two Pointer
class StringPalindrome {
    public static void main(String[] args) {
        String str="madam";
        boolean palindrome=true;
        
        int left=0;
        int right=str.length()-1;
        
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                palindrome=false;
                break;
            }
            left++;
            right--;
        }
        
        if(palindrome){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not a palindrome");
        }
    }
}
------------------------------------------------------------------
//StringPalindrome -- by reversing using sb
class StringPalindrome {
    public static void main(String[] args) {
        String str="madm";
        StringBuilder sb= new StringBuilder(str);
        
        String reversed= sb.reverse().toString();
        
        if(str.equals(reversed)){
            System.out.println("Palindrome");
        }else{
            System.out.println("not a Palindrome");
        }
    }
}
----------------------------------------------------------------------
  //NumberPalindrome -- by reversing
  
class NumberPalindrome {
    public static void main(String[] args) {
        int num=21;
        int original=num;
        int reversed=0;
        
        while(num>0){
            int digit=num%10;
            reversed=reversed*10+digit;
            num=num/10;
        }
        if(original==reversed){
            System.out.println("Is a palindrome");
        }else{
            System.out.println("Is not a palindrome");
        }
    }
}
