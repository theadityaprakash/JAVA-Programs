package array02;

//find repeated value count
public class frequencyOfArray {
    public static void main(String[] args) {
        int[] a = {20, 30, 1, 20, 23, 43, 21, 20, 4};

        for (int i = 0; i < a.length; i++) {
            int x = a[i];
            int count = 0;

            if (x == -1) continue;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == x) {
                    count++;
                    a[j] = -1;
                }
            }
            System.out.println(x +"  "+ count);
        }
    }
}
