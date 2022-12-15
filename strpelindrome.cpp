#include<iostream>
#include<string.h>
using namespace std;
int main(){
	char str[20];
	int len=0;
	int flag=1;
	cout<<"enter string";
	gets(str);
	
	//int strrev=str;
	for(int i=0;str[i]!='\0';i++){
		len++;
	}
		
	for(int i=0;i<len/2;i++){
if(str[i]!=str[len-1-i]){
	flag=0;
	break;
}
	}
if(flag==1){
	cout<<"string is pelindrom";
}else{
	cout<<"string is not pelindrome";
}

	return 0;
}