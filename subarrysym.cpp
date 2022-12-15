#include<iostream>
using namespace std;

class SubArraySumEqual{//class for check sum array
    int sum;

    public:
    void findsum(int a[],int n,int sumcheck){
        //logic for check sum in sub array
        for (int i = 0; i < n; i++){
            sum = a[i];
          for (int j = i+1; j < n; j++){
              //logic for checksum
            sum = sum + a[j];
            if(sum == sumcheck){
                //to checkk summ equal or not
                cout<<"sum is found at position: "<<i<<" "<<j<<"\n";//to display sum if sum found
                return;
            }
          }
            
        }
        cout<<"sum is not found";
        
    }

    

};

int main(){
    int n,sumcheck;
    cout<<"enter the size of array\n";
    cin>>n;//input size of array
    int a[n];
    cout<<"enter the elements of array\n";
    for (int i = 1; i <= n; i++){
        cin>>a[i];//input array
    }

    cout<<"enter the sum to be checked\n";
    cin>>sumcheck;//input sum which you want to check

    SubArraySumEqual A;
    A.findsum(a,n,sumcheck);//function calling
    
}