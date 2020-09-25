/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kegalauanpakbejojilid2;

/**
 *
 * @author User
 */
public class KegalauanPakBejoJilid2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("PENGGUNAAN NON VOID");
        System.out.println("Keramik A");
        UbinNonVoid unv1 = new UbinNonVoid();
        unv1.luas = 1000000;
        unv1.isibox = 10;
        unv1.harga = 54000;
        unv1.panjang = 30;
        unv1.lebar = 30;
        System.out.println("Keramik: " + unv1.hitungUbin() + "  buah");
        System.out.println("Total box: " + unv1.hitungBox() + "  Box");
        System.out.println("Total harga: " + unv1.hitungHarga() + "  rupiah");
        
        System.out.println("Keramik B");
        UbinNonVoid unv2 = new UbinNonVoid();
        unv2.luas = 1000000;
        unv2.isibox = 5;
        unv2.harga = 65000;
        unv2.panjang = 40;
        unv2.lebar = 40;
        System.out.println("Keramik: " + unv2.hitungUbin() + "  buah");
        System.out.println("Total box: " + unv2.hitungBox() + "  Box");
        System.out.println("Total harga: " + unv2.hitungHarga() + "  rupiah");
        
        System.out.println("Keramik C");
        UbinNonVoid unv3 = new UbinNonVoid();
        unv3.luas = 1000000;
        unv3.isibox = 8;
        unv3.harga = 60000;
        unv3.panjang = 30;
        unv3.lebar = 40;
        System.out.println("Keramik: " + unv3.hitungUbin() + "  buah");
        System.out.println("Total box: " + unv3.hitungBox() + "  Box");
        System.out.println("Total harga: " + unv3.hitungHarga() + "  rupiah\n");
        
        System.out.println("PENGGUNAAN CONSTRUCTOR");
        System.out.println("Keramik A");
        UbinConstructor uc1 = new UbinConstructor(30, 30, 1000000, 10, 54000);
        uc1.hitungUbin();
        uc1.hitungBox();
        uc1.hitungHarga();
       
        System.out.println("Keramik B");
        UbinConstructor uc2 = new UbinConstructor(40, 40, 1000000, 5, 65000);
        uc2.hitungUbin();
        uc2.hitungBox();
        uc2.hitungHarga();
        
        System.out.println("Keramik C");
        UbinConstructor uc3 = new UbinConstructor(30, 40, 1000000, 8, 60000);
        uc3.hitungUbin();
        uc3.hitungBox();
        uc3.hitungHarga();
        
    }
    
}
