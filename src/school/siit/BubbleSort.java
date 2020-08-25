package school.siit;

import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort {
    void bubbleSort(int arr[]){
        int x = arr.length;
        for (int i = 0; i < x - 1; i++)
            for (int j = 0; j < x - i - 1; j++)
                if (arr[j] < arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    public ArrayList<SalesRepresentative> sort(ArrayList<SalesRepresentative> reps){
        int x = reps.size();
        for (int i = 0; i < x - 1; i++)
            for (int j = 0; j < x - i - 1; j++)
                if (reps.get(j).getNumberOfSales() < reps.get(j + 1).getNumberOfSales()) {
                    //SalesRepresentative temp = reps.get(j);
                    //reps.get(j) = reps.get(j + 1);
                    //reps.get(j + 1) = temp;
                    Collections.swap(reps, j, j + 1);
                }
        return reps;
    }

    void printArray(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.println(arr[i] + " ");
        System.out.println();
    }
}