package Day1_3Assignments;

public class Task7 {
    public static void main(String[] args) {
        int[] arr = new int[]{5,2,7,4};
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
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
