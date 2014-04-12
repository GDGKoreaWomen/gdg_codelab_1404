import java.util.Scanner;

public class Fibonacci{
    public static void main(String []args){
		int start;

		try{
        	start = Integer.parseInt(args[0]);
		}
		catch(Exception e){
//			System.out.println("No Argument.\nPlease enter the Input Value");
			Scanner keyboard= new Scanner(System.in);
			
			System.out.print("Enter the start value: ");
			start= keyboard.nextInt();
		}
		
        long fib1 = 0;
        long fib2 = 1;
        
        switch(start){
        case 0:
        	System.out.println("F0 = "+fib1);
        	break;
        case 1:
        	System.out.println("F0 = "+fib1);
        	break;
        default:
        	for(int i = 0; i <= (start -2); i++) {
                long fib3 = fib1 + fib2;
                System.out.println("F"+ i + " = " + fib1 + ", F" + (i+1) + " = " + fib2 + ", F" + (i+2) + " =  " + fib3);
                fib1 = fib2;
                fib2 = fib3;
            }
        }
    }
}
