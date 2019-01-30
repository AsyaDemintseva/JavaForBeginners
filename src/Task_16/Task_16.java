package Task_16;

import java.io.*;


public class Task_16 {
    public static void main (String args[]) {
        String s;
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        System.out.print("Введите вашу строку или несколько строк. " +
        "Для завершения набора текста и записи его в файл, введите слово 'stop' в пустой строке и нажмите клавишу 'Enter'\n");
        try (FileWriter fw = new FileWriter("C:\\JavaTest2.xls")){
            do{
                System.out.print(">> ");
                s = br.readLine();
                if (s.compareTo("stop")==0) break;
                s = s + "\r\n";
                fw.write(s);
            } while (s.compareTo("stop") != 0);
        }
        catch (IOException e) {
            System.out.print("Ошибка ввода-вывода: " + e);
        }
    }
}