package GFG.Array;

public class findIndex {
    public static void main(String[] args) {
        int[] a={2,4,3,8,5,7,6};
        int tar=8;
        int[] temp={-1,-1};
        for (int i = 0; i < a.length; i++) {
           if(tar==a[i]){
               temp[0]=i;
               break;
           }
        }
        for(int i=a.length-1;i>0;i--){
            if(tar==a[i]){
                temp[1]=i;
                break;
            }
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i]+" ");
        }

    }
}
