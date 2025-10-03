// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static boolean armstrong(int num){
        int original=num;
        int result=0;
        int digits=String.valueOf(num).length();
        
        while(num>0){
            int digit=num%10;
            result+=Math.pow(digit,digits);
             num=num/10;
        }
        if(original==result){
            return true;
        }
        else{
            return false;
        }
    } 
    public static void main(String[] args) {
        int num=13;
        boolean result=armstrong(num);
        if(result){
            System.out.println("is armstrong");
        }else{
            System.out.println("is not armstrong");
        }
    }
}
