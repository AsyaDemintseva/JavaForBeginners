package Task_11;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String a = in.nextLine();
        System.out.print("Введена строка: " + a.replaceAll("\\s",""));
    }
}