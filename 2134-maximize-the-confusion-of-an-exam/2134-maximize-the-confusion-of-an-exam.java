class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        
        int countT=0,countF=0,j=0,ans=0; 
        for(int i=0; i<answerKey.length() ; i++)
        {
            if(answerKey.charAt(i)=='T') countT++;
            else countF++;

            while(k<Math.min(countT,countF))
            {
                if(answerKey.charAt(j++)=='T') countT--;
                else countF--;               
            }
            ans=Math.max(ans,countT+countF);
        }

        return ans;
    }
}