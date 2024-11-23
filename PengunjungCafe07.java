public class PengunjungCafe07 {
    public static void daftarPengunjung(String... namaPengunjung){
        System.out.println("Daftar Nama Pengunjung:");
        for(String temp : namaPengunjung){
            System.out.println("- " + temp);
        }
    }
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
    }
}
