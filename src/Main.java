import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        int[] arr = new int[]{1, 2, 3};

        for (int i = 1; i <= arr.length; i++) {
            System.out.println(i);
        }
        System.out.println();

        double[] oneSevenNine = {1.57, 7.654, 9.986};

        for (int i = 0; i < 3; i++) {
            System.out.println(oneSevenNine[i]);
        }
        System.out.println();

        double[] floatingPoint = new double[3];
        floatingPoint[0] = 3.21;
        floatingPoint[1] = 52.25;
        floatingPoint[2] = 7.13489;
        for (int i = 0; i < 3; i++) {
            System.out.println(floatingPoint[i]);
        }
        System.out.println();

        System.out.println("Задача 2");

        int[] num = new int[]{1,2,3} ;

        for (int i = 1; i <= num.length; i++) {
            if (i == num.length - 1) {
                System.out.println(Arrays.toString(num));
                break;
            }
        }

        double[] numberWithPoint = {1.57, 7.654, 9.986};

        for (int i = 0; i < numberWithPoint.length; i++) {
            if (i == numberWithPoint.length - 1) {
                System.out.println(Arrays.toString(numberWithPoint));
                break;
            }
        }

        double[] floating = new double[3];
        floating[0] = 3.21;
        floating[1] = 52.25;
        floating[2] = 7.13489;

        for (int i = 0; i < floating.length; i++) {
             if (i == floating.length - 1) {
                 System.out.println(Arrays.toString(floating));
                 break;
             }
        }
        System.out.println();

        System.out.println("Задача 3");

        int[] box = new int[] {3,2,1};

        for (int i = 0; i < box.length; i++) {
            if (i == box.length - 1) {
                System.out.print(Arrays.toString(box));
                break;
            }
        }
        System.out.println();

        double [] countDown = {9.986,7.654,1.57};

        for (int i = 0; i < countDown.length; i++) {
            if (i == countDown.length - 1) {
                System.out.println(Arrays.toString(countDown));
                break;
            }
        }

        double [] floatDouble = new double[3];
        floatDouble [0] = 7.13489;
        floatDouble [1] = 52.25;
        floatDouble [2] = 3.21;

        for (int i = 0; i < floatDouble.length; i++) {
            if (i == floatDouble.length - 1) {
                System.out.print(Arrays.toString(floatDouble));
                break;
            }
        }
        System.out.println();

        System.out.println("Задача 4");

        int [] countUp = {0,1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < countUp.length; i++) {
            if (countUp[i] % 2 != 0) countUp[i] += 1;
        }
        System.out.println(Arrays.toString(countUp));
    }
}