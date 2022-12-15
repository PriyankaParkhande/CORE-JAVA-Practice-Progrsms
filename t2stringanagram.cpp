#include<iostream>
#include<string.h>
using namespace std;
int main()
{
   int flag=0;
    cout<<"enter elements in string string 1";
    char a[50];
    char b[50];
    gets(a);
     cout<<"enter elements in string 2";
    gets(b);
    int len1,len2;
    len1=strlen(a);
    len2=strlen(b);
    if(len1==len2){
    	for(int i=0;i<len1;i++)
    {
    for(int j=i+1;j<len2;j++)
{
    if(a[i]==a[j])
    {
    	flag=0;
    	break;
   
    }
    
    
}  
    
}
if(flag==0){
	 cout<<"the given strings are anagram";
}else{
        cout<<"the given strings are not anagram";
    }
	}else{
		cout<<"string size not same";
	}
    
return 0;
}