package com.max.idea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        int n = 0;

        System.out.println("Введите размер массива");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        double[] arr = new double[n];
        System.out.println("Введите элементы массива");
        for(int i = 0; i < n; i++)
        {
            double t = sc.nextDouble();
            arr[i] = t;
        }
        sc.close();

        double sum = 0;
        for(int i = 0; i < n; i++)
        {
            double k = arr[i];
            sum += k;
        }
        double middle = sum/n;

        System.out.println(String.format("Среденее арифмитическое = %s ", middle));

        for(int i = 0; i < n; i++)
        {
            double r = arr[i];
            double mula = middle*r;
            System.out.print(String.format("%s ", mula));
        }
    }
}
