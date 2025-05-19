class Solution {
    public String triangleType(int[] nums) {
        
        if( notMakeATriangle(nums) ) return "none";
        if( equilateral(nums)) return "equilateral";
        if( isosceles(nums)) return "isosceles";
        if( scalene(nums)) return "scalene";
        return "none";

    }

    public static boolean equilateral ( int[] nums ) { 

        if( nums[0] == nums[1] && nums[1] == nums[2] ) return true;
        return false;
    }

    public static boolean isosceles ( int[] a ) { 

        if( a[0] == a[1] || a[0] == a[2] ) return true;
        if( a[1] == a[2] || a[1] == a[0] ) return true;
        if( a[2] == a[0] || a[2] == a[1] ) return true;
        return false;
    }
    public static boolean scalene ( int[] a ) { 
        if( a[0] != a[1] && a[1] != a[2] &&
             a[0] != a[2] ) return true;

        return false;
    }
    public static boolean notMakeATriangle ( int[] a ) { 
        
        if( a[0] + a[1] <= a[2] || a[1] + a[2] <= a[0] ||
             a[0] + a[2] <= a[1] ) return true;

        return false;
    }


}