import java.util.Scanner;
public class Percobaan607 {
    public static int hitungLuas(int panjang, int lebar){
        int luas = panjang * lebar;
        return luas;
    }

    public static int hitungVolume(int tinggi, int p, int l){
        int volume = hitungLuas(p, l) * tinggi;
        return volume;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p,l,t,L,vol;

        System.out.print("Masukkan panjang: ");
        p = input.nextInt();
        System.out.print("Masukkan lebar: ");
        l = input.nextInt();
        System.out.print("Masukkan tinggi: ");
        t = input.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas Persegi Panjang adalah " + L);

        vol = hitungVolume(t, p, l);
        System.out.println("Volume balok adalah " + vol);
    }
}