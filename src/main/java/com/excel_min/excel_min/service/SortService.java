package com.excel_min.excel_min.service;

public class SortService {
    public static void quickSort(int[] sequenceNumber, int low, int high) {
        if (low < high) {
            int partition = part(sequenceNumber, low, high);

            quickSort(sequenceNumber, low, partition - 1);
            quickSort(sequenceNumber, partition + 1, high);
        }
    }

    private static int part(int[] sequenceNumber, int low, int high) {
        int pivot = sequenceNumber[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (sequenceNumber[j] <= pivot) {
                i++;
                swap(sequenceNumber, i, j);
            }
        }
        swap(sequenceNumber, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] sequenceNumber, int i, int j) {
        int temp = sequenceNumber[i];
        sequenceNumber[i] = sequenceNumber[j];
        sequenceNumber[j] = temp;
    }
}
