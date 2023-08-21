public class Arrays {
    /** 2.1 */
    public static int[] insert(int[] arr, int item, int position) {
        int[] res = new int[arr.length + 1];
        position = Math.min(arr.length, position);
        System.arraycopy(arr, 0, res, 0 ,position);
        res [position] = item;
        for (int i = position;i < arr.length; i++) {
            res[i + 1] = arr[i];
        }
        return res;
    }

    /** 2.2 */
    public static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    /** 2.3 */
    public static int[] replicate(int[] arr) {
        int total_size = 0;
        for (int j : arr) {
            total_size += j;
        }
        int[] ans_list = new int[total_size];
        for (int i = 0,k = 0; i< arr.length; i++) {
            for(int j = k; j < k + arr[i]; j++) {
                ans_list[j] = arr[i];
            }
            k += arr[i];
        }
        return ans_list;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
//        int[] ans = replicate(arr);
//        reverse(arr);
//        int[] ans = insert(arr,5,0);
    }
}
