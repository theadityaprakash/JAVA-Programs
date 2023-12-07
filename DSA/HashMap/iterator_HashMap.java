package DSA.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class iterator_HashMap {
    public static void main(String[] args) {
        HashMap <String,Integer> map=new HashMap<>();

        map.put("india",1);
        map.put("Japan",2);
        map.put("France",3);
        map.put("USA",4);

        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //Only for key
        Set<String> key1 = map.keySet();
        for (String key:key1)
             {
                 System.out.println(key);
        }

        //Only for value
        Set<String> key2 = map.keySet();
        for (String key:key2)
        {
            System.out.println(map.get(key));
        }

        //For both key and value
        Set<String> keys=map.keySet();
        for (String key:keys){
            System.out.println(key + " "+map.get(key));
        }
    }
}
