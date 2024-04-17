package Day1_3Assignments;

public class Task7b {
    public static int PerformLinearSearch(int[] arr,int pivot){
        for (int i = 0; i < arr.length; i++) {
            if (pivot == arr[i]){
                return 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
//        Task7b t = new Task7b();
        int pivot = 6;
        int i = PerformLinearSearch(arr,pivot);
        if(i==1){
            System.out.println("element found");
        }
        if(i==-1){
            System.out.println("element not found");
        }
    }
}
