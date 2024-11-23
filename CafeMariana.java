import java.util.Scanner;
public class CafeMariana {
    public static void inputPenjualan(int jumlahMenu[], int hari, String namaMenu[], int penjualan[][], double jualTinggi, String menuJualTinggi, double rataPenjualan[]){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < namaMenu.length; i++){
            for (int j = 0; j < hari; j++) {
                System.out.print("Masukkan penjualan " + namaMenu[i] + " hari ke-" + (j+1) + ": ");
                penjualan[i][j] = sc.nextInt();
                jumlahMenu[i] += penjualan[i][j];
            }
        if(jualTinggi > jumlahMenu[i]){
            jualTinggi = jumlahMenu[i];
            menuJualTinggi = namaMenu[i];
        }
        rataPenjualan[i] =(jumlahMenu[i])/7; 
        }
    }
    
    public static void tampilanPenjualan(int hari, String namaMenu[], int penjualan[][], double rataPenjualan[], String menuJualTinggi){
        for(int i = 0; i <= hari; i++){
            System.out.println("Penjualan hari ke-" + (i+1) + ": ");
            for (int j = 0; j < namaMenu.length; j++) {
                System.out.println("Penjualan menu " + namaMenu[j] + ": " + penjualan[j][i]);
            }
        }
        for(int i = 0; i < namaMenu.length; i++){
            System.out.println("Rata-rata penjualan menu " + namaMenu[i] + ": " + rataPenjualan[i]);
        }
        System.out.println("Menu dengan penjualan tertinggi: " + menuJualTinggi);
    }
    
    public static void main(String[] args) {
        int penjualan[][], hari = 7, jumlahMenu[];
        double rataPenjualan[], jualTinggi = 0;
        String menuJualTinggi = null;

        String namaMenu[] = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
        penjualan = new int[namaMenu.length][hari];
        jumlahMenu = new int [namaMenu.length];
        rataPenjualan = new double[namaMenu.length];

        inputPenjualan(jumlahMenu, hari, namaMenu, penjualan, jualTinggi, menuJualTinggi, rataPenjualan);
        tampilanPenjualan(hari, namaMenu, penjualan, rataPenjualan, menuJualTinggi);
    }
}