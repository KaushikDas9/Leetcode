class Solution {

  public HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm)
    {
        HashMap<String, Integer> temp
            = hm.entrySet()
                  .stream()
                  .sorted((i1, i2)
                              -> i1.getValue().compareTo(
                                  i2.getValue()))
                  .collect(Collectors.toMap(
                      Map.Entry::getKey,
                      Map.Entry::getValue,
                      (e1, e2) -> e1, LinkedHashMap::new));
 
        return temp;
    }

    public String frequencySort(String s) {
        
        HashMap<String,Integer> map = new HashMap<>();

        for( int i=0;i<s.length();i++ ) { 

            map.put( String.valueOf( s.charAt(i) ) , map.getOrDefault( String.valueOf( s.charAt(i) ) , 0 )+1 );
        } 
        StringBuilder ans =new StringBuilder();
        HashMap<String,Integer> newMap = new HashMap<>();
            newMap = sortByValue(map);

        for( Map.Entry<String, Integer> entry : newMap.entrySet() ) { 
            
            while( entry.getValue() != 0 ) { 
                ans.append( entry.getKey() );
                newMap.put( entry.getKey(),entry.getValue()-1 );
            }
        }
         ans.reverse();
         return ans.toString();
    }
}