/*
Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
*/


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class dz2 {
    public static void main(String[] args) {
        System.out.println("Введите длину строки: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int value = rand.nextInt(0, 100);
            list.add(value);
        }
        System.out.println(list);


        int minValue = list.get(0);
        int maxValue = list.get(0);
        int sum = 0;
        for (int item : list) {
            if (item > maxValue) {
                maxValue = item;
            }
            if (item < minValue) {
                minValue = item;
            }
            sum += item;
        }
        double average = (double)sum/list.size();

        System.out.println("Максимальный элемент: "+ maxValue);
        System.out.println("Минимальный элемент: "+ minValue);
        System.out.println("Среднее арифметическое: "+ average);

    }
}