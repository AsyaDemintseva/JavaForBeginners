package Task_15;

import java.io.*;


public class Task_15 {
    public static void main (String args[]) {
        String s;
        try (BufferedReader br = new BufferedReader(
                new FileReader("C:\\JavaTest.txt")
        )) {
            while ((s = br.readLine()) != null) {
                System.out.print(s);
                }
            }
        catch (IOException e) {
                System.out.print("Ошибка ввода-вывода: " + e);
            }
        }
    }
