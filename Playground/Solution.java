package Playground;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

class Solution {
    public static int[] frequencySort(int[] nums) {
        Map <Integer, Integer> map = new HashMap<>();
        for (int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
            nums = Arrays.stream(nums)
            .boxed()
            .sorted((n1, n2)->{
            if (map.get(n1) == map.get(n2))
                return n1 > n2 ? -1 : 1;
            
            return map.get(n1) > map.get(n2) ? 1:-1;
        })
            .mapToInt(Integer::intValue)
            .toArray();
        return nums;

    }
    

}

