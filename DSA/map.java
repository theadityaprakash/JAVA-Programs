package DSA;

import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {

        Map map=new HashMap();

        map.put(101,"Aditya");
        map.put(102,"Prakash");
        map.put(103,"Aditya");
        map.put(104,"Sumedha");
        map.put(null,null);       //We can insert only one null key
        map.put(102,"hello");    //it have duplicate key so it will replace old value with new one

        //map.clear();       //for empty the map
        //map.remove(102); //it will remove the value
        //map.replace(103,"pal"); //it will replace the value with new value on that key

       boolean m= map.containsKey(101);  //for checking the key value is it present or not
       boolean m1= map.containsValue("aditya");  //for checking the value is present or not

        System.out.println(map);
        System.out.println(m +"\n"+ m1);


        System.out.println(map.size());  //it tells about size of map
        System.out.println(map.get(102));  //for getting the value on that key

    }
}
