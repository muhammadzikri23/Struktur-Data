public class ArrayTicTacToe {
    public static void main(String[] args) {
        char[][] papan = new char[3][3];

        // Inisialisasi papan kosong
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                papan[i][j] = '-';
            }
        }

        // Simulasi beberapa langkah
        papan[0][0] = 'X';
        papan[1][1] = 'O';
        papan[2][2] = 'X';

        // Tampilkan papan
        System.out.println("Status Papan:");
        tampilkanPapan(papan);
    }

    public static void tampilkanPapan(char[][] papan) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(papan[i][j] + " ");
            }
            System.out.println();
}
    }

}