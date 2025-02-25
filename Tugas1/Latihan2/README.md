```Java

public class Latihan2 { // Mendeklarasikan kelas bernama PencarianArray
    public static void main(String[] args) { // Method main untuk memulai eksekusi program
        // Program mencari nilai dalam array
        int[] nilai = {75, 80, 65, 90, 85, 70, 95, 88}; // Deklarasi dan inisialisasi array nilai dengan beberapa elemen
        int cari = 90; // Variabel untuk nilai yang akan dicari dalam array
        boolean ketemu = false; // Variabel boolean untuk menandai apakah nilai ditemukan atau tidak
        int indeks = -1; // Variabel untuk menyimpan indeks dari nilai yang ditemukan

        // Mencari nilai
        for (int i = 0; i < nilai.length; i++) { // Looping untuk iterasi melalui setiap elemen array
            if (nilai[i] == cari) { // Kondisi untuk memeriksa apakah nilai pada indeks i sama dengan nilai yang dicari
                ketemu = true; // Menandai bahwa nilai telah ditemukan
                indeks = i; // Menyimpan indeks dari nilai yang ditemukan
                break; // Menghentikan looping setelah nilai ditemukan
            }
        }

        // Menampilkan hasil
        if (ketemu) { // Kondisi untuk memeriksa apakah nilai ditemukan
            System.out.println("Nilai " + cari + " ditemukan pada indeks " + indeks); // Menampilkan pesan jika nilai ditemukan
        } else { // Jika nilai tidak ditemukan
            System.out.println("Nilai " + cari + " tidak ditemukan"); // Menampilkan pesan jika nilai tidak ditemukan
        }
    }
}
```