package GFG.Array;

public class PalindromicArray {
    public static void main(String[] args) {
        int[] a={1,2,3,7,2,1};

        boolean pldm = true;
        for (int i = 0; i < a.length; i++) {
            for (int j = a.length - 1; j >= 0; j--) {
                if (i>=j) {
                    break;
                }
                if (a[i] != a[j]) {
                    pldm = false;
                    break;
                }
            }
        }
            if(pldm){
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }


    }
}
