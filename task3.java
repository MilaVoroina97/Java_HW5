public class task3 {
    // Реализовать алгоритм пирамидальной сортировки (HeapSort).
    public static void sort(int[] arr){
        int size = arr.length;
        for(int i = size /2 -1 ; i >= 0 ; i--){//построение кучи(перегруппировка массива)
            makeHeap(arr, size, i);
        }

        for(int j = size - 1; j >= 0; j--){//один за другим извлекаем элементы из кучи
            int temp = arr[0];//перемещаем текущий корень в конец
            arr[0] = arr[j];
            arr[j] = temp;
            makeHeap(arr, j, 0);
        }
    }

    public static void makeHeap(int[] arr, int size, int i){ 
        // i - корневой узел, что является индексом в arr, size - размер кучи

        int largest = i; // самый большой элемент является корнем
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if(left < size && arr[left] > arr[largest]){//если левый дочерний узел больше корня
            largest = left;
        }
        if(right < size && arr[right] > arr[largest]){
            largest = right;
        }

        if(largest != i){//если самый большой элемент не является корнем, мы помешаем в корневой узел самое большое значение
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            makeHeap(arr, size, largest);//рекурсивно преобразуем массив в двоичную кучу
        }
    }

    public static void main(String[] args) {
        int[] needToSortArray = {11,15,3,2,1,90,34,56,78,10};
        sort(needToSortArray);
        for(int k : needToSortArray){
            System.out.println(k);
        }

    }

}
