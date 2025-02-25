public class ArrayMatriks4 {
    public static void main (String[] args) {
        // Program operasi matriks
        int[][] matriksA = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matriksB = {
            {7, 8, 9},
            {10, 11, 12}
        };

        // Penjumlahan matriks
        int[][] hasil = new int[2][3];

        for (int i = 0; i < matriksA.length; i++) {
            for (int j = 0; j < matriksA[0].length; j++) {
                hasil[i][j] = matriksA[i][j] + matriksB[i][j];
            }
        }

        // Menampilkan hasil
        System.out.println("Hasil penjumlahan matriks:");
        for (int[] baris : hasil) {
            for (int nilai : baris) {
                System.out.print(nilai + " ");
            }
            System.out.println();
        }
    }
}