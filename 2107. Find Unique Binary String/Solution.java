class Solution {

    public static void find(int i , int n , HashSet<String> set , String str , ArrayList<String> ans ) { 

        if( i==n ) { 
            ans.add(str);
            return ;
        }
        

        str += "0";
        find( i+1,n,set,str,ans);
        str = str.substring(0,str.length()-1);
        str += "1";
        find( i+1,n,set,str,ans);

        return ;
    }

    public String findDifferentBinaryString(String[] nums) {
        
        int n= nums.length;
        HashSet<String> set = new HashSet<>();
        for( String i:nums) set.add(i);
        ArrayList<String> ans =  new ArrayList<String>(); 
        find(0 ,n, set ,"", ans );

        for( String i:ans) { 
            if( !set.contains(i)) return i;
        }
        return "";
    }
}