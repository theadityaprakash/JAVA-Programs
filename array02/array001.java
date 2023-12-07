package array02;

//1D array
/*public class array001 {
    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        for (int i = 0; i < a.length; i++) {

            System.out.println(a[i]);
        }
    }
}*/

//2D Array (Matrix)
/*public class array001{
    public static void main(String[] args) {
        int [][] a={{10,20},{30,40,50}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}*/

//3D array
/*public class array001{
    public static void main(String[] args) {
        int [][][] a={{{10,20},{30,40,50}},{{60,70},{80,90,91}}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    System.out.print(a[i][j][k]+" ");

                }
              System.out.println();
            }

        }
    }
}*/

//1D using for each loop
/*public class array001{
    public static void main(String[] args) {
        int[] a={10,20,30};
        for(int i:a){
            System.out.println(i);
        }
    }
}*/

//1D array using while loop
/*public class array001{
    public static void main(String[] args) {
        int[] a = {10, 20, 30};

        int i=0;
        while (i<a.length){
            System.out.println(a[i]);
            i++;

        }
    }
}*/

//1D array using do while loop
/*public class array001{
    public static void main(String[] args) {
        int[] a = {10, 20, 30};
        int i = 0;

        do{
            System.out.println(a[i]);
            i++;
        }while (i<a.length);
    }
}*/

//Taking value directly from array without going onto index value using for each loop
class array001{
    public static void main(String[] args) {
        int[] arr={2,4,6,34,23};

        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}