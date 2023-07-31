class Solution
 {
    public int divisorSubstrings(int num, int k)
    {
        String str = String.valueOf(num);
        int n = str.length();

        if(n==k) return 1;




        String temp ="";
        for(int i=0 ; i<k-1 ;i++)
        {
            temp += String.valueOf(str.charAt(i));
        }
        int count=0;
        for(int i=k-1 ; i<n ;i++)
        {
             temp += String.valueOf(str.charAt(i));
             int num1=Integer.parseInt(temp);
             if(num1 !=0 && num % num1 == 0 )  count++;
             temp =temp.substring(1,temp.length());
        }
        return count;
    }
}