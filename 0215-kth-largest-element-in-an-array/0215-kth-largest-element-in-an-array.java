class Solution {
    public int findKthLargest(int[] nums, int k) {

            PriorityQueue<Integer> ans = new PriorityQueue<>();
                
            for(int i=0 ; i<nums.length ; i++){

                   if(i<k){
                       ans.add(nums[i]); 
                   } 
                   else{
                       if(ans.peek() <  nums[i]){
                           ans.remove();
                            ans.add(nums[i]);
                       }
                   }
            }

                return ans.peek();

    }
}