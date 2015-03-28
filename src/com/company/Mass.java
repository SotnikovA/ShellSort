package com.company;

/**
 * Created by Антон on 23.03.2015.
 */
public class Mass {
    private static Mass ourInstance = new Mass();
    private static int[] a;
    private static int size;

    public static int[] getA() {
        return a;
    }

    public static int getSize() {
        return size;
    }

    public static void setSize(int size) {
        Mass.size = size;
    }

    public static void setA(int[] a) {

        Mass.a = a;
    }

    public static void setA(int x,int pos) {

        Mass.a[pos] = x;
    }

    public static Mass getInstance() {
        return ourInstance;
    }

    public Mass(int[] a,int size) {
        this.setA(a);
        this.setSize(size);
    }

    private Mass() {

    }
}
