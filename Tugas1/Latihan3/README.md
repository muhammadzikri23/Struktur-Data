```Java

public class StatistikArray3 { // Mendeklarasikan kelas bernama StatistikArray. Kelas ini digunakan untuk melakukan operasi statistik pada array.
    public static void main(String[] args) { // Method main untuk memulai eksekusi program
        // Program menghitung statistik nilai siswa
        int[] nilai = {75, 80, 65, 90, 85, 70, 95, 88}; // Deklarasi dan inisialisasi array nilai dengan beberapa elemen. Array ini berisi nilai-nilai siswa.

        // Mencari nilai tertinggi dan terendah
        int tertinggi = nilai[0]; // Menyimpan nilai pertama dari array sebagai nilai tertinggi sementara
        int terendah = nilai[0]; // Menyimpan nilai pertama dari array sebagai nilai terendah sementara
        int total = nilai[0]; // Menyimpan nilai pertama dari array sebagai total nilai sementara

        for (int i = 1; i < nilai.length; i++) { // Looping untuk iterasi melalui setiap elemen array mulai dari indeks ke-1
            if (nilai[i] > tertinggi) tertinggi = nilai[i]; // Kondisi untuk memperbarui nilai tertinggi jika elemen lebih besar dari nilai tertinggi sementara
            if (nilai[i] < terendah) terendah = nilai[i]; // Kondisi untuk memperbarui nilai terendah jika elemen lebih kecil dari nilai terendah sementara
            total += nilai[i]; // Menambahkan nilai elemen saat ini ke total nilai
        }

        double rataRata = (double) total / nilai.length; // Menghitung rata-rata nilai dengan membagi total nilai dengan jumlah elemen dalam array. Konversi ke tipe double untuk mendapatkan hasil pecahan.

        System.out.println("Nilai tertinggi: " + tertinggi); // Menampilkan nilai tertinggi dengan menggunakan System.out.println
        System.out.println("Nilai terendah: " + terendah); // Menampilkan nilai terendah dengan menggunakan System.out.println
        System.out.println("Rata-rata: " + rataRata); // Menampilkan rata-rata nilai dengan menggunakan System.out.println
    }
}