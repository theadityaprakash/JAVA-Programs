package DSA.BinarySearch;

public class BinarySearch_prg {
    public static void main(String[] args) {
        int[] a={1,2,4,5,6,8};
        int tar=4;

        int li=0; //first index
        int n=a.length;
        int la=n-1;  //last index
        int mid=(li+la)/2;  //middle index

        while (li<=la){
        if(tar==a[mid]){
            System.out.println(mid);
            break;

        } else if (tar<a[mid]) {
            li=mid+1;
        } else {
            la=mid-1;
        }
        mid=(li+la)/2;
        }
        if(li>la){
            System.out.println("not found");
        }
    }
}
