```java

//Studi Kasus 1
public class SistemNilai {
    //kelas publik bernama SistemNilai
    public static void main(String[] args) {
        //metode utama di mana eksekusi program dimulai.

        // Data siswa
        String[] namaSiswa = {"Ani", "Budi", "Cici", "Dodi", "Edi"};
        //mendeklarasikan dan menginisialisasi sebuah array string bernama namaSiswa yang berisi nama-nama siswa.
        int[][] nilai = {
            //mendeklarasikan dan menginisialisasi array dua dimensi (matriks) bilangan bulat bernama nilai.Matriks ini akan menyimpan nilai-nilai siswa. 
            {80, 85, 90}, // Nilai Ani
            //Baris ini mendefinisikan baris pertama dari nilai dengan elemen 80, 85, dan 90, yang merupakan nilai-nilai Ani.
            {75, 70, 85}, // Nilai Budi
            //aris ini mendefinisikan baris kedua dari nilai dengan elemen 75, 70, dan 85, yang merupakan nilai-nilai Budi.
            {85, 80, 88}, // Nilai Cici
            //Baris ini mendefinisikan baris ketiga dari nilai dengan elemen 85, 80, dan 88, yang merupakan nilai-nilai Cici.
            {90, 85, 95}, // Nilai Dodi
            //Baris ini mendefinisikan baris keempat dari nilai dengan elemen 90, 85, dan 95, yang merupakan nilai-nilai Dodi.
            {70, 75, 80}  // Nilai Edi
            //Baris ini mendefinisikan baris kelima dari nilai dengan elemen 70, 75, dan 80, yang merupakan nilai-nilai Edi.
        };
        String[] mapel = {"Matematika", "Bahasa Inggris", "IPA"};
        //endeklarasikan dan menginisialisasi sebuah array string bernama mapel yang berisi nama-nama mata pelajaran.

        // Menghitung rata-rata per siswa
        System.out.println("Rata-rata nilai per siswa:");
        //mencetak teks "Rata-rata nilai per siswa:" ke terminal.
        for (int i = 0; i < nilai.length; i++) {
            // loop for luar yang akan beriterasi melalui setiap baris dari nilai (setiap siswa).
            double total = 0;
            //baris ini mendeklarasikan variabel total bertipe double dan menginisialisasinya dengan 0. Variabel ini akan digunakan untuk menghitung total nilai setiap siswa.
            for (int n : nilai[i]) {
                // memulai loop for-each yang akan iterasi melalui setiap nilai dalam baris nilai[i]
                total += n;
                //baris ini menambahkan nilai elemen saat ini (n) ke variabel total.
            }
            double rataSiswa = total / nilai[i].length;
            //menghitung rata-rata nilai siswa dengan membagi total dengan jumlah elemen dalam baris nilai[i].
            System.out.printf("%s: %.2f\\n", namaSiswa[i], rataSiswa);
            //mencetak nama siswa dan rata-rata nilainya ke terminal menggunakan printf untuk memformat output dengan 2 desimal.
        }

        // Menghitung rata-rata per mata pelajaran
        System.out.println("\\nRata-rata nilai per mata pelajaran:");
        //mencetak baris baru (\n) dan teks "Rata-rata nilai per mata pelajaran:" ke terminal.
        for (int j = 0; j < nilai[0].length; j++) {
            //memulai loop for yang akan iterasi melalui setiap mata pelajaran dalam matriks nilai.
            double total = 0;
            //baris ini mendeklarasikan variabel total bertipe double dan menginisialisasinya dengan 0.
            for (int i = 0; i < nilai.length; i++) {
                //memulai loop for yang akan iterasi melalui setiap siswa dalam matriks nilai.
                total += nilai[i][j];
                //baris ini menambahkan nilai elemen nilai[i][j] ke variabel total.
            }
            double rataMapel = total / nilai.length;
            //menghitung rata-rata nilai mata pelajaran dengan membagi total dengan jumlah siswa.
            System.out.printf("%s: %.2f\\n", mapel[j], rataMapel);
            //mencetak nama mata pelajaran dan rata-rata nilainya ke terminal menggunakan printf untuk memformat output dengan 2 desimal.
        }
    }
}