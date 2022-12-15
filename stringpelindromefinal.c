// Online C compiler to run C program online
#include <stdio.h>
#include<string.h>
int main() {
    // Write C code here
    //printf("Hello world");
    char str[200];
    int i,len,count=0;
    gets(str);
    len=strlen(str);
    for( i=0;i<len/2;i++){
        if(str[i]==str[len-i-1])
        count++;
    }
    if(count==i){
        printf("pelindrome");
    }else{
        printf("not pelindrome");
    }

    return 0;
}