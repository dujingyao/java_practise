package experiment.No1;

public class c_sort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        // 冒泡排序
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 交换arr[j]和arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // 输出排序后的数组
        System.out.print("排序后的数组：");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
