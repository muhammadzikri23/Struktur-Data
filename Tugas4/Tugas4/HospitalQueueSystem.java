import java.util.Scanner;

// Main class dengan antarmuka berbasis menu
public class HospitalQueueSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PatientQueue queue = new PatientQueue(10); // Membuat antrian dengan kapasitas 10
        int patientCounter = 1;
        boolean running = true;

        System.out.println("===== Selamat Datang di Sistem Antrian Rumah Sakit =====");

        while (running) {
            displayMenu();

            System.out.print("Masukkan pilihan Anda: ");
            int choice = getIntInput(scanner);

            switch (choice) {
                case 1: // Tambah pasien baru
                    if (queue.isFull()) {
                        System.out.println("Maaf, antrian penuh. Tidak dapat menambahkan pasien lagi.");
                    } else {
                        System.out.println("\n----- Menambahkan Pasien Baru -----");
                        String id = "P" + String.format("%03d", patientCounter++); // Membuat ID pasien unik

                        System.out.print("Masukkan nama pasien: ");
                        String name = scanner.nextLine();

                        System.out.print("Masukkan usia pasien: ");
                        int age = getIntInput(scanner);

                        System.out.print("Masukkan keluhan utama: ");
                        String complaint = scanner.nextLine();

                        Patient newPatient = new Patient(id, name, age, complaint);
                        queue.enqueue(newPatient); // Menambahkan pasien ke antrian
                    }
                    break;

                case 2: // Proses pasien berikutnya
                    Patient nextPatient = queue.dequeue(); // Mengambil pasien berikutnya dari antrian
                    if (nextPatient != null) {
                        System.out.println("\n----- Memproses Pasien -----");
                        System.out.println("Sekarang melayani: " + nextPatient.getName() + " (ID: " + nextPatient.getId() + ")");
                        System.out.println("Usia: " + nextPatient.getAge());
                        System.out.println("Keluhan: " + nextPatient.getComplaint());
                    }
                    break;

                case 3: // Lihat pasien berikutnya
                    Patient peekPatient = queue.peek(); // Melihat pasien berikutnya tanpa menghapus dari antrian
                    if (peekPatient != null) {
                        System.out.println("\n----- Pasien Berikutnya dalam Antrian -----");
                        System.out.println("Pasien berikutnya: " + peekPatient.getName() + " (ID: " + peekPatient.getId() + ")");
                    }
                    break;

                case 4: // Tampilkan semua pasien
                    queue.displayQueue(); // Menampilkan semua pasien dalam antrian
                    break;

                case 5: // Tampilkan statistik antrian
                    System.out.println("\n----- Statistik Antrian -----");
                    System.out.println("Total pasien dalam antrian: " + queue.size());
                    System.out.println("Kapasitas antrian: 10");
                    System.out.println("Slot tersedia: " + (10 - queue.size()));
                    break;

                case 6: // Keluar
                    System.out.println("\nTerima kasih telah menggunakan Sistem Antrian Rumah Sakit. Sampai jumpa!");
                    running = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }

            if (running) {
                System.out.println("\nTekan Enter untuk melanjutkan...");
                scanner.nextLine(); // Menunggu input Enter untuk melanjutkan
            }
        }

        scanner.close(); // Menutup scanner untuk menghindari kebocoran sumber daya
    }

    // Metode pembantu untuk menampilkan menu
    private static void displayMenu() {
        System.out.println("\n===== Menu Sistem Antrian Rumah Sakit =====");
        System.out.println("1. Tambah pasien baru");
        System.out.println("2. Proses pasien berikutnya");
        System.out.println("3. Lihat pasien berikutnya");
        System.out.println("4. Tampilkan semua pasien");
        System.out.println("5. Tampilkan statistik antrian");
        System.out.println("6. Keluar");
    }

    // Metode pembantu untuk mendapatkan input integer dengan aman
    private static int getIntInput(Scanner scanner) {
        int input = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                input = Integer.parseInt(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.print("Input tidak valid. Silakan masukkan angka: ");
            }
        }

        return input;
    }
}

// Class Patient untuk merepresentasikan pasien
class Patient {
    private String id;
    private String name;
    private int age;
    private String complaint;

    public Patient(String id, String name, int age, String complaint) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.complaint = complaint;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getComplaint() {
        return complaint;
    }
}

// Class PatientQueue untuk mengimplementasikan antrian pasien
class PatientQueue {
    private Patient[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public PatientQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new Patient[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(Patient patient) {
        if (isFull()) {
            System.out.println("Antrian penuh.");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = patient;
        size++;
    }

    public Patient dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }
        Patient patient = queue[front];
        front = (front + 1) % capacity;
        size--;
        return patient;
    }

    public Patient peek() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }
        return queue[front];
    }

    public int size() {
        return size;
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("\n----- Daftar Pasien dalam Antrian -----");
        int current = front;
        for (int i = 0; i < size; i++) {
            System.out.println(queue[current].getName() + " (ID: " + queue[current].getId() + ")");
            current = (current + 1) % capacity;
        }
    }
}