/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest4;

public class BungaArtificial extends Bunga {
    private int kode_bunga;
    
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
}
