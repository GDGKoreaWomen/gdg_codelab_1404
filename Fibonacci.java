public class Fibonacci{
    public static void main(String []args){

        if (args.length == 0){
            System.out.println("please enter the argument. Input number must be under 93");
            return;
        }
        long start = Integer.parseInt(args[0]);
        long fib1 = 0;
        long fib2 = 1;
        if (start < 2){
            
        }
        if (start > 92){
            System.out.println("You can't gain over F93");
            start = 92;
        }
        for(long i = 0; i <= (start -2); i++) {
            
           
            System.out.println(fibo());
            
        }
    }

    public static long fibo(long start) {
        if ( start < 3) {
            System.out.println("input number should be larger than 2");
            return 0;
        } else {
            fibonacci(start-2) + fibonacci(start-1);
        }
    }

}
