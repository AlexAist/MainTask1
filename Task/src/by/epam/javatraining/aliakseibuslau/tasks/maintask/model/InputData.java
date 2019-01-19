package by.epam.javatraining.aliakseibuslau.tasks.maintask.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class InputData {

    private static String path = "D://nums.txt";
    private static int RAND_NUM = 30;

    public static int randomGen(){
        Random rand = new Random();
        return rand.nextInt(RAND_NUM);
    }

    public static int[] randomGenerateAr(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = randomGen();
        }
        return array;
    }

    public static int[] readFromFile(){
        int[] array = null;
        try (BufferedReader in = new BufferedReader(new FileReader(path)))
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
