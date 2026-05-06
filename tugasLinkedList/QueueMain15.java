package tugasLinkedList;

import java.util.Scanner;

public class QueueMain15 {

    static Scanner sc     = new Scanner(System.in);
    static Queue15 antrian = new Queue15();

    static Mahasiswa15 inputMahasiswa() {
        System.out.print("  Masukkan NIM       : ");
        String nim = sc.nextLine();
        System.out.print("  Masukkan Nama      : ");
        String nama = sc.nextLine();
        System.out.print("  Masukkan Keperluan : ");
        String keperluan = sc.nextLine();
        return new Mahasiswa15(nim, nama, keperluan);
    }

    static void tampilMenu() {
        System.out.println();
        System.out.println("============================================");
        System.out.println("     SISTEM ANTRIAN UNIT KEMAHASISWAAN      ");
        System.out.println("============================================");
        System.out.println("  1. Daftar Antrian");
        System.out.println("  2. Panggil Antrian");
        System.out.println("  3. Tampilkan Semua Antrian");
        System.out.println("  4. Lihat Antrian Terdepan");
        System.out.println("  5. Lihat Antrian Paling Akhir");
        System.out.println("  6. Jumlah Mahasiswa Mengantri");
        System.out.println("  7. Cek Antrian Kosong");
        System.out.println("  8. Cek Antrian Penuh");
        System.out.println("  9. Kosongkan Antrian");
        System.out.println("  0. Keluar");
        System.out.println("============================================");
        System.out.print("  Pilihan : ");
    }

    public static void main(String[] args) {
        int pilihan;

        do {
            tampilMenu();
            pilihan = Integer.parseInt(sc.nextLine().trim());

            switch (pilihan) {
                case 1:
                    System.out.println("\n-- Pendaftaran Antrian --");
                    Mahasiswa15 mhs = inputMahasiswa();
                    antrian.enqueue(mhs);
                    break;

                case 2:
                    antrian.dequeue();
                    break;

                case 3:
                    antrian.tampilSemua();
                    break;

                case 4:
                    antrian.peekFront();
                    break;

                case 5:
                    antrian.peekRear();
                    break;

                case 6:
                    antrian.tampilJumlah();
                    break;

                case 7:
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian KOSONG.");
                    } else {
                        System.out.println("Antrian TIDAK kosong.");
                    }
                    break;

                case 8:
                    if (antrian.isFull()) {
                        System.out.println("Antrian PENUH.");
                    } else {
                        System.out.println("Antrian BELUM penuh.");
                    }
                    break;

                case 9:
                    antrian.clear();
                    break;

                case 0:
                    System.out.println("Terima kasih. Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 0);

        sc.close();
    }
}