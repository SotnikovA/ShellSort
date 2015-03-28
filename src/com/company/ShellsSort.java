package com.company;

/**
 * Created by Антон on 22.03.2015.
 */
public class ShellsSort {
    int size;
    int[] a;
    public ShellsSort(int[] a,int size) {
        this.size = size;
        this.a = a;
    }

    void sort_shell( ){

        int step = size / 2;//инициализируем шаг.
        while (step > 0)//пока шаг не 0
        {
            for (int i = 0; i < (size - step); i++)
            {
                int j = i;
                //будем идти начиная с i-го элемента
                while (j >= 0 && a[j] > a[j + step])
                //пока не пришли к началу массива
                //и пока рассматриваемый элемент больше
                //чем элемент находящийся на расстоянии шага
                {
                    //меняем их местами
                    int temp = a[j];
                    a[j] = a[j + step];
                    a[j + step] = temp;
                    j--;
                }
            }
            step = step / 2;//уменьшаем шаг
        }

    }
}
