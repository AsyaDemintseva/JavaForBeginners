package Task_14;

import java.util.Random;

public class Task_14 {
    public static void main(String args[]) {
        int[] a = new int[10];
        Random random = new Random();

        System.out.print("Исходный массив: \n");

        for (int n = 0; n < 10; n++) {
            a[n] = random.nextInt(10);
            System.out.print("Элемент [" + n + "]: " + a[n] + "\n");
        }

        for (int n = 1; n < a.length; n++) {
            for (int m = 0; m < a.length - 1; m++) {
                if (a[n] < a[m]) {
                    a[n] = a[n] + a[m];
                    a[m] = a[n] - a[m];
                    a[n] = a[n] - a[m];
                }
            }
        }

        System.out.print("Отсортированный массив: \n");

        for (int n = 0; n < a.length; n++) {
            System.out.print("Элемент [" + n + "]: " + a[n] + "\n");
        }
    }
}