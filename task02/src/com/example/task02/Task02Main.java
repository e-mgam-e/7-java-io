package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test
        int prevByte = -1;
        int currentByte;

        while ((currentByte = System.in.read()) != -1) {
            if (prevByte == 13) {
                if (currentByte == 10) {
                    System.out.write(10);
                    prevByte = -1;
                } else {
                    System.out.write(prevByte);
                    prevByte = currentByte;
                }
            } else {
                if (prevByte != -1) {
                    System.out.write(prevByte);
                }
                prevByte = currentByte;
            }
        }

        if (prevByte != -1) {
            System.out.write(prevByte);
        }

        System.out.flush();
    }
}
