/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest5;

import java.util.Scanner;

public class BungaAsli extends Bunga {
    private int kode_bunga;
    private String ketahanan_bunga;
    public final String ketahanan = "Bunga Memiliki Batas Ketahanan";
    private boolean isPesan = false;
    
    
    public BungaAsli (String nama, int jumlah, int harga, int kode, String ketahanan){
        super(nama, jumlah, harga);
        this.kode_bunga = kode;
        this.ketahanan_bunga = ketahanan;   
    }
    public int getKode(){return kode_bunga;}
    public String getKetahanan(){return ketahanan_bunga;}
   
    public void setKode(int Kode){this.kode_bunga = Kode;}
    public void setKetahanan(String Ketahanan){this.ketahanan_bunga = Ketahanan;}
    
    //method overloading
    public void tambahjenis(String nama){
        System.out.println("Nama bunga : " + this.nama_bunga);     
    }
    public void tambahjenis(int kode_bunga, String ketahanan_bunga){
        System.out.println("Kode bunga : " + this.kode_bunga);
        System.out.println("Ketahanan bunga : " + this.ketahanan_bunga);
    }
    
    //method override
    @Override
    public void tambahbunga(){
        System.out.println("-------------------------------------------");
        System.out.println("              Data Bunga Asli              ");
        System.out.println("-------------------------------------------");
        tambahjenis(this.nama_bunga);
        tambahjenis(this.kode_bunga, this.ketahanan_bunga);
        System.out.println("Jumlah bunga : " + this.jumlah_bunga);
        System.out.println("Harga bunga : " + this.harga_bunga);
        System.out.println("---------- DATA BERHASIL DI TAMBAHKAN-------");    
    }
    
    @Override
       public void tampilbunga(){
         System.out.println("Kode Bunga      : " + this.kode_bunga);
         System.out.println("Nama Bunga      : " + this.nama_bunga);
         System.out.println("Jumlah Bunga    : " + this.jumlah_bunga);
         System.out.println("Harga Bunga     : " + this.harga_bunga);
         System.out.println("Ketahanan Bunga : " + this.ketahanan);
     }
      
     public void pesan(String nama, int jumlah, int harga, String metodebayar, boolean isTunai){
        System.out.println("---------------------------------------------");
        System.out.println("--------------PEMESANAN BUNGA----------------");
        System.out.println("---------------------------------------------");
        System.out.println("Nama Bunga        : " + this.nama_bunga);
        System.out.println("Jumlah Buunga     : " + this.jumlah_bunga);
        System.out.println("Harga Bunga       : " + this.harga_bunga);
        System.out.println("Metode Pembayaran : " + metodebayar);
        System.out.println("----------------------------------------------");
        System.out.println("----------BERHASIL MELAKUKAN PEMESANAN--------");
        System.out.println("----------------------------------------------");      
     }
     
     public void menu(){
         Scanner sc = new Scanner (System.in);
         System.out.println("Apakah anda ingin melakukan pembelian? Ya/Tidak");
         String jawab = sc.next();
                 if (jawab.equalsIgnoreCase("Ya")){
                     if (isPesan){
                         System.out.println("Anda Telah Melakukan Pemesanan");  
                     }else{
                         System.out.println("Nama Bunga     :"+ this.nama_bunga);
                         System.out.println("Jumlah Bunga   :"+this.jumlah_bunga);
                         System.out.println("Harga Bunga    :"+this.harga_bunga);
                         System.out.println("Pilih Metode Bayar\n - Tunai = 1\n - Non Tunai = 2\n");
                         int metodebayar = sc.nextInt();
                         boolean isTunai;
                         isTunai = metodebayar == 1;
                         pesan(nama_bunga, jumlah_bunga, harga_bunga, isTunai ? "Tunai" : "Non Tunai", isTunai);
                         isPesan = true;
                     }
                     }else{
                            System.out.println("Tidak Ada Data Pemesanan");
                             }
                     
                 }
}
