package learning;
import java.util.ArrayList;
import java.util.Collections;

public class Array_list {
    public static void main(String[] args) {

        //Wrapper class
       ArrayList<Integer> arr=new ArrayList<>();

       //Add Element
        arr.add(4);
        arr.add(1);
        arr.add(9);
        arr.add(6);

        System.out.println(arr);

        //Get Element
        int element=arr.get(0);
        System.out.println(element);

        //for adding element in between
        arr.add(1,8);
        System.out.println(arr);

        //for Changing value
        arr.set(0,20);
        System.out.println(arr);

        //for removing element
        arr.remove(2);
        System.out.println(arr);

        //Size of ArrayList
        int size=arr.size();
        System.out.println(size);

        //Checking an Element Exist in ArrayList or not
        boolean anss= arr.contains(9);
        System.out.println(anss);

        //loop
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();

        //Sorting
        Collections.sort(arr);
        System.out.println(arr);

        //UnWrapper class
        ArrayList list=new ArrayList();
        list.add("adi");
        list.add(2);
        list.add(true);

        System.out.println(list);


    }
}
