/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest3;

public class BungaArtificial extends Bunga{
    private int kode_bunga;
    
    public BungaArtificial (String nama, int jumlah, int harga, int kode){
        super (nama, jumlah, harga);
        this.kode_bunga = kode;
    }
    
    public int getKode(){return kode_bunga;}
    public void setKode(int Kode){this.kode_bunga = Kode;}
}
