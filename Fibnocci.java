
class Main {
    public static String fib(int num){
        int a=0;
        int b=1;
        
        StringBuilder result=new StringBuilder();
        result.append(a).append(" ");
        result.append(b).append(" ");
        for(int i=2;i<num;i++){
            int next=a+b;
            result.append(next).append(" ");
            a=b;
            b=next;
        }
        return result.toString();
        
    }
    public static void main(String[] args) {
        int num=10;
        System.out.println(fib(num));
    }
}
