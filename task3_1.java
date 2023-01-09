public class task3_1 {
    private static int LEFT(int i){
        return(2 * i + 1);
    }

    private static int RIGHT(int i){
        return(2 * i + 2);
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void makeHeap(int[] arr, int size, int i){
        int left = LEFT(i);
        int right = RIGHT(i);
        int largest = i;
        if(left < size && arr[left] > arr[i]){
            largest = left;
        }

        if(right < size && arr[right] > arr[largest]){
            largest = right;
        }

        if(largest != i){
            swap(arr, i, largest);
            makeHeap(arr, size, largest);
        }
    }

    public static int pop(int[] arr, int size){
        if(size <= 0) return -1;
        int top = arr[0];
        arr[0] = arr[size - 1];//заменяем корень кучи последним элементом массива
        makeHeap(arr, size -1, 0);
        return top;
    }

    public static void sort(int[] arr){
        int size = arr.length;
        int i = (size - 2) / 2;
        while(i >=0){
            makeHeap(arr, size, i--);
        }

        while( size > 0){
            arr[size - 1] = pop(arr,size);
            size--;
        }

    }

    public static void main(String[] args) {
        int[] sortArray = {12, 6, 4, 1, 15, 10};
        sort(sortArray);
        for(int h : sortArray){
            System.out.println(h);
        }
    }


}
 