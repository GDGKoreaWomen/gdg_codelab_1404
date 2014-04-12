/*피보나치 수열 
  제 0항을 0, 제 1항을 1로 두고, 둘째 번 항부터는 바로 앞의 두 수를 더한 수로 놓는다. 
  예) (0), 1, 1, 2, 3, 5, 13, 21, 34, 55, 89, 114, 233, 377, 610, 987 */

public class Fibonacci{
    public static void main(String []args){
        int start = Integer.parseInt(args[0]);	// start는 제 몇항까지 출력할 것인지
        int fib1 = 0;
        int fib2 = 1;
		
        for(int i = 0; i <= (start -2); i++) {	// 제1항과 제2항은 이미 정해져 있으므로 start-2를 해야 한다.
            int fib3 = fib1 + fib2;		// n번째 항 = (n-1)번째 항 + (n-2)번째항 
            System.out.println("F"+ i + " = " + fib1 + ", F" + (i+1) + " = " + fib2 + ", F" + (i+2) + " =  " + fib3);
            fib1 = fib2;
            fib2 = fib3;
        }
    }
}
