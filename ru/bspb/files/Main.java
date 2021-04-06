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

import java.io.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File folder = new File("c:/log/");
        File[] listOfFiles = folder.listFiles();
        for (File tempFile : listOfFiles) {
            System.out.println(tempFile.getName());
            try (Scanner fr = new Scanner(tempFile)) {
                while (fr.hasNext()) {
                    LogEntry logEntry = new LogEntry();
                    String nextLine = fr.nextLine();
                    String[] logData = nextLine.split(" - ");
                    logEntry.setTimestamp(logData[0]);
                    logEntry.setLevel(logData[1]);
                    logEntry.setMessage(logData[2]);
                    if (logEntry.getLevel().contains("WARN")) {
                        System.out.println("Timestamp: " + logEntry.getTimestamp() + " Level: " + logEntry.getLevel() + " Message: " + logEntry.getMessage());
                    }
                }
            }
        }
    }
}
