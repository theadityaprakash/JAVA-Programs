package array02;

import java.util.Arrays;

public class sort_by_Frequency {
    public static void main(String[] args) {
        int[] a={2,4,5,2,3,5,2,3,2,7,8};

        for (int i = 0; i < a.length; i++) {
            int x=a[i];
            int count=0;

            if(x==-1)continue;
            for (int j = 0; j < a.length; j++) {
                if(a[j]==x){
                    count++;
                    a[j]=-1;
                }

            }
        }
        }

    }
