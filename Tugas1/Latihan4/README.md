```java

public class ArrayMatriks4 { // Mendeklarasikan kelas bernama OperasiMatriks
    public static void main(String[] args) { // Method main untuk memulai eksekusi program
        
        // Program operasi matriks
        int[][] matriksA = { // Deklarasi dan inisialisasi array 2D matriksA dengan elemen-elemen awal
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matriksB = { // Deklarasi dan inisialisasi array 2D matriksB dengan elemen-elemen awal
            {7, 8, 9},
            {10, 11, 12}
        };

        // Penjumlahan matriks
        int[][] hasil = new int[2][3]; // Deklarasi array 2D hasil untuk menyimpan hasil penjumlahan matriksA dan matriksB dengan ukuran yang sama

        for (int i = 0; i < matriksA.length; i++) { // Looping melalui setiap baris dari matriksA
            for (int j = 0; j < matriksA[0].length; j++) { // Looping melalui setiap kolom dari matriksA
                hasil[i][j] = matriksA[i][j] + matriksB[i][j]; // Menjumlahkan elemen dari matriksA dan matriksB pada posisi yang sama dan menyimpannya di hasil
            }
        }

        // Menampilkan hasil
        System.out.println("Hasil penjumlahan matriks:"); // Menampilkan teks "Hasil penjumlahan matriks:"
        for (int[] baris : hasil) { // Looping melalui setiap baris dari array 2D hasil
            for (int nilai : baris) { // Looping melalui setiap elemen di baris yang sedang diproses
                System.out.print(nilai + " "); // Menampilkan setiap elemen dari baris diikuti dengan spasi
            }
            System.out.println(); // Menampilkan baris baru setelah setiap baris matriks ditampilkan
        }
    }
} 