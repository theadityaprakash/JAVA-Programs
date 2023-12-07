package GFG.Array;

import java.util.ArrayList;

public class indexSum_SubArray {

    static ArrayList<Integer> indexSum(int[] a,int s) {
         int n=a.length;
         int l=0;
         int r=0;
         ArrayList<Integer> ans=new ArrayList<>();
         if(s==0){
             ans.add(-1);
             return ans;
         }

         boolean isfound=false;
         int sum=a[0];
         while ((r<n)){
             if(sum==s){
                 isfound= true;
                 break;
             }
             else if(sum<s){
                 r++;
                 if(r<n) sum=a[r];
             }
             else {
                 sum -=a[l];
                 l++;
             }
         }
         if(isfound){
             ans.add(l+1);
             ans.add(r+1);
             return ans;
         }
         ans.add(-1);
         return ans;

    }
            public static void main (String[]args){
            int[] a = {1, 2, 3, 7, 5};
            int s=12;
            ArrayList<Integer> result = indexSum(a, s);
            System.out.println(result);

        }

    }