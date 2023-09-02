class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        
   
    
        HashSet<String> set = new HashSet<>();
        
       
               
         for(int i=0; i<dictionary.length ; i++){
             set.add(dictionary[i]);
         }
        
        int[] store = new int[s.length()+1];
        
            for(int i=1; i<= s.length() ; i++){
                
                store[i]=store[i-1]+1;
                
                for(int j=i;j>=1;j--){
                    
                        String temp1= s.substring(j-1,i);
                    
                            if(set.contains(temp1)){
                                
                                store[i]=Math.min(store[i],store[j-1]);
                            }
                }
            }
        
        
        return store[s.length()];
        

      
    }
}