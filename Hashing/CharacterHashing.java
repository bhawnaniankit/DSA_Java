import java.util.Arrays;

public class CharacterHashing {
  public static void main(String[] args) {
    char[] arr = { 'a', 'c', 'd', 'f', 'f', 'e' };
    System.out.println(Arrays.toString(hashArr('a', arr)));
  }

  static int[] hashArr(char ch, char[] arr) {
    int feq[] = new int[26];
    for (int i = 0; i < arr.length; i++) {
      feq[(int) arr[i] - (int) 'a']++;
    }
    return feq;
  }
}
