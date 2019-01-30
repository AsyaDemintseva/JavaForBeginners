package Final_task_2;

import java.util.Scanner;

public class Final_task_2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите количество элементов массива целым положительным числом: ");
        int[] a = new int[in.nextInt()];

        System.out.print("Задайте каждый элемент массива \n");
        for (int i = 0; i < a.length; i++) {
            System.out.print("Элемент [" + i + "]: ");
            a[i] = in.nextInt();
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