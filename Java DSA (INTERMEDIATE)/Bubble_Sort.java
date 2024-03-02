public class Bubble_Sort {

  public void bubbleSort(int[] arr) {
    for (int i = 1; i <= arr.length - 1; i++) {
      for (int j = 0; j <= arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }

  public static void main(String[] args) {
    Bubble_Sort bs = new Bubble_Sort();

    int[] arr = { 22, 56, 14, 32, 89, 65, 14 };
    System.out.println("Original Array: ");
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();

    bs.bubbleSort(arr);
    System.out.println("\nSorted Array in Ascending Order: ");
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
  }
}
