class Solution {

            public static void maker(String digits , int index , List<String> ans, String[] map,String str )
            {
                if(index >= digits.length())
                {
                    ans.add(str);
                    return ;
                }

                    
                   int num= Integer.parseInt((String.valueOf(digits.charAt(index))));
                    String value= map[num];
                   

                    for(int i=0 ; i<value.length();i++)
                    {
                        str += value.charAt(i);
                        maker(digits,index+1,ans,map,str);                     
                        str=str.substring(0,str.length()-1);
                       
                    }


            }


    public List<String> letterCombinations(String digits)
    {

        
        List<String> ans = new ArrayList<>();
                if(digits.length()==0) return ans;
            String[] map = new String[]{"" , "" , "abc" , "def" ,"ghi" , "jkl" ,"mno" , "pqrs" , "tuv" , "wxyz"};
 
// StringBuilder str = new StringBuilder();
        maker(digits,0,ans,map,"");
        return ans;
    }
}