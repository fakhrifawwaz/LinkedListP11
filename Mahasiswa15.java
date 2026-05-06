public class Mahasiswa15 {

    String nama;
    String nim;
    String kelas;
    double ipk;

    public Mahasiswa15() {
    }

    public Mahasiswa15(String nm, String name, String kls, double ip) {
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.ipk = ip;
    }

    public void tampilInformasi() {
    System.out.printf("%-10s %-12s %-5s %.1f%n", nama, nim, kelas, ipk);
    }
}
