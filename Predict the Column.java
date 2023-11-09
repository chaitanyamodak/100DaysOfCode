class Solution
{
    int columnWithMaxZeros(int arr[][], int N)
    {
        // code here 
        int col=-1;
        int max=0;
        for(int i=0;i<N;i++){
            int zero=0;
            for(int j=0;j<N;j++){
                if(arr[j][i]==0)
                    zero++;
            }
            if(zero>max){
                max=zero;
                col=i;
            }
        }
        return col;
    }
}