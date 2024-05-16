package Day1_3Assignments;

public class Task7_a {
    public static int[] BruteForceSort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            if(minIndex!=i){
                int temp=arr[i];
                arr[i]= arr[minIndex];
                arr[minIndex]=temp;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{5,2,7,4};
        int[] arr1 = BruteForceSort(arr);
        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
    }
}
