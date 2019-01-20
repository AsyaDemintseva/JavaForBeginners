package Task_12;

import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку A: ");
        String a = in.nextLine();
        System.out.print("Введите строку B: ");
        String b = in.nextLine();
        if (a.length()>b.length()) {
            System.out.print("Строка A больше B: " + a);
        } else if (a.length()<b.length()){
            System.out.print("Строка B больше A: " + b);
        }	else {
            System.out.print("Строки A и B равны");
        }
    }

}
