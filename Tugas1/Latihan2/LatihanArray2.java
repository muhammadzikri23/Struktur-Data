public class LatihanArray2 {
    public static void main(String[] args) {
        // Program mencari nilai dalam array
        int[] nilai = {75, 80, 65, 90, 85, 70, 95, 88};
        int cari = 90;
        boolean ketemu = false;
        int indeks = -1;

        // Mencari nilai
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == cari) {
                ketemu = true;
                indeks = i;
                break;
            }
        }

        // Menampilkan hasil
        if (ketemu) {
            System.out.println("Nilai " + cari + " ditemukan pada indeks " + indeks);
        } else {
            System.out.println("Nilai " + cari + " tidak ditemukan");
        }
    }
}