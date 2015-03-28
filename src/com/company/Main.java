package com.company;

import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Main {




    public static void main(String[] args) throws InterruptedException {
        // Для считывания данных воспользуемся классом Scanner
        // Для вывода - классом PrintWriter(как и во всех статьях по алгоритмам)
        Scanner scanner = new Scanner(System.in);
        PrintWriter printWriter = new PrintWriter(System.out);

        // Считываем размер массива,
        // который необходимо отсортировать
        int size = scanner.nextInt();
        Random r = new Random();
        // Создаем массив размера size
        // для хранения чисел
        int[] a = new int[size];

        // Считываем массив
        for (int i = 0; i < size; i++) {
            a[i] = r.nextInt(10000);
        }

        Mass m1 = new Mass(a,size);
        int step = Mass.getInstance().getSize()/2;

        while(step!=1){
            MyThread[] myThready = new MyThread[step];
            for (int i = 0; i < myThready.length; i++) {
                myThready[i] = new MyThread(step);
                myThready[i].start();
            }
            for (int i = 0; i < myThready.length; i++) {
                myThready[i].join();
            }
            step = step/2;


        }


        /*myThready.start();
        myThready.join();*/
        // Выводим отсортированный массив
        for (int i = 0; i <  Mass.getInstance().getSize(); i++) {
            System.out.print(Mass.getInstance().getA()[i] + " ");
        }

        // После выполнения программы необходимо закрыть
        // потоки ввода и вывода
        scanner.close();
        printWriter.close();
    }
}
