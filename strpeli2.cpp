#include<stdio.h>
#include<string.h>//header file for get string
int main(){
    int size,i,j,flag=0;
    char str[size];
    printf("enter the size of string \n");
    scanf("%d",&size);//input string size
    printf("enter string \n");
    scanf("%c",&str);

    for(int i=0;i<size;i++){
    	//for string inner
        for(int j=size-1;str[i]>0;j--){
        	//for compare char from lat
        	
            if(str[i]==str[j]){
            	//for compare
            	flag=0;
            	break;
        }
    }
}
    if(flag=1){
	printf("the given string is pelindrome");
            }else{
                printf("the given string is not pelindrome");
            }

}
