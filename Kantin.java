package prog_1;

import java.util.Arrays;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;

class Kantin {
 
    
    
    public static void main(String[] args) {
        int kantin=0, menu=0, total=0, harga[]={};
        String pilihanmenu[]={}, pesanan[]={};
        while(true){
            int n = YES_OPTION;
            while(n==YES_OPTION){
                kantin = Integer.parseInt(JOptionPane.showInputDialog("Pilih Kantin \n1.pak yoyok \n2.bu ani \n3.pak hadi"));
                switch(kantin){
                    case 1:
                        menu= Integer.parseInt(JOptionPane.showInputDialog("Selamat datang dikantin pak yoyok \nMenu: \n1.Kentucky(7k) \n2.Mie Intan(5k) \n3.Es Cendol(3k)"));
                        pilihanmenu= new String[] {"Kentucky", "Mie Instan", "Es Cendol"};
                        harga = new int[] {7000, 5000, 3000};
                        break;
                    case 2:
                        menu= Integer.parseInt(JOptionPane.showInputDialog("Selamat datang dikantin bu ani \nMenu: \n1.ayam geprek(10k) \n2.Mie pangsit(7k) \n3.Es teh anget(4k)"));
                        pilihanmenu= new String[] {"ayam geprek", "Mie pangsit", "Es teh anget"};
                        harga = new int[] {10000, 7000, 4000};
                        break;
                    case 3:
                        menu= Integer.parseInt(JOptionPane.showInputDialog("Selamat datang dikantin pak hadi \nMenu: \n1.ayam jawa(12k) \n2.Mie ayam(6k) \n3.Es blewah(3k)"));
                        pilihanmenu= new String[] {"ayam jawa", "Mie ayam", "Es blewah"};
                        harga = new int[] {12000, 6000, 3000};
                        break;
                }
                 pesanan = Arrays.copyOf(pesanan, pesanan.length + 1);
            pesanan[pesanan.length - 1] = pilihanmenu[menu - 1];
            total = total + harga[menu - 1];
            n = JOptionPane.showConfirmDialog(null, "Pesanan kamu " + pilihanmenu[menu - 1] + "\nHarga " + harga[menu - 1]
                    + "\n\n Apakah kamu ingin memesan lagi?", "Please Select", JOptionPane.YES_NO_CANCEL_OPTION);
            if(n==NO_OPTION){
                    int bayar  = Integer.parseInt(JOptionPane.showInputDialog("Total " +total +"\nMasukkan Jumlah Uang mu "));
                    String p="";
                    for (int i = 0; i < pesanan.length; i++) {
                        p = p + "\n" + pesanan[i];
                    }
                    JOptionPane.showMessageDialog(null, "Pesanan Kamu "+p+"\nTotal Kamu Rp."+total+"\ntotal yang kamu bayar Rp."+bayar+"\nKembalian kamu Rp."+(bayar-total));
                    System.exit(0);
                }
            }
            
                if(n==CANCEL_OPTION){
                    System.exit(0);
                }
        }
    }
}
