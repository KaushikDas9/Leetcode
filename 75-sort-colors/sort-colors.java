class Solution {
    public static void sort(int[] arr ,int i ,int  j)
        {
            if(i == (arr.length -1)){
            return ;
            }
        
            if(arr[j] >arr[j+1])
            {
                int temp = arr[j];
                arr[j]= arr[j+1];
                arr[j+1] = temp;
                // j++;
            }
            if(j==(arr.length-i-2))
            {
                j=0;
                sort(arr,i+1,j);
                return;
            }
           sort(arr,i,j+1);
           return;

        }
    public void sortColors(int[] nums) {
      
          sort(nums,0,0);
    }
}