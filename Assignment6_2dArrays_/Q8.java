class Solution {
    public int[][] multiply(int[][] A, int[][] B) {
        int m = A.length;
        int n = A[0].length;
        int l = B[0].length;
        int[][] C = new int[m][l];

        for(int i=0; i< m; i++){
            for(int j = 0; j< n; j++){
                if(A[i][j] != 0){
                    for(int k = 0; k<l; k++)
                        C[i][k] += A[i][j]* B[j][k];
                }
            }    
        }
        return C;
    }
}
