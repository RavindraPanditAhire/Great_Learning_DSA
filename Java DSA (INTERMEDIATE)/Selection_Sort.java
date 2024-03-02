public class Selection_Sort {

  public void selectionSort(int[] arr) {
    for (int i = 0; i <= arr.length; i++) {
      int minInd = i;

      for (int j = i + 1; j < arr.length; j++) {
        if (arr[minInd] < arr[j]) {
          minInd = j;
        }

        int temp = arr[j];
        arr[j] = arr[minInd];
        arr[minInd] = temp;
      }
    }
  }

  public static void main(String[] args) {
    Selection_Sort s = new Selection_Sort();

    int[] arr1 = { 4, 2, 1, 5, 6, 3, 2 };

    System.out.println("Original Array: ");
    for (int i : arr1) {
      System.out.print(i + " ");
    }
    System.out.println();

    s.selectionSort(arr1);
    System.out.println("Sorted Array: ");
    for (int i : arr1) {
      System.out.print(i + " ");
    }
    System.out.println();
  }
}
