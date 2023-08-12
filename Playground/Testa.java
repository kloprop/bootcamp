package Playground;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Testa implements Comparator<Integer>{
   @Override
    public int compare(int n, int n2){
        Map <Integer,Integer> map = new HashMap<>();
        for (int num : nums){
            if (!map.containsKey(num)){
                map.put(num,1);
            }else{
                map.put(num,map.get(num)+1);
            }
        }

        if (map.get(n) == map.get(n2)){
            return n > n2? -1 : 1;
        }
        if (map.get(n) > map.get(n2)){
            return 1;}else{
                return -1;
            }
        
        
    }
}
