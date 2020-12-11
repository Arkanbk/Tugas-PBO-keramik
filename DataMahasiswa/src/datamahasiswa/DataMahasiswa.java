/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamahasiswa;

/**
 *
 * @author Arkan
 */
import java.util.Scanner;
public class DataMahasiswa {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean menu = true;
        int pilihMenu;
        Data mhs = new Data();
        
        
        while(menu){
            System.out.println("");
            System.out.println("======************========");
            System.out.println("Data Mahasiswa ");
            System.out.println("======############========");
            System.out.println("Pilihan Menu:");
            System.out.println("1. Tambah Data");
            System.out.println("2. Hapus Data");
            System.out.println("3. Cari Data");
            System.out.println("4. Tampilkan Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu: ");
            pilihMenu = input.nextInt();
            switch(pilihMenu){
                case 1:
                    char ulang = 'y';
                    while(ulang == 'y'){
                        mhs.tambah();
                        System.out.print("  Ingin menambah lagi? (y/n): ");
                        ulang = input.next().charAt(0);
                    }
                    break;
                case 2:
                    mhs.hapus();
                    break;
                case 3:
                    mhs.cari();
                    break;
                case 4:
                    mhs.tampilkan();
                    break;
                case 5:
                    menu = false;
                    break;
                default:
                    System.out.println("======************========");
                    System.out.println("MENU YANG ANDA TUJU TIDAK TERSEDIA.");
                    System.out.println("======############========");
            }
                    
        }
    }
    
}
