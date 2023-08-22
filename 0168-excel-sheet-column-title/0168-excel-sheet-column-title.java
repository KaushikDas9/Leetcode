class Solution {
    public String convertToTitle(int columnNumber) {


        StringBuilder ans= new StringBuilder();
        int temp = columnNumber ;
        while(temp>0) {
            int rem=temp%26;
            if(rem==0){
                 ans.append("Z"); temp-=1;
                //  if(temp/26 == 1) break;
            }
            else ans.append((char)(rem+64));
            temp=temp/26;
        }
        
        return ans.reverse().toString();
    }
}