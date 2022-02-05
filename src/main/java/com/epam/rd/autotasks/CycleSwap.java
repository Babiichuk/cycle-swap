package com.epam.rd.autotasks;

class CycleSwap {

    static void cycleSwap(int[] array) {
        if (array.length != 0) {
            int temp = array[0];
            array[0] = array[array.length - 1];
            for (int i = 1; i < array.length - 1; i++) {
                array[array.length - i] = array[array.length - i - 1];
            }
            array[1] = temp;
        }

    }


    static void cycleSwap(int[] array, int shift) {
        if (array.length != 0) {
            for (int n = 0; n < shift; n++) {
                int temp = array[0];
                array[0] = array[array.length - 1];


                for (int i = 1; i < array.length - 1; i++) {
                    array[array.length - i] = array[array.length - i - 1];
                }
                array[1] = temp;
            }
        }

    }
}

