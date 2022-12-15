#include<iostream>
using namespace std;
class RemoveDuplicates//class declaration
{
    
    public:
  void removeElements(int a[],int n)//function
  {
      //logic
      for(int i=0;i<n;i++)
      {
          //to travel array
          for(int j=i+1;j<n;j++)
          {
              //checking duplicaytes
              if(a[i]==a[j] && i!=j)
              {
                  //removing duplicates
                 a[j]=a[j+1];
                 n--;
                 
              }
          }
      }
      //printing array
      for(int i=0;i<n;i++)
      {
           cout<<a[i]<<" ";
      }

  }

};
int main()
{
    int n;
    cout<<"enter the size of array";
    cin>>n;
    int a[n];
    cout<<"enter elements in array";
    
    for(int i=0;i<n;i++)
    {
    cin>>a[i];
    }
    RemoveDuplicates r;
r.removeElements(a,n);

}