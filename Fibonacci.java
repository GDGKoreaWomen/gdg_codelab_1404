 public class Fibonacci { 
     public static int fib(int n) {
                 if (n < 2) {
                    return n;
                 }
                 else {
           return fib(n-1)+fib(n-2);
                 }
    }
 
         public static void main(String[] args) {
        for (int i=0; i<=46; i++)
            System.out.print(fib(i)+", ");
    }    
}


