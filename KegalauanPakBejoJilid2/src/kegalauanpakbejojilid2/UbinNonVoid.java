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
public class UbinNonVoid {
    /*membuat atribu
    r*/
    int panjang;
    int lebar;
    int luas;
    int ubin;
    int isibox;
    int harga;
    
    /*membuat methode*/
   
    int hitungUbin(){
        int ubin;
        ubin = this.luas / (this.panjang * this.lebar);
        return ubin; 
    }
    int hitungBox(){
        int box;
        box = (this.luas / (this.panjang * this.lebar)) / this.isibox;
        return box; 
    }
     int hitungHarga(){
        int harga;
        harga = ((this.luas / (this.panjang * this.lebar)) / this.isibox) * this.harga;
        return harga;
     }
    
}
