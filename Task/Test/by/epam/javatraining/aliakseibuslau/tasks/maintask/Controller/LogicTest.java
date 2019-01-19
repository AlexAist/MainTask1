package by.epam.javatraining.aliakseibuslau.tasks.maintask.Controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicTest {

    @Test
    void findMin1(){
        int[] array = {4, 5, 1, 6, 4};
        assertEquals(1, Logic.searchMin(array));
    }

    @Test
    void findMin2(){
        int[] array = {4};
        assertEquals(4, Logic.searchMin(array));
    }

    @Test
    void findMin3(){
        int[] array = {4, 5, 6, 4};
        assertEquals(4, Logic.searchMin(array));
    }

    @Test
    void findMax(){
        int[] array = {4, 5, 6, 4};
        assertEquals(6, Logic.searchMax(array));
    }

    @Test
    void findMax1(){
        int[] array = {4, 5, 23, 3, 6, 4};
        assertEquals(23, Logic.searchMax(array));
    }

    @Test
    void calculateArithmeticAverage() {
        int[] array = {2, 4, 1, 6, 2 ,6};
        assertEquals(3.5, Logic.avAr(array), 0.001);
    }

    @Test
    void calculateGeometricAverage() {
        int[] array = {2, 4, 1, 6, 2 ,6};
        assertEquals(2.88, Logic.avGeom(array), 0.005);
    }

    @Test
    void incSeqTest(){
        int[] ar = {1, 2, 3, 4, 5};
        assertTrue(Logic.incSeq(ar));
    }

    @Test
    void localMinTest(){
        int[] array = {2, 4, 1, 6, 2 ,6};
        assertEquals(2, Logic.localMin(array));
    }

    @Test
    void seqSearchTest(){
        int[] array = {2, 4, 1, 6,25, 2 ,6};
        assertEquals(25, Logic.seqSearch(array, 25));
    }

    @Test
    void seqSearchTest1(){
        int[] array = {2, 4, 1, 6,25, 2 ,6};
        assertEquals(-1, Logic.seqSearch(array, 44));
    }

    @Test
    void binarySearchTest(){
        int[] array = {2, 4, 1, 6, 25, 2 ,6};
        assertEquals(0, Logic.binarySearch(array, 2));
    }

    @Test
    void binarySearchTest1(){
        int[] array = {2, 4, 1, 6, 25, 2 ,6};
        assertEquals(3, Logic.binarySearch(array, 6));
    }

    @Test
    void revArTest(){
        int[] array = {2, 4, 1, 6, 25, 2 ,6};
        int[] resArray = {-2, -4, -1, -6, -25, -2 ,-6};
        assertArrayEquals(resArray, Logic.revArray(array));
    }

    @Test
    void quickSortTest(){
        int[] array = {2, 4, 1, 6, 25, 2 ,6};
        int[] resArray = {1, 2, 2, 4, 6, 6, 25};
        assertArrayEquals(resArray, Logic.quickSort(array));
    }

    @Test
    void insertSortTest(){
        int[] array = {2, 4, 1, 6, 25, 2 ,6};
        int[] resArray = {1, 2, 2, 4, 6, 6, 25};
        assertArrayEquals(resArray, Logic.insertsort(array));
    }
}