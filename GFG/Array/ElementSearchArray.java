package GFG.Array;

public class ElementSearchArray {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 2, 4, 5, 6};
        int tar = 4;


        for (int i = 0; i < a.length; i++) {
            if (a[i] == tar) {
                System.out.println(i);
                break;
            }
            else {
                System.out.println("-1");
            }
        }
    }

}
