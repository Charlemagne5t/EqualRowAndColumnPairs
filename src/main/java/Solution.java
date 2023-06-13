import java.util.*;

public class Solution {
    public int equalPairs(int[][] grid) {
        //TODO
        int m = grid.length;
        Map<List<Integer>, Integer> rows = new HashMap<>();
        List<List<Integer>> columns = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                row.add(grid[i][j]);
                if (columns.size() == j) {
                    columns.add(new ArrayList<>());
                }
                columns.get(j).add(grid[i][j]);
            }
            if (rows.containsKey(row)) {
                int val = rows.get(row);
                val++;
                rows.put(row, val);
            } else rows.put(row, 1);
        }
        int count = 0;
        for (List<Integer> column : columns) {
            count += rows.getOrDefault(column, 0);
        }
        return count;
    }
}