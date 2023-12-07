package DSA.HashMap;

import java.util.HashMap;

public class iterationFromTickets {

    static String city(HashMap<String,String> tick){
        HashMap<String,String> revmap=new HashMap<>();

        for(String key: tick.keySet()){
            revmap.put(tick.get(key),key);
        }
        for(String key: tick.keySet()){
            if(!revmap.containsKey(key)){
                return key;
            }
        }

        return null;
    }
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("Chennai","Bangaluru");
        map.put("Mumbai","Delhi");
        map.put("Goa","Chennai");
        map.put("Delhi","Goa");

        String start=city(map);

        while (map.containsKey(start)){
            System.out.println(start);
            start=map.get(start);
        }
        System.out.println(start);
    }
}
