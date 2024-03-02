// package arraySort;
import java.util.Arrays;

public class Array_declare {

  // searching function

  public static int search(int arr[], int key) {
    for (int i = 0; i < arr.length; i++) {
      {
        if (arr[i] == key) {
          System.out.println("\n" + key + " is found at index " + i);
          return i;
        }
      }
    }
    return key;
  }

  public static void main(String[] args) {
    int[] arr1 = new int[4];
    for (int i = 0; i < arr1.length; i++) {
      arr1[i] = i;
    }

    System.out.println("\nArray Items: ");
    for (int i = 0; i < arr1.length; i++) {
      System.out.print(arr1[i]);
      if (i != arr1.length - 1) {
        System.out.print(",");
      }
    }

    // 2D Array

    int[][] arr2 = new int[2][3];

    for (int i = 0; i < arr2.length; i++) {
      int count = 1;
      for (int j = 0; j < arr2[i].length; j++) {
        arr2[i][j] = count;
        count += 1;
      }
    }

    System.out.println("\n2D Arryay Items: ");
    for (int i = 0; i < arr2.length; i++) {
      for (int j = 0; j < arr2[i].length; j++) {
        System.out.print(arr2[i][j] + " ");
      }
    }

    // array declared and inintialize
    int arr3[] = { 4, 5, 6, 8, 2, 3 };
    System.out.println("\n-----------------Array Elements: ----------\n");
    for (int i = 0; i < arr3.length; i++) {
      System.out.print(arr3[i] + " ");
    }
    System.out.println();

    Arrays.sort(arr3);

    System.out.println(
      "\n-----------------Sorted Array Elements: ----------\n"
    );
    for (int i = 0; i < arr3.length; i++) {
      System.out.print(arr3[i] + " ");
    }

    // Searching
    int key1 = 5;
    int res1 = search(arr3, key1);

    if (res1 == -1) {
      System.out.println("Element is not present in the array.");
    } else {
      System.out.println(
        key1 + " is present at index " + res1 + " of the array."
      );
    }

    int key2 = 53;
    int res2 = search(arr3, key1);

    if (res2 == -1) {
      System.out.println("Element is not present in the array.");
    } else {
      System.out.println(
        key2 + " is present at index " + res2 + " of the array."
      );
    }
  }
}
