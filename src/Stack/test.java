package Stack;
import java.util.Scanner;
public class test{
    public static void main(String[] args) {
        int[] a;
        int n,option;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размерность массива:\t");
        n = in.nextInt();
        a = new int[n];
        Scanner selection = new Scanner(System.in);
        System.out.print("\nСделайте выбор:\n"+"\t1. Добавление данных\n"+"\t2. Обработка очереди\n"+"\t3. size\n");
        option = selection.nextInt();
        switch (option){
            case (1):
                for (int i = 0; i < n; i++) {
                    System.out.print((i + 1) + "\tэлемент:\t");
                    a[i] = in.nextInt();
                    }
                System.out.print("\nБыл создан массив: \t");
                for (int i = 0; i < a.length; i++)
                    System.out.print(a[i] + ", ");
                break;
            case (2):
                for (int i = 0; i < a.length; i++) {

                System.out.print("\nУдаление елемента " + (i + 1) + " который поступил в очередь \"" + a[i] + "\"\t. Массив: ");
                for (int j = i+1; j < a.length; j++)
                    System.out.print(a[j] + " ");}
                break;
            case (3):int i=0;
                while( i<a.length){
                    i=i+1;}
                System.out.println("Число элементов в структуре\t"+i);
        }
    }
}