package Final_task_3;

import java.util.Scanner;

public class Final_task_3 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.print("Введите количество рублей: ");
        double a = Double.valueOf(in.next());
        System.out.print("Введите текущий курс: ");
        double b = Double.valueOf(in.next());
        String c = String.valueOf(a/b);
        int d = c.indexOf(".");
        System.out.printf(a + " рублей, на текущий момент, равно " + c.substring(0,d+3) + " долларов");
    }
}
