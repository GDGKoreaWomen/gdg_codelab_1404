import java.util.Scanner;

public class Fibonacci{
    public static void main(String []args){
		int start;

		try{
            start = Integer.parseInt(args[0]);
		}
		catch(Exception e){
            Scanner keyboard= new Scanner(System.in);
			
            System.out.print("Enter the start value: ");
            start= keyboard.nextInt();
		}
		
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
            System.out.println("F"+ i + " = " + fib1 + ", F" + (i+1) + " = " + fib2 + ", F" + (i+2) + " =  " + fib3);
            fib1 = fib2;
            fib2 = fib3;
        }
    }
}
