package suanFa;

import java.util.Arrays;

public class Maths {
    public static void main(String[] args) {
        int[] arr = {5, 4, 6, 3, 2, 7};
        //selectionSort(arr);
        //maoPao(arr);
        insertSort(arr);
    }

    //冒泡排序
    public static void maoPao(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("冒泡排序\t");
        for (int x : arr) {
            System.out.printf("%d\t", x);
        }
    }

    //选择排序  减少每次的交换数字
    public static void selectionSort(int[] arr) {
        //选择排序的优化
        for (int i = 0; i < arr.length - 1; i++) {// 做第i趟排序
            int k = i;
            for (int j = k + 1; j < arr.length; j++) {// 选最小的记录
                if (arr[j] < arr[k]) {
                    k = j; //记下目前找到的最小值所在的位置
                }
            }
            //在内层循环结束，也就是找到本轮循环的最小的数以后，再进行交换
            if (i != k) {  //交换a[i]和a[k]
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
            }
        }
        System.out.println();
        System.out.println("交换后：");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    //插入排序
    public static void insertSort(int[] arr) {
        int i, j, insertNote;
        for (i = 1; i < arr.length; i++) {
            insertNote = arr[i];
            j = i - 1;

            //精华部分
            while (j >= 0 && insertNote < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = insertNote;
        }
        System.out.println(Arrays.toString(arr));
    }
}
