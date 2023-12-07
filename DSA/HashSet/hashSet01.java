package DSA.HashSet;
import java.util.HashSet;
public class hashSet01 {
    public static void main(String[] args) {
        HashSet <Integer> name=new HashSet<>();

        //insertion
        name.add(1);
        name.add(2);
        name.add(3);
        name.add(1);


        //deletion
        name.remove(2);

        System.out.println(name.size());   //Size of Hashset

        System.out.println(name);   //print HashSet

        System.out.println(name.contains(4)); //for searching
    }
}
