public class BruteForce {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 1, 1, 3, 4 };
    System.out.println(getFrequency(1, arr));
  }

  public static int getFrequency(int n, int[] arr) {
    int c = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == n)
        c++;
    }
    return c;
  }
}
