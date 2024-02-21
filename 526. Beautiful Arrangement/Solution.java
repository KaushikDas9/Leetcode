class Solution {

    public int countArrangement(int n) {

        int arr[] = new int[n+1];
        for( int i=1;i<=n;i++) arr[i]=i;

        return find( arr,1 );
    }


     public static void swap( int[] arr , int first ,int last ) { 

        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] =temp;
    } 

    public static int find( int[] arr , int index ) { 


        if( index == arr.length ) return 1;
        
        int ans= 0;
        for( int i=index;i<arr.length;i++) { 

            swap( arr,index,i );
            
            if( arr[index]%index ==0 || index % arr[index]==0 ) {
              ans += find( arr ,index+1 );
            }
            swap( arr,index,i );
        } 

        return ans ;
    }
}