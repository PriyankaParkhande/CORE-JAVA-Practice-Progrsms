#include<stdio.h>
#include<string.h>
int main(){
	char str[50];
	printf("enter string");
	gets(str);
	int len=strlen(str);
	for(int i=len-1;str[i]>0;i--)
	{
		printf("%c",str[i]);
	}
}