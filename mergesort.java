public class mergesort {
    public static void conquer(int arr[], int si, int ei, int mid){
        int merger[] = new int[ei - si + 1];
        int idx1 = si; // starting index of left subarray
        int idx2 = mid + 1; // starting index of right subarray
        int x = 0; // index for merged array

        while(idx1 <= mid && idx2 <= ei){
            if(arr[idx1] <= arr[idx2]){
                merger[x++] = arr[idx1++];
            }else{
                merger[x++] = arr[idx2++];
            }
        }

        while(idx1 <= mid){
            merger[x++] = arr[idx1++];
        }

        while (idx1 <= ei){
            merger[x++] = arr[idx2++];
        }
        for(int i = 0, j=si; i < merger.length; i++,j++){
            arr[j] = merger[i];
        }
    }
    public static void divide(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei-si)/2; // (si + ei) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, ei, mid);
    }
    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8};
        int n = arr.length;  
        divide(arr, 0, n - 1);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    
}

    // Output: 2 3 5 6 8 9
}
