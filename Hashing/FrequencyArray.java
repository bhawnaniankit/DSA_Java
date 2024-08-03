import java.util.Arrays;

class FrequencyArray {
  int arr1[] = new int[1000000000];

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 1 };
    System.out.println(Arrays.toString(hashArr(8, arr)));
  }

  static int[] hashArr(int maxRange, int[] arr) {
    int feq[] = new int[maxRange + 1];
    for (int i = 0; i < arr.length; i++) {
      feq[arr[i]]++;
    }
    return feq;
  }
}
