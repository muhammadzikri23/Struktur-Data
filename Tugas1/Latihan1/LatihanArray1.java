public class LatihanArray1 {
    public static void main(String[] args) {
        // Buat program untuk:
        // 1. Membuat array dengan 10 bilangan bulat
        // 2. Mengisi array dengan bilangan genap mulai dari 2
        // 3. Menampilkan isi array
        // 4. Menghitung jumlah semua elemen array

        int[] bilanganGenap = new int[10];
        int jumlah = 0;

        // Mengisi array
        for (int i = 0; i < bilanganGenap.length; i++) {
            bilanganGenap[i] = (i + 1) * 2;
        }

        // Menampilkan array
        System.out.println("Isi array:");
        for (int bilangan : bilanganGenap) {
            System.out.print(bilangan + " ");
            jumlah += bilangan;
        }

        System.out.println("\\nJumlah semua elemen: " + jumlah);
    }
}
