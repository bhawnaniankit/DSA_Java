package BasicProblems;

public class printNumBacktracking {
  public static void main(String[] args) {
    int n = 5;
    printNumbers(n);
  }

  static void printNumbers(int n) {
    if (n <= 1)
      return;
    printNumbers(--n);
    System.out.println(n);
  }
}
