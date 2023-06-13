import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void equalPairsTest1() {
        int[][] grid = {
                {3, 2, 1},
                {1, 7, 6},
                {2, 7, 7}
        };
        int output = 1;
        Assert.assertEquals(output, new Solution().equalPairs(grid));
    }

    @Test
    public void equalPairsTest2() {
        int[][] grid = {
                {3, 1, 2, 2},
                {1, 4, 4, 5},
                {2, 4, 2, 2},
                {2, 4, 2, 2}
        };
        int output = 3;
        Assert.assertEquals(output, new Solution().equalPairs(grid));
    }
}
