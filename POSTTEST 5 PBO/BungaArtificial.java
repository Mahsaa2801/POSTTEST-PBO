/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest5;

public abstract class BungaArtificial extends Bunga {
    private int kode_bunga;
    public final String ketahanan = "Bunga Tidak Memiliki Batasan Ketahanan";
    
    public BungaArtificial (String nama, int jumlah, int harga, int kode){
        super (nama, jumlah, harga);
        this.kode_bunga = kode;
    }
    
    public int getKode(){return kode_bunga;}
    public void setKode(int Kode){this.kode_bunga = Kode;}
    
    //method overload
     public void tambahjenis(String nama){
        System.out.println("Nama bunga : " + this.nama_bunga);     
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
}
