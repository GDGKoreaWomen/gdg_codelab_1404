public class Fibonacci{
   
   /* 원본
   
        public static void main(String []args){
        int start = Integer.parseInt(args[0]);
        int fib1 = 0;
        int fib2 = 1;
        for(int i = 0; i <= (start -2); i++) {
            int fib3 = fib1 + fib2;
            System.out.println("F"+ i + " = " + fib1 + ", F" + (i+1) + " = " + fib2 + ", F" + (i+2) + " =  " + fib3);
            fib1 = fib2;
            fib2 = fib3;
        }
    }
    */

    public static long fib(int n) {
        if (n <= 1) return n;
        else return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        int start = Integer.parseInt(args[0]);
        int fib1=0;
        int fib2=1;
        
        for (int i = 0; i <= (start-2); i++) {
            int fib3 = fib1 + fib2;
            System.out.println("F"+ i + " = " + fib1 + ", F" + (i+1) + " = " + fib2 + ", F" + (i+2) + " =  " + fib3);
            
            fib1 = fib2;
            fib2 = fib3;
        }
    }

}
