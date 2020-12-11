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
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.SimpleDateFormat;
public class Data {
    ArrayList<String> Nim = new ArrayList<>();
    ArrayList<String> Nama = new ArrayList<>();
    ArrayList<Date> TglLahir = new ArrayList<>();
    ArrayList<Integer> Jk = new ArrayList<>();
    Scanner inputData = new Scanner(System.in);
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    
    void tambah(){
        String nim,nama;
        Integer gender;
        int tahun,hari,bulan;
        
        System.out.println("Masukkan Banyaknya Data:");
        inputData.nextLine();
        System.out.print("  NIM: ");
        nim = inputData.nextLine();
        System.out.print("  Nama: ");
        nama = inputData.nextLine();
        System.out.println("  Tanggal Lahir (dd/mm/yyyy): ");
        System.out.print("Tanggal : ");
        hari = inputData.nextInt();
        System.out.print("Bulan : ");
        bulan = inputData.nextInt();
        System.out.print("Tahun : ");
        tahun = inputData.nextInt();
        Date tanggal = new GregorianCalendar(tahun, bulan - 1, hari).getTime();
        System.out.print("  Jenis Kelamin (0:Perempuan 1:Laki-laki): ");
        gender = inputData.nextInt();
        Nim.add(nim);
        Nama.add(nama);
        TglLahir.add(tanggal);
        Jk.add(gender);   
    }
    
    void hapus(){
        if(Nim.size() > 0){
            System.out.print("Masukkan NIM: ");
            String terhapus = inputData.nextLine();
            inputData.nextLine();
            int index = Nim.indexOf(terhapus);
            if(index < 0){
                System.out.println("");
                System.out.println("======************========");
                System.out.println("TIDAK ADA DATA YANG SESUAI.");
                System.out.println("======############========");
                System.out.println("");
            }else{
                Nim.remove(index);
                Nama.remove(index);
                TglLahir.remove(index);
                Jk.remove(index);
                System.out.println("");
                System.out.println("======************========");
                System.out.println("DATA SUKSES DIHAPUS.");
                System.out.println("======############========");
                System.out.println("");
            }
        }else{
            System.out.println("");
            System.out.println("======************========");
            System.out.println("TIDAK ADA DATA.");
            System.out.println("======############========");
            System.out.println("");
        }  
    }
    
    void cari(){
        System.out.println("+ Pencarian Berdasarkan : ");
        System.out.println("    1. NIM");
        System.out.println("    2. Jenis Kelamin");
        System.out.print("  Masukkan Pilihan: ");
        int pilihan = inputData.nextInt();
        switch(pilihan){
            case 1:
                inputData.nextLine();
                System.out.print("  Masukkan NIM : ");
                String dicari = inputData.nextLine();
                for(String n: Nim){
                    if(Nim.contains(dicari)){
                        int index = Nim.indexOf(dicari);
                        String tanggalah = formatter.format(TglLahir.get(index));
                        String jenisKel = (Jk.get(index) == 0) ? "Perempuan" : "Laki-laki";
                        System.out.println("");
                        System.out.println("======************========");
                        System.out.println("Mahasiswa NIM " + Nim.get(index));
                        System.out.println("======+-+-+-+-+-+-========");
                        System.out.println("NIM : " + Nim.get(index));
                        System.out.println("Nama : " + Nama.get(index));
                        System.out.println("Tanggal Lahir : " + tanggalah);
                        System.out.println("Jenis Kelamin : " + jenisKel);
                        System.out.println("======############========");
                        System.out.println("");
                        break;
                    }
                }
                break;
            case 2:
                inputData.nextLine();
                System.out.print("  Masukkan Jenis Kelamin(0:Perempuan 1:Laki-laki):");
                int dicari2 = inputData.nextInt();
                for(int n = 0; n < Jk.size(); n++){
                    if(Jk.get(n) == dicari2){
                        String tanggalah = formatter.format(TglLahir.get(n));
                        String jenisKel = (Jk.get(n) == 0) ? "Perempuan" : "Laki-laki";
                        System.out.println("");
                        System.out.println("======************========");
                        System.out.println("Data Berdasarkan Jenis Kelamin");
                        System.out.println("======+-+-+-+-+-+-========");
                        System.out.println("NIM : " + this.Nim.get(n));
                        System.out.println("Nama : " + this.Nama.get(n));
                        System.out.println("Tanggal Lahir : " + tanggalah);
                        System.out.println("Jenis Kelamin : " + jenisKel);
                        System.out.println("======############========");
                        System.out.println("");
                    }
                };
                break;
            default:
                System.out.println("");
                System.out.println("======************========");
                System.out.println("Menu Yang Anda Pilih Tidak Ada.");
                System.out.println("======############========");
                System.out.println("");
        }
        
    }
    
    void tampilkan(){
        if(Nim.size() == 0){
            System.out.println("");
            System.out.println("======************========");
            System.out.println("TIDAK ADA DATA.");
            System.out.println("======############========");
            System.out.println("");
        }else{
            for(int n = 0; n < Nim.size(); n++){
                String tanggalah = formatter.format(TglLahir.get(n));
                String jenisKel = (Jk.get(n) == 0) ? "Perempuan" : "Laki-laki";
                System.out.println("");
                System.out.println("======************========");
                System.out.println("    Mahasiswa ke " + (n+1));
                System.out.println("======+-+-+-+-+-+-========");
                System.out.println("NIM : " + Nim.get(n));
                System.out.println("Nama : " + Nama.get(n));
                System.out.println("Tanggal : " + tanggalah);
                System.out.println("Jenis Kelamin : " + jenisKel);
                System.out.println("======############========");
            }
            System.out.println("Jumlah Mahasiswa : " + Nim.size() +"\n\n");
        }
        
    }
}
