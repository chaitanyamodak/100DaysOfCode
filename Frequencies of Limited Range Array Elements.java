class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
        // code here
        /*HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=1;i<=N;i++){
            hmap.put(i,0);
        }
        
        for(int i=0;i<N;i++){
            if(arr[i]<=N)
                hmap.put(arr[i],hmap.getOrDefault(arr[i],0)+1);
            else
                hmap.put(arr[i],0);
        }
        
        for(int i=1;i<=N;i++)
            System.out.print(hmap.get(i)+" ");
        */
        P++;                        //P=6
        for(int i=0;i<N;i++){       
            int idx=arr[i]%P-1;     //
            if(idx>=0 && idx<N)
                arr[idx]+=P;
        }
        for(int i=0;i<N;i++){
            arr[i]/=P;
        }
    }
}
