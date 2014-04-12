public class Fibonacci{
    public static void main(String []args){
        if (args.length == 0){
            System.out.println("please enter the argument");
            return;
        }
        long start = Integer.parseInt(args[0]);
        long fib1 = 0;
        long fib2 = 1;
        if (start < 2){
            System.out.println("input number should be larger than 2");
            return;
        }
        if (start > 92){
            System.out.println("You can't gain over F93");
            start = 92;
        }
        for(long i = 0; i <= (start -2); i++) {
            long fib3 = fib1 + fib2;
            System.out.prlongln("F"+ i + " = " + fib1 + ", F" + (i+1) + " = " + fib2 + ", F" + (i+2) + " =  " + fib3);
            fib1 = fib2;
            fib2 = fib3;
        }
    }
}
