#include<stdio.h>
#include<string.h>
int main()
{
	char s[50],ch;
	int i,l;
	printf("\nenter the string you want reverse");
	gets(s);
	
	for(l=0;s[l];l++);
	for(i=0;i<l/2;i++)
	{
		ch=s[i];
		s[i]=s[l-1-i];
		s[l-1-i]=ch;
	}
	printf("reverse of string %s",s);
	return 0;
}