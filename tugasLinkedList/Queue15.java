package tugasLinkedList;

public class Queue15 {
    Node15 front;
    Node15 rear;

    int jumlah;
    int MAX = 10;

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return jumlah == MAX;
    }

    public void clear() {
        front = null;
        rear = null;
        jumlah = 0;
        System.out.println("Antrian berhasil dikosongkan");
    }

    public void enqueue(Mahasiswa15 mhs) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh");
            return;
        } 
        Node15 newNode = new Node15(mhs, null);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        jumlah++;
        System.out.println(mhs.nama + " berhasil mendaftar antrian. " + "Nomor antrian Anda: " + jumlah);   
    } 

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong! Tidak ada yang bisa dipanggil.");
            return;
        }
        System.out.println("\n>> Memanggil antrian: " );
        front.data.tampilInformasi();
        front = front.next;
        if (front == null) {
            rear = null;
        }
        jumlah--;
        System.out.println("Selesai dilayani. \n");
    }

    public void peekFront() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println(" Antrian pertama: " );
            front.data.tampilInformasi();
        }
    }

    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("\n>> Antrian terakhir: " );
            rear.data.tampilInformasi();
        }
    }

    public void tampilJumlah() {
        System.out.println("\nJumlah antrian saat ini: " + jumlah + " orang");
    }

    public void tampilSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("===========================");
        System.out.println(" Daftar Antrian Mahasiswa:");
        System.out.println("===========================");
        Node15 tmp = front;
        int no = 1;
        while (tmp != null) {
            System.out.println("  Antrian ke-" + no + ":");
            tmp.data.tampilInformasi();
            tmp = tmp.next;
            no++;
        }
    }
}