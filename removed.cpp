#include<iostream>
using namespace std;
class RemoveDuplicates//class declaration
{
    public:
int duplicates(int arr[], int n)//fun for remove duplicate
{
    //logic

   
    int j = 0;

    for (int i=0; i < n-1; i++)
        if (arr[i] != arr[i+1])
           arr[j++] = arr[i];

    arr[j++] = arr[n-1];

    return j;
}
};

int main()
{
    int n;
    cout<<"enter the size of array";
    cin>>n;

    cout<<"enter elements in array";
    int a[n];
    for(int i=0;i<n;i++)
    {
    cin>>a[i];//input array
    }

   //{10, 20, 20, 30, 40, 40, 40, 50, 50};
   int n = sizeof(a) / sizeof(a[0]);

RemoveDuplicates r;
   r.duplicates(a, n);

   for (int i=0; i<n; i++)
    cout << a[i] << " ";

   return 0;
}