#include<iostream>
using namespace std;
int main()
{
    int n;
    cout<<"enter the  number where you want to print series";
    cin>>n;//input number
    int a[n];
    a[0]=-1;
    a[1]=1;
    //logic for series
    for(int i=2;i<n+4;i++)
    {
        a[i]=a[i-1]+a[i-2];//a[2]=a[2-1]+a[2-2]=a[1]+a[0]=0+1=1,a[3]=a[2]+a[1]=1+1=2..
        cout<<a[i]<<"\t";
    }
    
    return 0;

}