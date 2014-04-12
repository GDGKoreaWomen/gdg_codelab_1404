public class Fibonacci{
    public static void main(String []args){

        if (args.length == 0){
            System.out.println("please enter the argument. Input number must be under 93");
            return;
        }
        long start = Integer.parseInt(args[0]);
        long fib1 = 0;
        long fib2 = 1;
        if (Math.abs(start) < 2){
            System.out.println("abs of input number should be larger than 2");
            return;
        }
        if (Math.abs(start) > 92){
            System.out.println("You can't gain over F(+/-)93");
            return;
        }
        if (start > 0){
            for(long i = 0; i <= (start -2); i++) {
                long fib3 = fib1 + fib2;
                System.out.println("F"+ i + " = " + fib1 + ", F" + (i+1) + " = " + fib2 + ", F" + (i+2) + " =  " + fib3);
                fib1 = fib2;
                fib2 = fib3;
            }
        }
        else if (start < 0){
            for(long i = 0; i >= (start +2); i--) {
                long fib3 = fib1 - fib2;
                System.out.println("F"+ i + " = " + fib1 + ", F" + (i-1) + " = " + fib2 + ", F" + (i-2) + " =  " + fib3);
                fib1 = fib2;
                fib2 = fib3;
            }
        }
    }
}
