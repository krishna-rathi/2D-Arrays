#include <bits/stdc++.h>
using namespace std;
#define N 1000
int a[N][N];


// Driver code
int main()
{


 int t;
 cin>>t;
 while(t--){
 int n,m;
 cin>>n>>m;
 bool b[n];
 for(int i=0;i<n;i++){
    b[i]=false;
 }
 for(int i=0;i<n;i++){
     for(int j=0;j<m;j++){
        cin>>a[i][j];
        if(a[i][j]==1){
            b[i]=true;
        }
     }
 }
 for(int i=0;i<n;i++){
        if(b[i]){
    for(int j=0;j<m;j++){
        cout<<1<<" ";
    }}
    else{
      for(int j=0;j<m;j++){
        cout<<0<<" ";
      }
    }
    cout<<endl;
 }

}}
