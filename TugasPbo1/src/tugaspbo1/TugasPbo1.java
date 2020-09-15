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
public class TugasPbo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*instansiasi objek*/
        Ubin u1 = new Ubin();
       u1.luas = 1000000;
       u1.isibox = 10;
       u1.harga = 54000;
       u1.p = 30;
       u1.l = 30;
       u1.hitungUbin();
       u1.hitungBox();
       u1.hitungHarga();
       
       Ubin u2 = new Ubin();
       u2.luas = 1000000;
       u2.isibox = 5;
       u2.harga = 65000;
       u2.p = 40;
       u2.l = 40;
       u2.hitungUbin();
       u2.hitungBox();
       u2.hitungHarga();
       
       Ubin u3 = new Ubin();
       u3.luas = 1000000;
       u3.isibox = 8;
       u3.harga = 60000;
       u3.p = 30;
       u3.l = 40;
       u3.hitungUbin();
       u3.hitungBox();
       u3.hitungHarga();
    }
}
