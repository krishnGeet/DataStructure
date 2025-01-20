// Bubble sort is also known as sinking sort and exchance sort
/*
Stable Sorting algorithm:
The relative order of equal elements are maintained

In-Place Sorting: 
Bubble Sort doesn't require any extra space beyond the input array, making it an in-place sorting algorithm.

Adaptive: 
The algorithm can be optimized to stop early if the array is already sorted, as you've done with the isSwap flag.

Simple to Implement: 
Bubble Sort is straightforward to understand and implement, making it a good choice for educational purposes.

Best Case Time Complexity: The best case time complexity is 𝑂(𝑛)
 when the array is already sorted and the early stopping optimization is used.

Worst Case Time Complexity: The worst case time complexity is (𝑛2)
 when the array is in reverse order.

Average Case Time Complexity: 
The average case time complexity is also 𝑂(𝑛2), making it less efficient for large datasets compared to other sorting algorithms like Quick Sort or Merge Sort.
 */
public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean isSwap = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwap = true;
                }
            }
            if (!isSwap) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("before sortin");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        bubbleSort(arr);
        System.out.println("\nafter sortin");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

    }
}
