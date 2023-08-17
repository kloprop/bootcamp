import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoVar {
    public static void main(String[] args) throws Exception {
        

        var s = "Hello";
        var i = 2;
        var c = 'a';

        List<String> strings = Arrays.asList("abc", "def");
        for (var str : strings){
            System.out.println(str);
        }

        Map <String, Integer> map = new HashMap<>();
        map.put("hi", 7);

        for (var entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        
    }
    public static List<List<String>> getString(){
        return Arrays.asList(Arrays.asList("abc"));
    }
    
}
