``` java

Perkalian  Matriks

public class PerkalianMatriks { // Kelas publik nama 
    public static void main(String[] args) { // metode utama di mana eksekusi program di mulai
    
       // Matriks A
            int[][] matriksA = {
               //mendeklarasikan dan menginisialisasi sebuah array dua dimensi (matriks) bilangan bulat bernama matriksA.
                {1, 2},
                //mendefinisikan baris pertama dari matriksA dengan elemen 1 dan 2.
                {3, 4} 
                //mendefinisikan baris kedua dari matriksA dengan elemen 3 dan 4. 
            };
    
            // Matriks B
            int[][] matriksB = {
            //mendeklarasikan dan menginisialisasi sebuah array dua dimensi (matriks) bilangan bulat bernama matriksB.
                {5, 6},
                //mendefinisikan baris pertama dari matriksB dengan elemen 5 dan 6.
                {7, 8}
                //mendefinisikan baris kedua dari matriksB dengan elemen 7 dan 8.
                
            };
    
            // Perkalian Matriks
            int[][] hasilKali = perkalianMatriks(matriksA, matriksB);
            //Baris ini memanggil metode perkalianMatriks dengan argumen matriksA dan matriksB, dan menyimpan hasilnya dalam variabel hasilKali.
    
            // Tampilkan hasil
            System.out.println("Hasil Perkalian Matriks:");
            //mencetak teks "Hasil Perkalian Matriks:" ke terminal.
            tampilkanMatriks(hasilKali);
            //memanggil metode tampilkanMatriks dengan argumen hasilKali untuk menampilkan hasil perkalian matriks ke terminal.
        }
    
        public static int[][] perkalianMatriks(int[][] A, int[][] B) {
         //mendefinisikan metode perkalianMatriks yang menerima dua matriks sebagai argumen dan mengembalikan hasil perkalian matriks.   
            int barisA = A.length;
            // menyimpan jumlah baris dari matriks A ke dalam variabel barisA.
            int kolomA = A[0].length;
            //menyimpan jumlah kolom dari matriks A ke dalam variabel kolomA.
            int kolomB = B[0].length;
            //menyimpan jumlah kolom dari matriks B ke dalam variabel kolomB.
            int[][] hasil = new int[barisA][kolomB];
            // mendeklarasikan dan menginisialisasi matriks hasil dengan ukuran barisA x kolomB untuk menyimpan hasil perkalian.
    
            for (int i = 0; i < barisA; i++) {
                //loop luar yang beriterasi melalui setiap baris dari matriks A. 
                for (int j = 0; j < kolomB; j++) {
                    // loop dalam yang beriterasi melalui setiap kolom dari matriks B. 
                    for (int k = 0; k < kolomA; k++) {
                        // loop terdalam yang beriterasi melalui setiap kolom dari matriks A (atau baris dari matriks B).
                        hasil[i][j] += A[i][k] * B[k][j];
                        //menghitung hasil perkalian elemen-elemen matriks dan menambahkannya ke elemen hasil[i][j].
                    }
                }
            }
            return hasil;
            // mengembalikan matriks hasil perkalian.
        }
    
        public static void tampilkanMatriks(int[][] matriks) {
            //mendefinisikan metode tampilkanMatriks yang menerima matriks sebagai argumen dan menampilkan elemen-elemen matriks ke terminal.
            for (int[] baris : matriks) {
                // loop for-each yang beriterasi melalui setiap baris dari matriks.
                for (int nilai : baris) {
                    //loop for-each yang beriterasi melalui setiap elemen dalam baris.
                    System.out.print(nilai + " ");
                    //mencetak nilai elemen diikuti dengan spasi.
                }
                System.out.println();
                //mencetak baris baru setelah setiap baris matriks dicetak.
            }
        }
    }
    
    
