package BasicProblems;

import java.util.Scanner;

class printName {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    int i = 0;
    giveName(i, n);
  }

  static void giveName(int i, int n) {
    if (i >= n) // base condition
      return;
    System.out.println("Ankit");
    giveName(i + 1, n);
  }

}

// Time Complexicity: O(n)
// Space Complexicity: O(n)
