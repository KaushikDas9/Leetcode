class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {

        List<List<String>> ans = new ArrayList<>();        

        Arrays.sort(products);

        // System.out.print(Arrays.toString(products));

        String str ="";
        for( int i=0;i<searchWord.length();i++ ) { 

             str += String.valueOf( searchWord.charAt(i) );
            List<String> list = new ArrayList<>(); 
            int temp=3;

            for( int j=0;j<products.length;j++) { 
                
                String s = products[j];
               
                if(temp == 0) break;
                // System.out.print(str + "  ");
                // System.out.println(s.substring(0,i+1));
                if( i+1 <= s.length() && str.equals(s.substring(0,i+1)) ) {    
                     list.add(products[j]);
                     temp--;
                }
                
            }
            

            ans.add(list);

        }

        return ans ;
        
    }
}