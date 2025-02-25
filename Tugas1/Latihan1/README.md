
```Java

public class LatihanArray1 { //Mendeklarasikan kelas publik bernama LatihanArray1.
    public static void main(String[] args) { //Mendeklarasikan metode main, yang merupakan titik masuk program Java. Metode ini dijalankan pertama kali ketika program dijalankan.
        // Buat program untuk:
        // 1. Membuat array dengan 10 bilangan bulat
        // 2. Mengisi array dengan bilangan genap mulai dari 2
        // 3. Menampilkan isi array
        // 4. Menghitung jumlah semua elemen array

        int[] bilanganGenap = new int[10]; //Mendeklarasikan array bilanganGenap dengan tipe data int yang berisi 10 elemen.
        int jumlah = 0; //Mendeklarasikan variabel jumlah dengan tipe data int dan menginisialisasinya dengan nilai 0.

        // Mengisi array
        for (int i = 0; i < bilanganGenap.length; i++) { //Loop for yang iterasi dari 0 hingga panjang array bilanganGenap.
            bilanganGenap[i] = (i + 1) * 2; //Mengisi setiap elemen array dengan bilangan genap mulai dari 2. (i + 1) menghasilkan 1, 2, 3, ..., 10. Kemudian dikalikan dengan 2 menghasilkan 2, 4, 6, ..., 20.
        }

        // Menampilkan array
        System.out.println("Isi array:"); //Menampilkan teks "Isi array:" di konsol.
        for (int bilangan : bilanganGenap) { //Loop for-each yang iterasi melalui setiap elemen dalam array bilanganGenap.
            System.out.print(bilangan + " "); //Menampilkan setiap bilangan dalam array di konsol, dipisahkan oleh spasi.
            jumlah += bilangan; //Menambahkan nilai bilangan saat ini ke variabel jumlah.
        }

        System.out.println("Jumlah semua elemen: " + jumlah); //Menampilkan teks "Jumlah semua elemen: " diikuti oleh nilai jumlah di konsol.
    }
}

```