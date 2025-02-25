public class Diagonalmatriks { 

    public static void main(String[] args) { 
        int[][] matrix = { 
            {2, 3, 4},
            {5, 6, 7},
            {8, 9, 10}
        };

        System.out.println("Diagonal utama: "); 
        for (int i = 0; i < matrix.length; i++) { 
            System.out.print(matrix[i][i] + " "); 
        }

        System.out.println("\nDiagonal samping: "); 
        for (int i = 0; i < matrix.length; i++) { 
            System.out.print(matrix[i][matrix.length - 1 - i] + " "); 
        }
    }
}