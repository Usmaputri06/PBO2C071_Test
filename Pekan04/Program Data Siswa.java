class Siswa {
    // Modifier (private)
    private String nama;
    private int umur;

    // Constructor
    public Siswa(String nama, int umur) {
        // Keyword this
        this.nama = nama;
        this.umur = umur;
    }

    // Method dengan modifier public
    public void tampilkanData() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Umur: " + this.umur);
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek
        Siswa s1 = new Siswa("Usma", 19);

        // Menampilkan data
        s1.tampilkanData();
    }
}
