class Solution {
    public int largestInteger(int num) {

    PriorityQueue<Integer> oddHeap =new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> evenHeap =new PriorityQueue<>(Collections.reverseOrder());    

    int temp = num;
    while( num > 0 ) { 

        int mod= num%10 ;
        if( mod%2 == 0 ) evenHeap.add(mod);
        else oddHeap.add(mod);

        num /=10;
    }


    int pow=1;
    String str= String.valueOf(temp);
    String ans= ""; 

    for( int i=0;i<str.length();i++ ) { 

        char ch = str.charAt(i);
        if(  Integer.parseInt(String.valueOf(ch)) %2 ==0 ) {
      
            ans += String.valueOf(evenHeap.poll());
        }else { 
            ans += String.valueOf(oddHeap.poll());
        }
    }

    return Integer.parseInt(ans);
}
}