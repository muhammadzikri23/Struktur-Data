```java

//Studi Kasus 2
public class ArrayTicTacToe {
    //kelas publik bernama TicTacToe 
    public static void main(String[] args) {
        //metode utama di mana eksekusi program dimulai.
        char[][] papan = new char[3][3];
        // mendeklarasikan dan menginisialisasi sebuah array dua dimensi (matriks) karakter bernama papan. Matriks ini akan merepresentasikan papan permainan Tic Tac Toe dengan ukuran 3x3.

        // Inisialisasi papan kosong
        for (int i = 0; i < 3; i++) {
          //loop for luar yang akan beriterasi melalui setiap baris dari papan.  
            for (int j = 0; j < 3; j++) {
                //loop for dalam yang akan beriterasi melalui setiap kolom dari papan.
                papan[i][j] = '-';
                //baris ini mengisi setiap elemen papan[i][j] dengan karakter '-', menandakan kotak kosong.
            }
        }

        // Simulasi beberapa langkah
        papan[0][0] = 'X';
        //Baris ini menempatkan karakter 'X' pada baris 0, kolom 0 dari papan.
        papan[1][1] = 'O';
        //Baris ini menempatkan karakter 'O' pada baris 1, kolom 1 dari papan.
        papan[2][2] = 'X';
        //Baris ini menempatkan karakter 'X' pada baris 2, kolom 2 dari papan.

        // Tampilkan papan
        System.out.println("Status Papan:");
        // mencetak teks "Status Papan:" ke terminal.
        tampilkanPapan(papan);
        //memanggil metode tampilkanPapan untuk menampilkan status papan ke terminal.
    }

    public static void tampilkanPapan(char[][] papan) {
        //mendefinisikan metode tampilkanPapan yang menerima matriks karakter papan sebagai argumen.
        for (int i = 0; i < 3; i++) {
            //loop for dalam yang akan beriterasi melalui setiap baris dari papan.
            for (int j = 0; j < 3; j++) {
                //loop for dalam yang akan beriterasi melalui setiap kolom dari papan.
                System.out.print(papan[i][j] + " ");
                // baris ini mencetak elemen papan[i][j] diikuti dengan spasi.
            }
            System.out.println();
            //Baris ini mencetak baris baru setelah setiap baris papan dicetak.
        }
    }
}