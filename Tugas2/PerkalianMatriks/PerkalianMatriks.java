public class PerkalianMatriks { 
    public static void main(String[] args) { 
            int[][] matriksA = {
            {1, 2},
            {3, 4} 
             };
            
            int[][] matriksB = {
            {5, 6},
            {7, 8}
            };
    
            int[][] hasilKali = perkalianMatriks(matriksA, matriksB);
            
            System.out.println("Hasil Perkalian Matriks:");
           
            tampilkanMatriks(hasilKali);
            
        }
    
        public static int[][] perkalianMatriks(int[][] A, int[][] B) {
          
            int barisA = A.length;
            
            int kolomA = A[0].length;
            
            int kolomB = B[0].length;
            
            int[][] hasil = new int[barisA][kolomB];
            
            for (int i = 0; i < barisA; i++) {
                 for (int j = 0; j < kolomB; j++) {
                    for (int k = 0; k < kolomA; k++) {
                        
                    hasil[i][j] += A[i][k] * B[k][j];
                        
                    }
                }
            }
            return hasil;
            
        }
        public static void tampilkanMatriks(int[][] matriks) {
            for (int[] baris : matriks) {
                 for (int nilai : baris) {

                    
                    
                System.out.println();
               
            }
        }
    }
}
    
    