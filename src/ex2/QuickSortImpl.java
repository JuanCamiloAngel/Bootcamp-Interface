package ex2;

import java.util.Comparator;

public class QuickSortImpl<T> implements Sorter<T>{

    @Override
    public void sort(T[] arr, Comparator<T> c) {
        quick(arr,c,0, arr.length-1);
    }

    public void quick(T[] arr, Comparator<T> c,int startIndex,int endIndex){
        if (startIndex < endIndex){
            int pivotIndex = partition(arr, c,startIndex, endIndex);
            quick(arr, c,startIndex, pivotIndex);
            quick(arr, c,pivotIndex + 1, endIndex);
        }
    }

    private int partition(T[] array,Comparator<T> c ,int startIndex, int endIndex) {
        int pivotIndex = (startIndex + endIndex) / 2;
        T pivotValue = array[pivotIndex];
        startIndex--;
        endIndex++;

        while (true) {
            do startIndex++; while (c.compare(array[startIndex],pivotValue)<0) ;

            do endIndex--; while (c.compare(array[endIndex],pivotValue) > 0) ;

            if (startIndex >= endIndex) return endIndex;

            T temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = temp;
        }
    }
}
