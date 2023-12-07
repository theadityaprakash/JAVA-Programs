package DSA.HashMap;

import java.util.HashMap;
import java.util.Set;

public class hashMap01 {
    public static void main(String[] args) {
        HashMap hm=new HashMap();

        hm.put(101,"Aditya");
        hm.put(102,"Prakash");
        hm.put(103,"Aditya");
        hm.put(104,"Sumedha");
        //hm.put(null,null);       //We can insert only one null key
        //hm.put(102,"hello");


        System.out.println(hm);    //it return  value in map


        Set set=hm.entrySet();     //it return value in set
        System.out.println(set);
    }
}
