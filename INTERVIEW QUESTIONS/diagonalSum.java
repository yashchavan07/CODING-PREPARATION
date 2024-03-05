
public class diagonalSum {
    public static int DiagonalSum(int matrix[][]){
        int sum = 0;
       /* brute force simple logic but time complexity is high i.e 0(n^2)
        
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(i==j){
                    sum += matrix[i][j];
                } // till here addition of primary matrix
                else if(i+j == matrix.length-1){
                    sum += matrix[i][j];
                }
            }

        }
        return sum;*/

        //optimise apporach of O(n) time complexity
        for(int i=0; i<matrix.length; i++){
            //PD
            sum += matrix[i][i];
            //SD
            if(i != matrix.length-1 -i){
                sum += matrix[i][matrix.length-1- i];

            }
        }
        return sum;

    }

    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}};
       System.out.println(DiagonalSum(matrix));
        
    }
    
}
