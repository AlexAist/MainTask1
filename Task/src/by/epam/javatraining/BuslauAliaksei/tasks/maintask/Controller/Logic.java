package by.epam.javatraining.BuslauAliaksei.tasks.maintask.Controller;

public class Logic {

    public static int[] randomGenerateAr(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = InputData.randomGen();
        }
        return array;
    }

    public static int searchMin(int[] array) {
        return searchBy(array, false);
    }

    public static int searchMax(int[] array) {
        return searchBy(array, true);
    }

    private static int searchBy(int[] array, boolean max) {
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

    public static double avAr(int[] array) {
        double sum = 0;
        for (int i1 : array) {
            sum += i1;
        }
        sum /= array.length;
        return sum;
    }

    public static double avGeom(int[] array) {
        double mul = array[0];
        for (int i = 1; i < array.length; i++) {
            mul *=(double) array[i];
        }
        mul = Math.pow(mul, 1.0 / (double) array.length);
        return mul;
    }

    public static boolean incSeq(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                count++;
            }
        }
        return count == array.length - 1;
    }

    public static int localMin(int[] array) {
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] < array[i + 1] && array[i] < array[i - 1]) {
                return i;
            }
        }
        return -1;
    }

    public static int seqSearch(int[] array, int num) {
        for (int i : array) {
            if (i == num) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int item) {
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

    public static int[] revArray(int[] array){
        int NUM_FOR_REV = -1;
        for (int i = 0; i < array.length; i++) {
            array[i] *= NUM_FOR_REV;
        }
        return array;
    }

    public static int[] quickSort(int[] array) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        return doSort(array, startIndex, endIndex);
    }

    private static int[] doSort(int[] array, int start, int end) {
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
        doSort(array,start, cur);
        doSort(array,cur+1, end);
        return array;
    }

    public static int[] insertsort(int[] sourceArray) {
        int[] destinationArray = new int[sourceArray.length];
        int destinationSize = 0;
        for (int n = 0; n < sourceArray.length; n++) {
            int insertIndex = 0;
            if (destinationSize > 0) {
                while (insertIndex < destinationSize
                        && destinationArray[insertIndex] < sourceArray[n]) {
                    insertIndex++;
                }
            }
            for (int m = destinationSize - 1; m >= insertIndex; m--) {
                destinationArray[m + 1] = destinationArray[m];
            }
            destinationArray[insertIndex] = sourceArray[n];
            destinationSize++;
        }
        return destinationArray;
    }
}
