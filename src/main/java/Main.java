import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=====[ Парсер логов ]=====");
        int countPathFiles = 0;
        int countErrorsFiles = 0;
        while (true){
            System.out.println("Введите путь до файла:");
            String path = new Scanner(System.in) .nextLine();
            File file = new File(path);

            //Переменная fileExists будет равна true, если файл существует, и false, если не существует.
            boolean fileExists = file.exists();

            //Напишите также код, который будет определять, является ли указанный путь путём именно к файлу, а не к папке.
            //Проверить это можно так:
            boolean isDirectory = file.isDirectory();

            //Выходим из цикла если ввели слово Exit
            if (path.equals("exit")){
                System.out.println("Выходим");
                break;
            } else if (fileExists == false || isDirectory == true){
                countErrorsFiles++;
                System.out.println("Указанный файл не существует или указанный путь является путём к папке");
                System.out.println("Неверно введено: " + countErrorsFiles + " раз(а)!");
                continue;
            } else {
                countPathFiles++;
                System.out.println("Путь указан верно! Это файл номер: " + countPathFiles);
            }
        }
    }
}