package by.epam.javatraining.aliakseibuslau.tasks.maintask.Controller;

import by.epam.javatraining.aliakseibuslau.tasks.maintask.model.Exception.NullArrayEx;
import by.epam.javatraining.aliakseibuslau.tasks.maintask.model.Exception.NullLengthArrEx;
import by.epam.javatraining.aliakseibuslau.tasks.maintask.model.InputData;
import org.apache.log4j.Logger;

public class Logic {

    private static final Logger log = Logger.getLogger(Logic.class);

    private static void arrayForExceptionCheck(int[] array) throws NullArrayEx, NullLengthArrEx {
        if (array == null) {
            log.error("Array is not defined exception");
            throw new NullArrayEx();
        }
        else if (array.length == 0) {
            log.error("Array is empty exception");
            throw new NullLengthArrEx();
        }
        else{
            log.error("Undefined exception");
        }
    }

    public static int searchMaxMin(int[] array, boolean max) throws NullArrayEx, NullLengthArrEx {
        arrayForExceptionCheck(array);
        int index = 0;

        if (max) {
            for (int i = 1; i < array.length; i++) {
                if (array[i] > array[index]) {
                    index = i;
                }
            }
        } else {
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[index]) {
                    index = i;
                }
            }
        }
        return array[index];
    }

    static double avAr(int[] array) throws NullArrayEx, NullLengthArrEx {
        arrayForExceptionCheck(array);
        double sum = 0;
        for (int i1 : array) {
            sum += i1;
        }
        sum /= array.length;
        return sum;
    }

    static double avGeom(int[] array) throws NullArrayEx, NullLengthArrEx {
        arrayForExceptionCheck(array);
        double mul = array[0];
        for (int i = 1; i < array.length; i++) {
            mul *=(double) array[i];
        }
        mul = Math.pow(mul, 1.0 / (double) array.length);
        return mul;
    }

    static boolean incSeq(int[] array) throws NullArrayEx, NullLengthArrEx {
        arrayForExceptionCheck(array);
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                count++;
            }
        }
        return count == array.length - 1;
    }

    static int localMin(int[] array) throws NullArrayEx, NullLengthArrEx {
        arrayForExceptionCheck(array);
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] < array[i + 1] && array[i] < array[i - 1]) {
                return i;
            }
        }
        return -1;
    }

    static int seqSearch(int[] array, int num) throws NullArrayEx, NullLengthArrEx {
        arrayForExceptionCheck(array);
        for (int i : array) {
            if (i == num) {
                return i;
            }
        }
        return -1;
    }

    static int binarySearch(int[] array, int item) throws NullArrayEx, NullLengthArrEx {
        arrayForExceptionCheck(array);
        int last = array.length - 1;
        int first = 0;
        int position;
        position = (first + last) / 2;
        while ((array[position] != item) && (first <= last)) {
            if (array[position] > item) {
                last = position - 1;
            } else {
                first = position + 1;
            }
            position = (first + last) / 2;
        }
        if (first <= last) {
            return position;
        } else {
            return -1;
        }
    }

    static int[] revArray(int[] array)throws NullArrayEx, NullLengthArrEx {
        arrayForExceptionCheck(array);
        int NUM_FOR_REV = -1;
        for (int i = 0; i < array.length; i++) {
            array[i] *= NUM_FOR_REV;
        }
        return array;
    }

    static int[] quickSort(int[] array) throws NullArrayEx, NullLengthArrEx {
        arrayForExceptionCheck(array);
        int startIndex = 0;
        int endIndex = array.length - 1;
        return doQuickSort(array, startIndex, endIndex);
    }

    private static int[] doQuickSort(int[] array, int start, int end) throws NullArrayEx, NullLengthArrEx {
        arrayForExceptionCheck(array);
        if (start >= end) {
            return array;
        }
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (array[i] <= array[cur])) {
                i++;
            }
            while (j > cur && (array[cur] <= array[j])) {
                j--;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        doQuickSort(array,start, cur);
        doQuickSort(array,cur+1, end);
        return array;
    }

    static int[] insertSort(int[] sourceArray) throws NullArrayEx, NullLengthArrEx {
        arrayForExceptionCheck(sourceArray);
        int[] destinationArray = new int[sourceArray.length];
        int destinationSize = 0;
        for (int i : sourceArray) {
            int insertIndex = 0;
            if (destinationSize > 0) {
                while (insertIndex < destinationSize
                        && destinationArray[insertIndex] < i) {
                    insertIndex++;
                }
            }
            if (destinationSize - insertIndex >= 0)
                System.arraycopy(destinationArray, insertIndex, destinationArray, insertIndex + 1, destinationSize - insertIndex);
            destinationArray[insertIndex] = i;
            destinationSize++;
        }
        return destinationArray;
    }
}
