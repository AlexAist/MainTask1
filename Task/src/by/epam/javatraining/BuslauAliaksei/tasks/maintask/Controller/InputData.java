package by.epam.javatraining.BuslauAliaksei.tasks.maintask.Controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class InputData {

    public static int randomGen(){
        Random rand = new Random();
        return rand.nextInt(30);
    }

    public static int[] readFromFile(){
        int[] array = null;
        try (BufferedReader in = new BufferedReader(new FileReader("D://chisla.txt")))
        {
            array = in.lines().mapToInt(Integer::parseInt).toArray();
        }
        catch (IOException | NumberFormatException e)
        {
            e.printStackTrace();
        }
        return array;
    }
}
