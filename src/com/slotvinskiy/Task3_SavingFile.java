//3) Попросить пользователя ввести строку и имя файла. Записать строку в файл.

package com.slotvinskiy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task3_SavingFile {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter file name and some text that should be written in this file.");
        System.out.print("File name: ");
        StringBuilder sb = new StringBuilder(SCANNER.nextLine());
        String fileName = sb.toString();
        sb.delete(0, sb.length());
        System.out.print("\nText: ");
        sb.append(SCANNER.nextLine());
        String text = sb.toString();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
