#include<stdio.h>

int main(void){

    unsigned long fib1= 0, fib2= 1, fib3;
    int start;

    printf("input the index value: ");
    scanf("%d",&start);								// enter the index value from console by user

    switch(start){	
    case 0:											// if index value is 0
        printf("F0 = %lu\n", fib1);					// print the fibonacci(0)
        break;
	case 1:											// if index value is 1
        printf("F1 = %lu\n", fib2);					// print the fibonacci(1)
        break;			
    default:										// if index value more than 1
        for(int i=0; i<=(start-2); i++){			// calculate the result and print process and result
            fib3= fib1 + fib2;
            printf("F%d = %lu, F%d = %lu, F%d = %lu\n", i, fib1, i+1, fib2, i+2, fib3);
            fib1= fib2;
            fib2= fib3;
        }
    }

    return 0;
}
