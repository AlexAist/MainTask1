package by.epam.javatraining.aliakseibuslau.tasks.maintask;

import by.epam.javatraining.aliakseibuslau.tasks.maintask.Controller.Logic;
import org.apache.log4j.Logger;

public class Main {
    public static void main(String[] args) {
        int[] s = {1, 2, 1, 4, 5};
        int res = Logic.searchMaxMin(s, true);
    }
}
