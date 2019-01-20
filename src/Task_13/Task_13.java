package Task_13;

import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        String S = in.nextLine();
        System.out.print("Это текст типа String: " + S + "\n");
        int X = Integer.parseInt(S);
        System.out.print("Это число типа Integer: " + X + "\n");
        double Y = X;
        System.out.print("Это число типа Double: " + Y);
    }

}