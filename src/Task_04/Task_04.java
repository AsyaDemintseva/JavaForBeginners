package Task_04;

import java.util.Scanner;

public class Task_04 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите X: ");
        double X = in.nextInt();
        System.out.print("Введите Y: ");
        double Y = in.nextInt();
        System.out.print("Введите Z: ");
        double Z = in.nextInt();

        double A = (X + Y + Z) / 3;
        System.out.printf("Среднее арифметическое: " + A + "\n");

        A = A / 2;
        if (A > 3) {
            System.out.printf("Программа выполнена корректно");
        }
    }
}
