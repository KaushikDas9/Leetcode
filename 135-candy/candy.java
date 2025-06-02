class Solution {
    public int candy(int[] ratings) {
        int n= ratings.length;
    
        int pre[] = new int[n];
        Arrays.fill(pre,1);
        int suff[] = new int[n];
        Arrays.fill(suff,1);

        for( int i=1;i<n;i++ ) { 
            if( ratings[i] > ratings[i-1] ) {
              
                  pre[i]=1+pre[i-1];
            }

            if( ratings[n-i] < ratings[n-1-i] ) {
                    
                    suff[n-1-i] = 1+suff[n-i];
            }
            
        }

        // System.out.println(Arrays.toString(pre));
        // System.out.println(Arrays.toString(suff));
        int ans=0;
         for( int i=0;i<n;i++ ) { 

            ans += Math.max(pre[i],suff[i]);
        }

        return ans;

    }
}