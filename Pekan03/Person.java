class Mahasiswa {
    String nama;
    int umur;

    // Constructor
    Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek dengan constructor
        Mahasiswa mhs1 = new Mahasiswa("Usma", 19);
        Mahasiswa mhs2 = new Mahasiswa("Athila", 16);

        // Menampilkan data
        mhs1.tampilkanData();
        System.out.println();
        mhs2.tampilkanData();
    }
}
