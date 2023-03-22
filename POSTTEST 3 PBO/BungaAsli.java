/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest3;

public class BungaAsli extends Bunga {
    private int kode_bunga;
    private String ketahanan_bunga;
    
    public BungaAsli (String nama, int jumlah, int harga, int kode, String ketahanan){
        super (nama, jumlah, harga);
        this.kode_bunga = kode;
        this.ketahanan_bunga = ketahanan;   
    }
    public int getKode(){return kode_bunga;}
    public String getKetahanan(){return ketahanan_bunga;}
   
    public void setKode(int Kode){this.kode_bunga = Kode;}
    public void setKetahanan(String Ketahanan){this.ketahanan_bunga = Ketahanan;}
    
    
    
    
}
