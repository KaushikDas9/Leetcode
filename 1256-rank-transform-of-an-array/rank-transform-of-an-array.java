class Solution {
    public int[] arrayRankTransform(int[] arr) {

        int n = arr.length;
        int[] clone = new int[n];

        for(int i=0;i<n;i++) { clone[i] = arr[i]; }
        Arrays.sort(clone);

        HashMap<Integer,Integer> map = new HashMap<>();
        int rank =1;
        for( int i:clone) { 
            if( map.get(i) == null )  map.put(i,rank++);
        }

        int[] ans = new int[n];
        for(int i=0;i<n;i++) { 
            ans[i]=map.get(arr[i]); 
        }
        return ans;
    }
}