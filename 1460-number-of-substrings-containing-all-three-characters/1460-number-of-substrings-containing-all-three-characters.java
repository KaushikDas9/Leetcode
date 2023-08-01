class Solution {
    public int numberOfSubstrings(String s) {
        HashMap<Character,Integer> store = new HashMap<>();
        int count=0;
        int n=s.length();
        int i=0,j=0;
        while(i<n)
        {
            store.put(s.charAt(i) ,store.getOrDefault(s.charAt(i),0)+1);
            if(!store.containsKey('a') && !store.containsKey('b') && !store.containsKey('c') ) {i++;}

            else
            {
             while(store.containsKey('a') && store.containsKey('b') && store.containsKey('c'))          {
                    count += n-i;
                    store.put(s.charAt(j) ,store.getOrDefault(s.charAt(j),0)-1);
                    if(store.get(s.charAt(j)) ==0 ) store.remove(s.charAt(j));
                    j++;
                }
            }
            i++;
        }

        return count;
    }
}