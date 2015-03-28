package com.company;

/**
 * Created by Антон on 23.03.2015.
 */
public class MyThread extends Thread {
    public static int step;
    public MyThread(int step) {
        this.step = step;

    }

    @Override
    public void run() {
        sort_shell(step);
    }

    void sort_shell( int step){

        step = step / 2;//инициализируем шаг.
            for (int i = 0; i < (Mass.getInstance().getSize() - step); i++)
            {
                int j = i;
                //будем идти начиная с i-го элемента
                while (j >= 0 && Mass.getInstance().getA()[i] > Mass.getInstance().getA()[j + step])
                //пока не пришли к началу массива
                //и пока рассматриваемый элемент больше
                //чем элемент находящийся на расстоянии шага
                {
                    //меняем их местами
                    int temp = Mass.getInstance().getA()[j];
                    Mass.getInstance().setA(Mass.getInstance().getA()[j + step], j);
                    Mass.getInstance().setA(temp, j + step);
                    j--;
                }
            }
            step = step / 2;//уменьшаем шаг


    }
}
