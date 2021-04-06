package ru.bspb.files;

////У нас есть директория с неизвестным количеством файлов с логами
//Формат сообщения в логах такой
//2015-07-31 00:02:56,431 - INFO [NIOServerCxn.Factory:0.0.0.0/0.0.0.0:2181:NIOServerCnxnFactory@197] -
//Accepted socket connection from /10.10.34.24:37975
//Timestamp - LEVEL message
//Нужно написать программу, которая бы считывала все логи из всех файлов, представляла каждую запись в виде экземпляра класса
// LogEntry, содержащего, соответственно, три поля timestamp, level и message
//И предоставляла бы возможность получить и распечатать список всех записей с указанным уровнем, например, WARN
//В качестве бонуса - хорошо бы иметь возможность выделить записи с одинаковым сообщением и увидеть,
// на каких строках в каких файлах данное сообщение было найдено

import org.apache.commons.io.FileUtils;

import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException {
        File folder = new File("c:/log/");
        File[] listOfFiles = folder.listFiles();
        for (File tempFile : listOfFiles) {
            System.out.println(tempFile.getName());
            try (FileReader fr = new FileReader(tempFile);
                 BufferedReader br = new BufferedReader(fr);) {
                String str;
                while ((str = br.readLine()) != null) {
                    System.out.println(str);
                }
            } catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }
}


//        String searchWord = "WARN"; // слово заменить на нужное
//        FileInputStream fis = new FileInputStream(new File("c:/log/application.log")); // путь заменить на нужный
//        byte[] content = new byte[fis.available()];
//        fis.read(content);
//        fis.close();
//        String[] lines = new String(content, "Cp1251").split("\n"); // кодировку указать нужную
//        int i = 1;
//        for (String line : lines) {
//            String[] words = line.split(" ");
//            int j = 1;
//            for (String word : words) {
//                if (word.equalsIgnoreCase(searchWord)) {
//                    System.out.println("Найдено в " + i + "-й строке, " + j + "-е слово");
//                }
//                j++;
//            }
//            i++;
//        }
//    }
//}

