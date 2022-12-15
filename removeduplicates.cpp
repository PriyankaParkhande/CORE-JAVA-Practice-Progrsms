#include<iostream>
using namespace std;
class RemoveDuplicates//class declaration
{
    public:
int duplicates(int arr[], int n)
{
    if (n==0 || n==1)
      return n;

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
   int arr[] = {1,3,5,2,1,7,8,1,4};
   int n = sizeof(arr) / sizeof(arr[0]);

RemoveDuplicates r;
   r.duplicates(arr, n);

   for (int i=0; i<n; i++)
    cout << arr[i] << " ";

   return 0;
}