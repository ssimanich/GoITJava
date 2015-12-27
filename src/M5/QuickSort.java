package M5;

public class QuickSort {
    public static int[] sort(int mass[], int firstCell, int lastCell) {
        if (firstCell >= lastCell) {
            return mass;
        }
        int i = firstCell;
        int j = lastCell;
        int c = Math.abs(i - (i - j) / 2);
        while (i < j) {
            while ((i < c) && (mass[i] <= mass[c])) i++;
            while ((j > c) && (mass[j] >= mass[c])) j--;
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
