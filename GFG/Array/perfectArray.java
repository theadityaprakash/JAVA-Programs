package GFG.Array;

public class perfectArray {
    public static void main(String[] args) {
        int[] a={1,2,3,2,1};
        boolean res=true;

        for (int i = 0; i < a.length/2; i++) {
            if(a[i]!=a[a.length-1-i]){
                res=false;
                break;
            }

        }
        if(res){
            System.out.println("perfect");
        }
        else{
            System.out.println("not perfect");
        }
    }
}
