package Final_task_1;

import java.util.Scanner;

public class Final_task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число, для которого хотите увидеть таблицу умножения, с клавиатуры: ");
        int a = in.nextInt();
        System.out.print("Введите число, до которого хотите увидеть таблицу умножения: ");
        int b = in.nextInt();
        for (int i = 0; i < b+1; i++) {
            System.out.print(a + "x" + i + " = " + a*i + "\n");
        }


    }

}
