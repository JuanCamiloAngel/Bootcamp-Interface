package ex1;

import java.util.Arrays;

public class Main {

    public static <T> void main(String[] args) {
        Persona persona = new Persona("juan", "angel", 1000);
        Persona persona1 = new Persona("carlos", "angel", 1000);
        Persona persona2 = new Persona("felipe", "angel", 1000);

        Persona[] list = {persona, persona1, persona2};
        SortUtil.sort(list);
        Arrays.stream(list).forEach(System.out::println);

        Celular celular = new Celular(2, "juan");
        Celular celular1 = new Celular(4, "carlos");
        Celular celular2 = new Celular(1, "felipe");

        Celular[] list1 = {celular, celular1, celular2};
        SortUtil.sort(list1);
        Arrays.stream(list1).forEach(System.out::println);
    }
}
