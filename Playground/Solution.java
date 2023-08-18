package Playground;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {
    public String destCity(List<List<String>> paths) {
        //Map <String, Integer> map = new HashMap<>();

        Map <String, Integer> map = paths.stream().collect(Collectors.toMap(e -> e.get(0), e -> 1));

        System.out.println(map);
        return "default";
    }
}

