import java.util.Arrays;

class SelectionSort {
  public static void main(String[] args) {
    int[] arr = { 5, 4, 3, 2, 1 };
    SSort(arr);
  }

  static void SSort(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      int last = arr.length - 1 - i;
      int max = getMaxIndex(arr, last);
      swap(arr, max, last);
    }
    System.out.println(Arrays.toString(arr));
  }

  static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  static int getMaxIndex(int arr[], int last) {
    int max = 0;
    for (int i = 1; i <= last; i++) {
      if (arr[i] > arr[max])
        max = i;
    }
    return max;
  }
}
