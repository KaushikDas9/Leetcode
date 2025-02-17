class Solution {
    public boolean isPalindrome(String s) {
        List<Character> c  = new ArrayList<Character>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) { // Keep only letters and digits
                c.add(Character.toLowerCase(ch)); // Convert to lowercase
            }
        }
            System.out.println(c);
		return checkPalindrome(c,0,c.size()-1);
        
    }
    
			private static boolean checkPalindrome(List<Character> c, int start ,int end){


					if(start == end || start > end){
						return true;
					}

					if(c.get(start) != c.get(end) ){

						return false;
					}


						return checkPalindrome(c ,start+1 , end-1);

			}
}