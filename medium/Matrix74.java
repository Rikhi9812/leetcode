class Matrix74{
    public static void main(String[] args) {

        Matrix74 matrix = new Matrix74();
        System.out.println(matrix.searchMatrix(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}}, 3));
        
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;

        int low =0;
        int high=r*c-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            int row = mid/c;
            int col = mid%c;

            if(matrix[row][col] == target) {
                System.out.println(row +" "+ col);
                return true;
            } else if(matrix[row][col] > target){
                high = mid-1;
            } else {
                low = mid +1;
            }
        }
        return false;
    }
}