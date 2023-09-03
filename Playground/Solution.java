package Playground;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class Solution {
    public static long countInterestingSubarrays(List<Integer> nums, int modulo, int k) {
        Boolean [] arr = new Boolean[nums.size()];
        arr =  nums.stream()
            .map(n -> {
                if (n % modulo == k)
                    return true;
                return false;
            })
            .toArray(s -> (new Boolean[s]));
            System.out.println(Arrays.toString(arr));
            return -1;
    }   
    public static void main(String[] args) {
        List <Integer> list = new LinkedList<>();
        list.add(3);
        list.add(4);

        countInterestingSubarrays(list, 3, 6);
    }
}

