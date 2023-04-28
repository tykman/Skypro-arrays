import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;

        double[] arr2 = {1.57, 7.654, 9.986};

        double[] arr3 = {3.21, 52.25, 7.13489};
        System.out.println();


       System.out.println("Задача 2");

       int[] arr = {1,2,3};

       for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i]);
           if (i != arr.length - 1) {
               System.out.print(", ");
           }
       }
       System.out.println();

       for (int i = 0; i < arr2.length; i++) {
           System.out.print(arr2[i]);
           if (i != arr2.length - 1) {
               System.out.print(", ");
           }
       }
       System.out.println();

       for (int i = 0; i < arr3.length; i++) {
           System.out.print(arr3[i]);
           if (i != arr3.length - 1) {
               System.out.print(", ");
           }
       }
       System.out.println();

       System.out.println("Задача 3");

       int[] array = {1,2,3};
       double[] array1 = {1.57, 7.654, 9.986};
       double[] arRab = {3.21, 52.25, 7.13489};

       for (int i = array.length - 1; i >= 0; i--) {
           System.out.print(array[i]);
           if (i != 0) {
               System.out.print(", ");
           }
       }
       System.out.println();

       for (int i = array1.length - 1; i >= 0; i--) {
           System.out.print(array1[i]);
           if (i != 0) {
               System.out.print(", ");
           }
       }
       System.out.println();

       for (int i = arRab.length - 1;i >= 0; i--) {
           System.out.print(arRab[i]);
           if (i != 0) {
               System.out.print(", ");
           }
       }
       System.out.println();

       System.out.println("Задача 4");

       int[] ar = {1, 2, 3};

       for (int i = 0; i < ar.length; i++) {
           if (ar[i] % 2 != 0) {
               ar[i] += 1;
           }
       }

       System.out.println(Arrays.toString(ar));
    }
}