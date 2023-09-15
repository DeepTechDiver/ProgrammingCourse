package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class climbStairs_70 {
    public static void main(String[] args){
        climbStairs_70 test = new climbStairs_70();
        test.climbStairs(6);
    }

    private Map<Integer,Integer> storeMap = new HashMap<>();

    public int climbStairs(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        if(null != storeMap.get(n))
            return storeMap.get(n);
        else {
            int result = climbStairs(n-1)+climbStairs(n-2);
            storeMap.put(n,result);
            return  result;
        }
    }
}

