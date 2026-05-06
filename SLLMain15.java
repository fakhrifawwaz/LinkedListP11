public class SLLMain15 {

    public static void main(String[] args) {
        SingleLinkedList15 sll = new SingleLinkedList15();

        Mahasiswa15 mhs1 = new Mahasiswa15("21212200", "ALvaro", "1A", 4.0);
        Mahasiswa15 mhs2 = new Mahasiswa15("21212201", "Bimon", "2B", 3.4);
        Mahasiswa15 mhs3 = new Mahasiswa15("21212202", "Cintia", "3C", 3.5);
        Mahasiswa15 mhs4 = new Mahasiswa15("21212203", "Dirga", "4D", 3.6);

    // latihan 1
    sll.print();
 
    sll.addFirst(mhs1);
    sll.print();
 
    sll.addLast(mhs4);
    sll.print();
        
    sll.insertAfter("Dirga", mhs3);
    sll.insertAt(2, mhs2);
    sll.print();

    System.out.print("data index 1 : ");
    sll.getData(1);

    // latihan 2
    System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("Bimon"));
    System.out.println();

    sll.removeFirst();
    sll.removeLast();
    sll.print();

    sll.removeAt(0);
    sll.print();

    }
}