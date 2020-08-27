public class Main {

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

  //2.
  public static void fillArray(int arr[]) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      arr[i] = count;
      count += 3;
    }
  }

  //3.
  public static void changeArray() {
    int[] w = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    for (int i = 0; i < w.length; i++) {
      if (w[i] < 6) {
        w[i] = w[i] * 2;
      }
    }
  }

  //4.
  public static void fillDiagonal() {
    int[][] arr = new int[4][4];
    int x = 3;
    int y = 0;
    for (int i = 0; i < 4; i++) {
      arr[i][y] = 1;
      y++;
      arr[i][x] = 1;
      x--;
    }
  }

  //5.
  public static void minElement() {
    int[] w = {100, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 2};
    int count = w[0];
    for (int i = 1; i < w.length; i++) {
      if (w[i] < count) {
        count = w[i];
      }
    }
  }

  //6.
  public static boolean checkBalance(int arr[]) {
    boolean b = true;
    int sumArray = 0;
    for (int i : arr) {
      sumArray += i;
    }
    if (sumArray % 2 == 1) {
      b = false;
    } else {
      int x = 0;
      int y = 0;
      for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
        x += arr[i];
        y += arr[j];
        if (x == y) {
          return b = true;
        }
      }
    }
    return b;
  }


  //7.
  public static void swapArray(int array[], int quantitySwap) {

    if (quantitySwap > 0) {
      int element1 = array[0];
      for (int i = 0; i < quantitySwap; i++) {
        array[0] = array[array.length - 1];
        for (int j = 1; j < array.length; j++) {
          int count = array[j];
          array[j] = element1;
          element1 = count;
        }
      }
    } else {
      int element2 = array[array.length - 1];
      for (int i = quantitySwap; i < 0; i++) {
        array[array.length - 1] = array[0];
        for (int j = array.length - 2; j >= 0; j--) {
          int count = array[j];
          array[j] = element2;
          element2 = count;
        }
      }
    }
  }

}








