import javax.swing.*;
import java.util.Arrays;
import static javax.swing.JOptionPane.*;


public class Kantin {
    static int kantin;
    static int menu;
    static int[] harga = new int[1];
    static int total = 0;

    static String[] pilihanMenu = new String[1];
    static String pesanan[] = new String[1];



    public static void main(String[] args) {
        while(true){
            int n;
            kantin = Integer.parseInt(JOptionPane.showInputDialog("Pilih Kantin \n1.pak yoyok \n2.bu ani \n3.pak hadi"));
            switch (kantin) {
                case 1 -> {
                    menu = Integer.parseInt(JOptionPane.showInputDialog("Selamat datang dikantin pak yoyok \nMenu: \n1.Kentucky(7k) \n2.Mie Intan(5k) \n3.Es Cendol(3k)"));
                    pilihanMenu = new String[]{"Kentucky", "Mie Instan", "Es Cendol"};
                    harga = new int[]{7000, 5000, 3000};
                }
                case 2 -> {
                    menu = Integer.parseInt(JOptionPane.showInputDialog("Selamat datang dikantin bu ani \nMenu: \n1.ayam geprek(10k) \n2.Mie pangsit(7k) \n3.Es teh anget(4k)"));
                    pilihanMenu = new String[]{"ayam geprek", "Mie pangsit", "Es teh anget"};
                    harga = new int[]{10000, 7000, 4000};
                }
                case 3 -> {
                    menu = Integer.parseInt(JOptionPane.showInputDialog("Selamat datang dikantin pak hadi \nMenu: \n1.ayam jawa(12k) \n2.Mie ayam(6k) \n3.Es blewah(3k)"));
                    pilihanMenu = new String[]{"ayam jawa", "Mie ayam", "Es blewah"};
                    harga = new int[]{12000, 6000, 3000};
                }
            }

            addElement(pesanan, pilihanMenu[menu - 1]);
            total = total + harga[menu - 1];

            n = JOptionPane.showConfirmDialog(null, "Pesanan kamu " + pilihanMenu[menu - 1] + "\nHarga " + harga[menu - 1]
                    + "\n\n Apakah kamu ingin memesan lagi?", "Please Select", JOptionPane.YES_NO_CANCEL_OPTION);

            if(n==NO_OPTION){
                int yangHarusDiBayar  = Integer.parseInt(JOptionPane.showInputDialog("Total " +total +"\nMasukkan Jumlah Uang mu "));
                StringBuilder p = new StringBuilder();
                for (String s : pesanan) {
                    p.append(s).append("\n");
                }
                JOptionPane.showMessageDialog(null, "Pesanan Kamu "+p+"\nTotal Kamu Rp."+total+"\ntotal yang kamu bayar Rp."+yangHarusDiBayar+"\nKembalian kamu Rp."+(yangHarusDiBayar-total));
                System.exit(0);
            }


            if(n==CANCEL_OPTION){
                System.exit(0);
            }
        }
    }

    static void addElement(String[] arr, String element){
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = element;
    }
}
