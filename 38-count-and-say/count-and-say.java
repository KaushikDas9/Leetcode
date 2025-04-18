class Solution {
    public String countAndSay(int n) {
        
        List<Integer> list = new ArrayList<>();

        if(n==1) return "1";
        if(n==2) return "11";
        String str = "11";
        int count=1;
        for(int i=2 ;i<n ; i++)
        {
                String temp="";
                str = str + "%";

             for(int j=0; j<str.length()-1 ; j++)
             {
                 if(str.charAt(j) == str.charAt(j+1))
                 {
                        count++;
                 }
                 else
                 {
                     temp = temp + Integer.toString(count);
                     temp= temp + str.charAt(j);
                     count=1;

                 }
             }   
             str = temp;
        }
        return str;
        
    }
}