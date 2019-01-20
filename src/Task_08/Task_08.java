package Task_08;

import java.util.Scanner;

public class Task_08 {
    public static void main(String[] args){
        System.out.print("Задайте размерность массива целым положительным числом: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] b = new int[a];

        for (int i = 0 ; i < a ; i++ ){
            System.out.print("Элемент[" + i + "]: ");
            b[i] = in.nextInt();
        }
        System.out.print("Ваш массив, числа которого умножены на 2: \n");
        for (int i = 0 ; i < a ; i++ ){
            System.out.print("Элемент[" + i + "]: " + (b[i]*2) + "\n");
        }
    }
}
