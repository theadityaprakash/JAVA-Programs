package practice;
import java.util.*;
public class Hash_abc0123 {

        public static void main(String[] args) {
            // Create a map with Integer keys and String values
            Map<Integer, String> map = new HashMap<>();
            map.put(1, "One");
            map.put(2, "Two");
            map.put(3, "Three");

            // Loop through the keys using enhanced for loop
            for (int key : map.keySet()) {
                String value = map.get(key);
                System.out.println("Key: " + key + ", Value: " + value);
            }
        }
}
