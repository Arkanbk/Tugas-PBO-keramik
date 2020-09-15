/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspbo1;

/**
 *
 * @author User
 */
public class Ubin {
    /*membuat atribu
    r*/
    int p;
    int l;
    int luas;
    int ubin;
    int isibox;
    int harga;
    
    /*membuat methode*/
   
    void hitungUbin(){
        int ubin;
        ubin = this.luas / (this.p * this.l);
        System.out.println("Ubin: " + ubin + "  buah"); 
    }
    void hitungBox(){
        int box;
        box = (this.luas / (this.p * this.l)) / this.isibox;
        System.out.println("Total box: " + box + "  Box"); 
    }
     void hitungHarga(){
        int harga;
        harga = ((this.luas / (this.p * this.l)) / this.isibox) * this.harga;
        System.out.println("Total harga: " + harga + "  rupiah"); 
    }
}
