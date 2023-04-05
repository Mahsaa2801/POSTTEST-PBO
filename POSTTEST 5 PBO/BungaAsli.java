/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest5;

public abstract class BungaAsli extends Bunga {
    private int kode_bunga;
    private String ketahanan_bunga;
    public final String ketahanan = "Bunga Memiliki Batas Ketahanan";
    
    
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
    
}
