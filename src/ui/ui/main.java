package ui;

import java.util.Arrays;
import static model.merge_sort.merge_Sort;

public class main {
        public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7}; // Conjunto de datos predefinido
        System.out.println("Array original: " + Arrays.toString(arr));
        
        merge_Sort(arr);
        
        System.out.println("Array ordenado: " + Arrays.toString(arr));
    }
}