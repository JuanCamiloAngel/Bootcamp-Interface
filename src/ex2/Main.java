package ex2;

import TimeUtils.Timer;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;


public class Main {

    public static void main(String[] args){

        Sorter<Integer> sorter = (Sorter<Integer>) MyFactory.getInstance("sorter");

        Integer[] arrayOfInts = new Integer[100000];
        Arrays.setAll(arrayOfInts, i ->100000-i);
        System.out.println(arrayOfInts[0]);

        Timer.start();
        sorter.sort(arrayOfInts,(Integer::compareTo));
        Timer.stop();
        System.out.printf("The time to sort was: %1s ms%n",Timer.getElapsedTime());

        Sorter<String> sorterString = (Sorter<String>) MyFactory.getInstance("sorter");
        String [] arrayOfStrings = {"juan","camilo","angel","zebra","koala"};
        sorterString.sort(arrayOfStrings,((String::compareTo)));
        Arrays.stream(arrayOfStrings).forEach(System.out::println);
    }
}
