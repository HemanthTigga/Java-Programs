#include<iostream>
#include<vector>
using namespace std;
int main()
{
    int n;
    cin >> n;
    int rowBegin = 0,rowEnd=n-1,colBegin = 0,colEnd=n-1;
    vector<vector<int>> mat(n,vector<int>(n));
    int k=1;
    while(k<=n*n)
    {
        for(int i=colBegin;i<=colEnd;i++)
        {
            mat[rowBegin][i] = k++;
        }
        rowBegin++;
        for(int i=rowBegin;i<=rowEnd;i++)
        {
            mat[i][colEnd] = k++;
        }
        colEnd--;
        for(int i=colEnd;i>=colBegin;i--)
        {
            mat[rowEnd][i] = k++;
        }
        rowEnd--;
        for(int i=rowEnd;i>=rowBegin;i--)
        {
            mat[i][colBegin] = k++;
        }
        colBegin++;
    }
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            cout<<mat[i][j]<<"\t";
        }
        cout<<"\n"<<endl;
    }
};