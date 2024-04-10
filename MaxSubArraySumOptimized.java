import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;

public class MaxSubArraySumOptimized {

    // 计算最大子数组和的优化方法（时间复杂度O(n^2)）
    public static int maxSubArraySum(int[] a) {
        int maxSum = Integer.MIN_VALUE; // 初始化为最小整数，确保至少有一个元素
        int n = a.length; // 数组长度

        for (int i = 0; i < n; i++) { // 遍历所有可能的起始位置
            int currentSum = 0; // 当前子数组的和从0开始累加
            for (int j = i; j < n; j++) { // 从i开始，累加子数组和
                currentSum += a[j]; // 累加从i到j的子数组和
                if (currentSum > maxSum) {
                    maxSum = currentSum; // 更新最大子数组和
                }
            }
        }

        // 如果所有元素都是负数，找到最大的负数
        if (maxSum < 0) {
            maxSum = 0;
        }

        return maxSum; // 返回最大子数组和
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 读取数组长度
        int[] arr = new int[n]; // 创建数组存储元素
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // 读取每个元素
        }
        int maxSum = maxSubArraySum(arr); // 调用函数计算最大子数组和
        System.out.println(maxSum); // 输出结果
    }
}



////////////////////////////////////////////


