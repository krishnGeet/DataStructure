// Bubble sort is also known as sinking sort and exchance sort
public class BubbleSort{
    public static void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            boolean isSwap = false;
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwap = true;
                }
            }
            if(!isSwap){
                return;
            }
        }
    } 

    public static void main(String[] args) {
        int[] arr = {3, 2, 6, 8, 9, 1, 5, 4, 1, 0, 99, -8, -99, 2, 5};
        System.out.println("before sortin");
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        bubbleSort(arr);
        System.out.println("\nafter sortin");
        for(int ele : arr){
            System.out.print(ele + " ");
        }

    }
}