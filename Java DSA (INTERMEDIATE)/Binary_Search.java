
public class Binary_Search{

    void binarySearch(int []arr,int key){
        // first check that arr is Sorted ort Not
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                System.out.println("\nArray is Not Sorted...");
                return;
            }
        }

        int s=0;
        int e=arr.length-1;

        while (s<=e) {
            int mid=(s+e)/2;

            if (key == arr[mid]) {
                System.out.println(key+" Found at index: "+mid);
                return;
            }

            if (key < arr[mid]) {
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
    }
    public static void main(String[] args) {

        Binary_Search b=new Binary_Search();
        int []arr1={1,2,3,4,5,6,7,8};
        int []arr2={1,2,3,4,55,6,7,8};

        int key1=5;
        int key2=6;

        b.binarySearch(arr1, key1);
        b.binarySearch(arr2, key2);
        
    }
}