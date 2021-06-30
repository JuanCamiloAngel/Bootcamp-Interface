package ex1;

public class SortUtil<T> {

    public static <T> void sort(IPrecedable<T>[] arr) {
        int n = arr.length;
        IPrecedable<T> temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j].precedeA((T) arr[j - 1]) < 0) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
