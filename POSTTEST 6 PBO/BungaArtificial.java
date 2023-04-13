/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest5;
import java.util.Scanner;

public  class BungaArtificial extends Bunga {
    private int kode_bunga;
    public final String ketahanan = "Bunga Tidak Memiliki Batasan Ketahanan";
    private boolean isPesan = false;
    
    public BungaArtificial (String nama, int jumlah, int harga, int kode){
        super (nama, jumlah, harga);
        this.kode_bunga = kode;
    }
    
    public int getKode(){return kode_bunga;}
    public void setKode(int Kode){this.kode_bunga = Kode;}
    
    //method overload
     public static void tambahjenis(String nama){
        System.out.println("Nama bunga : " + nama);     
    }
     
    @Override
     public void tambahbunga(){
        System.out.println("-------------------------------------------");
        System.out.println("           Data Bunga Artificial           ");
        System.out.println("-------------------------------------------");
        tambahjenis(this.nama_bunga);
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
     

