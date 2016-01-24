package M7;

public class QuickSort1 {
    public static int[] sort(int mass[], int firstCell, int lastCell) { //mass:{2,-1,3,1} firstCell:0 lastCell: 3
        if (firstCell >= lastCell) {
            return mass;
        }
        int i = firstCell; //i: 0 firstCell: 0
        int j = lastCell; //j: 4 lastCell: 3
        int c = Math.abs(i - (i - j) / 2); //c: 1
        while (i < j) {
            while ((i < c) && (mass[i] <= mass[c])) i++; //i: 0
            while ((j > c) && (mass[j] >= mass[c])) j++; //j: 4 c:1 mass{2,-1,3,1}
            if (i < j) {
                int temp = mass[i];
                mass[i] = mass[j];
                mass[j] = temp;

                if (i == c) c = j;
                else if (j == c) c = i;

            }
        }
        sort(mass, firstCell, c);
        sort(mass, c + 1, lastCell);

        return mass;
    }}

/*При выполнении задания по 5 модулю в методе сортировки QuickSort я допустил ошибку и вместо пост декремента по j(j--) я написал
пост инкремент(j++), решение данной ситуаци смог определить с выведенной ошибки
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4
	at M5.QuickSort.sort(QuickSort.java:13)
	at M5.Main.main(Main.java:8)
и непосредственно в QuickSort.java в 13 строке иправил на постдекремент
При запуске Debug я увидел что произошло обращение к ячейке массива по адрессу [4], а максимальный адрес равен [3]
// в коментариях показан вывод Debag где и показано что j: 4 при массиве mass{2,-1,3,1}
// использовал Line Breakpoint*/