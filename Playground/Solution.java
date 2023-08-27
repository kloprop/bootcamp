package Playground;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class Solution {
    
    private static final int ArrayList = 0;

    public static void main(String[] args) {
        int [] arr = new int[]{2,3,4,5,2};
        Set <Integer> set = new HashSet<>();
        for (Integer num : arr){
            set.add(num);
        }
        //set.add(7);
        //set.add(3);
        int sum = set.stream().collect(Collectors.summingInt((n) -> Integer.valueOf(n)));
        System.out.println(sum);

        Integer.toString(34,6);

        int n = Integer.valueOf(Integer.toString(34,6));
        System.out.println(n);
        
    }
}

