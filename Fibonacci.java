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


fib 함수를 메인에서 호출하도록함.
숫자가 2보다 작을 경우 자신을 return 하고
아닌 경우 재귀함수로 전, 전전 숫자를 더하여 계산함