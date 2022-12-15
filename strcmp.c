#include<stdio.h>
#include<string.h>
int main()
{
   
    char str1[20];
    char str2[20];
    gets(str1);
    gets(str2);
  
    int stringcmp(char str1[],char str2[]);
    if(stringcmp(str1, str2)==1)
    printf("strings are same");
    else
    printf("strings are not same");

  
}
int stringcmp(char str1[],char str2[])
{
      int len1=strlen(str1);
    int len2=strlen(str2);
 int i,cmp=0;
    if(len1!=len2){
        printf("strings length not same \n");
    }
  while(str1[i]!='\0' && str2[i]!='\0')
  {
if(str1[i]!=str2[i])
{
    cmp=1;
    break;
}
i++;
if(cmp==0 && str1[i]=='\0' && str2[i]=='\0')
{
    return 0;
}
else{
    return 1;
}
  
    }
}
