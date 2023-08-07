class Solution {
    public int minStartValue(int[] nums) {
        int sum=0,choto=Integer.MAX_VALUE;
        for(int i=0;i<nums.length ;i++)
        {
            sum += nums[i];
            choto = Math.min(choto,sum);
        }
        if(choto<0) return (Math.abs(choto))+1;
        return 1; 
    }
}