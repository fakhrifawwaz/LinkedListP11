package tugasLinkedList;

public class Mahasiswa15 {
    
    String nim;
    String nama;
    String keperluan;

    public Mahasiswa15() {
    }

    public Mahasiswa15(String nim, String nama, String keperluan) {
        this.nim = nim;
        this.nama = nama;
        this.keperluan = keperluan;
    }

    public void tampilInformasi() {
        System.out.println("NIM       : " + nim);
        System.out.println("Nama      : " + nama);
        System.out.println("Keperluan : " + keperluan);
    }
}
