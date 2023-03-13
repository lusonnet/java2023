import java.util.Arrays;

/**
 * @ClassName: Main
 * @Description: 排序算法
 * @author: sonnet
 * @date: 2023/3/13 22:35
 */


public class Main {
    public static void main(String[] args) {
        int[] arr = {12,3,32,22,9,34,63,11,10};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void quickSort(int[] arr) {
        quick(0,arr.length - 1,arr);
    }

    public static void quick(int left, int right, int[] arr) {
        if(left >= right)return;
        int pivot = partition(left,right,arr);
        quick(left,pivot - 1,arr);
        quick(pivot + 1,right,arr);
    }

    public static int partition(int left, int right, int[] arr) {
        int tmp = arr[left];//基准数取最左值
        while (left < right){
            while(left < right && arr[right] >= tmp){
                 right--;
            }
            arr[left] = arr[right];//将比基准值小的数放到左边
            while (left < right && arr[left] <= tmp){
                left++;
            }
            arr[right] = arr[left];//将比基准值大的数放到右边

        }
        arr[left] = tmp;//将基准值放到left==right处
        return left;
    }
}
