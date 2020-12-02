package task2;

public class Sorting {
    public static void quickSort(Comparable[] array, int low, int high){
        if (array.length == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        Comparable cur = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i].compareTo(cur) > 0) {
                i++;
            }

            while (array[j].compareTo(cur) < 0) {
                j--;
            }

            if (i <= j) {
                Comparable temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }
}
