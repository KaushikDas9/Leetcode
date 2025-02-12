
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length;
        int m = image[0].length;
        Queue<int[]> q = new LinkedList<>();
        int[][] vis = new int[n][m];
        
  
        int originalColor = image[sr][sc];

     
        if (originalColor == color) {
            return image;
        }

        
        q.add(new int[]{sr, sc});
        image[sr][sc] = color; 

        while (!q.isEmpty()) {
            int[] temp = q.poll();
            int row = temp[0];
            int col = temp[1];

            // Check all four directions (up, down, left, right)
            // left
            if (col - 1 >= 0 && image[row][col - 1] == originalColor) {
                image[row][col - 1] = color;
                q.add(new int[]{row, col - 1});
            }
            // right
            if (col + 1 < m && image[row][col + 1] == originalColor) {
                image[row][col + 1] = color;
                q.add(new int[]{row, col + 1});
            }
            // up
            if (row - 1 >= 0 && image[row - 1][col] == originalColor) {
                image[row - 1][col] = color;
                q.add(new int[]{row - 1, col});
            }
            // down
            if (row + 1 < n && image[row + 1][col] == originalColor) {
                image[row + 1][col] = color;
                q.add(new int[]{row + 1, col});
            }
        }

        return image;
    }
}