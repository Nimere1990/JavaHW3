
/*
 * Пусть дан произвольный список целых чисел, удалить из него четные числа 
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class dz1 {
    public static void main(String[] args) {
        System.out.println("Введите длину строки: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        Random rnd = new Random();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int val = rnd.nextInt(-100, 100);
            list1.add(val);
        }
        System.out.println(list1);
        int i = 0;
        while (i < list1.size()) {
            if (list1.get(i) % 2 == 0) {
                list1.remove(i);
            }
            else {
                i++;
            }
        }
        System.out.println(list1);
    }
}