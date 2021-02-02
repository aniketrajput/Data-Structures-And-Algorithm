package com.home.selectionsort;

public class Main {

    public static void main(String[] args) {

        int[] arr = {20, 35, -15, 7, 55, 1, -22};

        for(int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){

            int largest = 0;

            for(int i = 1; i <= lastUnsortedIndex; i++){        //Unlike Bubble sort we do need equals here, because in Bubble sort we were comparing i and i+1. Here also we need to compare till last element with largest.

                if(arr[i] > arr[largest]){
                    largest = i;
                }
            }

            swap(arr, lastUnsortedIndex, largest);
        }

        for(int i = 0 ; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    private static void swap(int[] arr, int lastUnsortedIndex, int largest) {
        if (lastUnsortedIndex == largest)
            return;

        int tmp = arr[lastUnsortedIndex];
        arr[lastUnsortedIndex] = arr[largest];
        arr[largest] = tmp;
    }
}
