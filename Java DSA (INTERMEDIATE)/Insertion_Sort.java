public class Insertion_Sort {

    public void insertSort(int []arr){
        for (int i = 0; i <= arr.length-1; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6};
        
        System.out.println("Given Array");
        for (int i=0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Insertion_Sort ob = new Insertion_Sort();
        System.out.println("\nSorted array");
        ob.insertSort(arr);
        for (int i=0; i < arr.length; i++)  
            System.out.print(arr[i] + " ");                
    }  
}
/* Output:
Given Array
12 11 13  5 6  

Sorted array
5 11 6 12 13 */
        
