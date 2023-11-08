class Solution
{
    //Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int matrix[][])
    {
        // code here 
        int j=0;
        ArrayList<Integer> lst=new ArrayList<Integer>();
        for(int i=0;i<matrix.length;i++){
            if(j==0){
                while(j<matrix[i].length){
                    lst.add(matrix[i][j]);
                    j++;
                }
            }
            else{
                while(j>=0){
                    lst.add(matrix[i][j]);
                    j--;
                }
            }
            
            if(i%2==0)
                j=matrix[i].length-1;
            else
                j=0;
        }
        return lst;
    }
}