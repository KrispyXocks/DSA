import QuickSort.quick_sort;
import QuickSearch.quick_search;
public class main {
    public static void main(String[] args) {
        // quick_sort
        int[] arr = { 1, 5, 2, 7, 3, 9, 4, 6, 8 };
        quick_sort.quicksort(arr);
        // low to high
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // high to low
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
        // quick_search
        int[] arr2 = { 1, 5, 2, 7, 3, 9, 4, 6, 8 };
        quick_search.quicksearch(arr2);
    }
}
