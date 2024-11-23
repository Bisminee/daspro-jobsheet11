import java.util.Scanner;

public class Kafe07 {
    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    }

    public static double hitungTotalHarga07(int pilihanMenu, int banyakItem) {
        int hargaItems[] = {15000, 20000, 22000, 12000, 10000, 18000};
        return hargaItems[pilihanMenu - 1] * banyakItem;
    }

    public static double hitungDiskon07(String kodePromo, double totalHarga07) {
        double diskon, hargaTotal = totalHarga07;

        if (kodePromo.equals("DISKON50")) {
            diskon = 0.5;
            System.out.println("\nDiskon yang diterima sebesar 50%");
        } else if (kodePromo.equals("DISKON30")) {
            diskon = 0.3;
            System.out.println("\nDiskon yang diterima sebesar 30%");
        } else {
            System.out.println("\nKode Promo Invalid");
            diskon = 0;
        }
        return hargaTotal - (hargaTotal * diskon);
    }

    public static void tampilanPesanan(int[] pilihanMenu, int[] banyakItem, int jumlahPesanan) {
        String namaMenu;
        System.out.println("\nBerikut pesanan Anda: ");
        for (int i = 0; i < jumlahPesanan; i++) {
            switch (pilihanMenu[i]) {
                case 1:
                    namaMenu = "Kopi Hitam";
                    System.out.println(namaMenu + " - " + banyakItem[i] + " item");
                    break;
                case 2:
                    namaMenu = "Cappuccino";
                    System.out.println(namaMenu + " - " + banyakItem[i] + " item");
                    break;
                case 3:
                    namaMenu = "Latte";
                    System.out.println(namaMenu + " - " + banyakItem[i] + " item");
                    break;
                case 4:
                    namaMenu = "Teh Tarik";
                    System.out.println(namaMenu + " - " + banyakItem[i] + " item");
                    break;
                case 5:
                    namaMenu = "Roti Bakar";
                    System.out.println(namaMenu + " - " + banyakItem[i] + " item");
                    break;
                case 6:
                    namaMenu = "Mie Goreng";
                    System.out.println(namaMenu + " - " + banyakItem[i] + " item");
                    break;
                default:
                    System.out.println("Pesanan ke-" + (i+1) + " tidak tersedia pada menu");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean pilihan = true;
        int pilihanMenu[] = new int[1];
        int banyakItem[] = new int[1];
        int jumlahPesanan = 0;
        double bayarKotor = 0;

        System.out.print("Masukkan nama Anda: ");
        String namaPelanggan = sc.nextLine();

        Menu(namaPelanggan, false);

        do {
            if (jumlahPesanan >= pilihanMenu.length) {
                int tempPilihanMenu[] = new int[pilihanMenu.length + 1];
                int tempBanyakItem[] = new int[banyakItem.length + 1];
                System.arraycopy(pilihanMenu, 0, tempPilihanMenu, 0, pilihanMenu.length);
                System.arraycopy(banyakItem, 0, tempBanyakItem, 0, banyakItem.length);
                pilihanMenu = tempPilihanMenu;
                banyakItem = tempBanyakItem;
            }

            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            pilihanMenu[jumlahPesanan] = sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin Anda pesan: ");
            banyakItem[jumlahPesanan] = sc.nextInt();
            sc.nextLine();

            bayarKotor += hitungTotalHarga07(pilihanMenu[jumlahPesanan], banyakItem[jumlahPesanan]);
            jumlahPesanan++;

            System.out.print("Apakah Anda ingin menambah pesanan (y/n)? ");
            String tambah = sc.nextLine();

            if (!tambah.equalsIgnoreCase("y")) {
                pilihan = false;
            }
        } while (pilihan);

        System.out.print("Tolong masukkan kode promo (huruf kapital): ");
        String kodePromo = sc.nextLine();

        tampilanPesanan(pilihanMenu, banyakItem, jumlahPesanan);
        double totalHarga = hitungDiskon07(kodePromo, bayarKotor);

        System.out.println("Total harga untuk pesanan Anda: Rp" + totalHarga);
    }
}
