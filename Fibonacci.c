#include <stdio.h>

int main(void){
    int i ;
    int num;
    int head = 0;
    int mid = 0;
    int rear = 1;

    printf("\n 숫자를 입력하세요 : ");
    scanf("%d" , &num) ;

    for(i = 0 ; i < num ; i++){
        printf("%d " , head) ;
        mid = head+rear;
        head = rear;
        rear = mid;
    }
    
    printf("\n\n");

    return 0 ;
}