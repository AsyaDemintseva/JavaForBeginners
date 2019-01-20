import java.util.Scanner;

public class Task_06_2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Введите переменную T:");

        int t = a.nextInt();
        switch (t)
        {
            case 1:   System.out.println("Данное значение имеется в константе X");

                break;
            case 2: System.out.println("Данное значение имеется в константе Y");

                break;
            case 3:   System.out.println("Данное значение имеется в константе Z");

                break; }
        System.out.println ("Такой константы нет!");
    }
}
