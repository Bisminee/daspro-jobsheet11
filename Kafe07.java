 import java.util.Scanner;
 public class Kafe07 {
    public static void Menu(String namaPelanggan, String kodePromo, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if(isMember){
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

            if (kodePromo.equals("DISKON50")) {
                System.out.println("Diskon yang diterima sebesar 50%");
            }else if (kodePromo.equals("DISKON30")){
                    System.out.println("Diskon yang diterima sebesar 30%");
            }else{
                System.out.println("Kode Invalid");
            }
    
    }
    
    public static int hitungTotalHarga07(int pilihanMenu, int banyakItem){
        int hargaItems[] = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }
    public static void main (String[] args){
        Menu("Andi","DISKON50" ,true);

        Scanner sc = new Scanner(System.in);
        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin Anda pesan: ");
        int banyakItem = sc.nextInt();

        int totalHarga = hitungTotalHarga07(pilihanMenu, banyakItem);

        System.out.println("Total harga untuk pesanan Anda: Rp" + totalHarga);
    }
 }