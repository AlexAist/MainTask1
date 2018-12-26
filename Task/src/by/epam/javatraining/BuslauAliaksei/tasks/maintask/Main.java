package by.epam.javatraining.BuslauAliaksei.tasks.maintask;

import by.epam.javatraining.BuslauAliaksei.tasks.maintask.Controller.InputData;
import by.epam.javatraining.BuslauAliaksei.tasks.maintask.Controller.Logic;

public class Main {
    public static void main(String[] args) {
        int[] s = {1, 2, 1, 4, 5};
        int[] res = Logic.insertsort(s);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
