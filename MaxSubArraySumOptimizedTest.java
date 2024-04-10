import org.junit.Assert;
import org.junit.Test;

public class MaxSubArraySumOptimizedTest {

    @Test
    public void testMixedNumbers() {
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Assert.assertEquals(6, MaxSubArraySumOptimized.maxSubArraySum(array));
    }

    @Test
    public void testAllNegativeNumbers() {
        int[] array = {-2, -1, -3, -4};
        Assert.assertEquals(0, MaxSubArraySumOptimized.maxSubArraySum(array));
    }

    @Test
    public void testAllPositiveNumbers() {
        int[] array = {1, 2, 3, 4};
        Assert.assertEquals(10, MaxSubArraySumOptimized.maxSubArraySum(array));
    }

    @Test
    public void testEmptyArray() {
        int[] array = {};
        Assert.assertEquals(0, MaxSubArraySumOptimized.maxSubArraySum(array));
    }
}
