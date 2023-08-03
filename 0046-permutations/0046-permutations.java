class Solution 
{

public static void swap(int[] arr ,int  index , int j)
{
                 int temp = arr[index];
                        arr[index]=arr[j];
                        arr[j]=temp;
}

    public static void maker(int[] arr , int index , List<List<Integer>> ans )
    {
            if(index >= arr.length)
            {
                List<Integer> ds = new ArrayList<>();

                    for(int i = 0 ;i < arr.length ; i++)
                    {
                        ds.add(arr[i]);
                    }

                 ans.add(new ArrayList<>(ds));    
                 return ;
            }


                for(int j = index ; j < arr.length ; j++ )
                {
                        swap(arr , index , j);

                        maker(arr , index+1 , ans);

                        swap(arr, j,index);
                }

    }


    public List<List<Integer>> permute(int[] nums)
    {
        List<List<Integer>> ans = new ArrayList<>();
        maker(nums , 0 , ans);
        return ans;
    }
}