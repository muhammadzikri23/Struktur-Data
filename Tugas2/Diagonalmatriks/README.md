```java

public class Diagonalmatriks { //Deklarasi kelas DiagonalMatriks

        public static void main(String[] args) { //Metode utama main, yang akan dieksekusi saat program berjalan
            int[][] matrix = { //Inisialisasi array dua dimensi (matriks) matrix dengan elemen-elemen tertentu
                {2, 3, 4},
                {5, 6, 7},
                {8, 9, 10}
            };
    
            System.out.println("Diagonal utama: "); //Mencetak teks "Diagonal utama: " ke konsol
            for (int i = 0; i < matrix.length; i++) { //Loop for dimulai. i akan berjalan dari 0 hingga panjang matriks (matrix.length)
                System.out.print(matrix[i][i] + " "); //Mencetak elemen matriks pada diagonal utama (matrix[i][i]) diikuti spasi
            }
    
            System.out.println("\nDiagonal samping: "); //Mencetak teks "Diagonal samping: " ke konsol, serta memulai baris baru
            for (int i = 0; i < matrix.length; i++) { //Loop for dimulai lagi. i akan berjalan dari 0 hingga panjang matriks (matrix.length)
                System.out.print(matrix[i][matrix.length - 1 - i] + " "); //Mencetak elemen matriks pada diagonal samping (matrix[i][matrix.length - 1 - i]) diikuti spasi
            }
        }
    }