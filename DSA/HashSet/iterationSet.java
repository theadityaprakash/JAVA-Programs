package DSA.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class iterationSet {
    public static void main(String[] args) {
        HashSet <Integer> set=new HashSet<>();

        set.add(5);
        set.add(4);
        set.add(2);
        set.add(3);

        Iterator it= set.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
