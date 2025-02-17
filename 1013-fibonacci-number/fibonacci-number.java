class Solution {

    

    public static int find(int n,int[] arr) {
        if( n==0 ) return 0;
        if ( n==1 ) return 1;
        if( arr[n] != 0 ) return arr[n];

        return arr[n] = (find(n-1,arr) + find ( n-2,arr));
    }

    public int fib(int n) {
        int[] arr = new int[n+1];
        return find(n,arr);

    }
}

// 0 1 2 3 5 8 