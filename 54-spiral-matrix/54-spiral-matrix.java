class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // setting edges.
        int col = matrix.length;
        int row = matrix[0].length;
        
        int top = 0;
        int bottom = col - 1;
        int left = 0;
        int right = row - 1;
        
        // traversing.
        while(top <= bottom && left <= right){
            
            for(int i = left; i <= right; i++)
                list.add(matrix[top][i]); // 1,2,3,4
            top ++;
            
            for(int i = top; i <= bottom; i++) // 8,12,16,
                list.add(matrix[i][right]);
            right --;
            
            if(top <= bottom){
                for(int i = right; i >= left; i --)
                    list.add(matrix[bottom][i]);  // 15,14,13
                bottom --;
            }
            
            if(left <= right){
                for(int i = bottom; i >= top; i --)
                    list.add(matrix[i][left]);  // 9,5
                    left ++;
            }
        }
        
        return list;
        
    }   
}

//      left     right
//  top [1, 2, 3, 4]
//      [5, 6, 7, 8]
//      [9, 10 11,12]
//bottom[13,14 15,16]