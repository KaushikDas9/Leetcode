class Solution {
    public int findContentChildren(int[] g, int[] s) {
        var x=new Thread(()->Arrays.sort(g));
        var y=new Thread(()->Arrays.sort(s));
        x.start();y.start();
        try{
            x.join();y.join();
        }catch(Exception e){}
        // System.out.println(Arrays.toString(g));
        // System.out.println(Arrays.toString(s));
        int i=0,j=0,cnt=0;
        while(i<g.length && j<s.length){
            if(g[i]<=s[j]){
                cnt++;
                i++;
                j++;
            }else{
                j++;
            }
        }
        return cnt;
    }
}