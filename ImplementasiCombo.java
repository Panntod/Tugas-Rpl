package ujicobakombo;

import java.util.ArrayList;
import java.util.Scanner;

public class ImplementasiCombo {
    
    public static void inputnilai(ArrayList kumpNilai) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nilai: ");
        int nilai = sc.nextInt();
        kumpNilai.add(nilai);
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList kumpNilai = new ArrayList();
        System.out.print("Silahkan Pilih Kelas X/XI ");
        String kelas = sc.next();
        if (kelas.equalsIgnoreCase("X")) {
            System.out.println("Masukkan Jumlah Murid ");
            int a = sc.nextInt();
            for (int i = 0; i < a; i++) {
                inputnilai(kumpNilai);
            }
        }else if (kelas.equalsIgnoreCase("XI")) {
             System.out.println("Masukkan Jumlah Murid ");
            int d = sc.nextInt();
            for (int i = 0; i < d; i++) {
                inputnilai(kumpNilai); 
            }
        }else{
            System.out.println("Kelas yang anda masukan Tidak Ada");
        }
        
        System.out.println(kumpNilai.toString());
        int nilaiTertinggi = 0;
        int nilaiTerendah = (int) kumpNilai.get(0);
        int ratarata = 0;
        for (int i = 0; i < kumpNilai.size(); i++) {
            ratarata += (int) kumpNilai.get(i);
            if ((int) kumpNilai.get(i) > nilaiTertinggi){
                nilaiTertinggi = (int) kumpNilai.get(i);
            }
            
            if ((int) kumpNilai.get(i) < nilaiTerendah){
                nilaiTerendah = (int) kumpNilai.get(i);
            }
        }
        ratarata /= kumpNilai.size();
        
        System.out.println("Niali tertinggi : " + nilaiTertinggi + "\nNilai terendah : " + nilaiTerendah + "\nRata rata : " + ratarata);
    }
    
}
