package Task_17;

import java.io.*;

public class Task_17 {

    public static void main(String[] args) {
        String s;
        System.out.print("Исходный текст: \n");
        int cou = 0;
        try (BufferedReader br = new BufferedReader (new FileReader("C:\\JavaTest.txt"))) {
            while ((s = br.readLine()) != null) {
                System.out.print(s + "\n");

            }
        } catch (IOException e) {
            System.out.print("Ошибка ввода-вывода: " + e);
        }


        try (LineNumberReader line = new LineNumberReader (new FileReader("C:\\JavaTest.txt"))) {
            while ((line.readLine()) != null) {
                cou++;

            }
        } catch (IOException e) {
            System.out.print("Ошибка ввода-вывода: " + e);

        }


        String s1;
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        System.out.print("Введите ваш текст. Количество строк не должно превышать " + cou + "\n");
        try (FileWriter fw = new FileWriter("C:\\JavaTest.txt")){
            int iter = 0;
            do{
                System.out.print(">> ");
                s1 = br.readLine();
                s1 = s1 + "\r\n";
                iter++;
                fw.write(s1);
            } while (iter < cou);
        }
        catch (IOException e) {
            System.out.print("Ошибка ввода-вывода: " + e);
        }
    }
}
