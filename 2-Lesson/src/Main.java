public class Main {

  public static void main(String[] args) {
    // 1.
//    int[] arr = { 1, 0, 1, 0, 0, 1 };
//    invertArray(arr);
//    for (int i : arr) {
//      System.out.println(i);
//    }

  }
  //1.
  public static void invertArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 1) {
        arr[i]--;
      } else {
        arr[i]++;
      }
    }
  }

}