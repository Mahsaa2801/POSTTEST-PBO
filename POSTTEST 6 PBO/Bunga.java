/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest5;

public class Bunga {
    protected String nama_bunga;
    protected int jumlah_bunga, harga_bunga;
    
    public Bunga(String nama, int jumlah, int harga){
        this.nama_bunga = nama;
        this.jumlah_bunga = jumlah;
        this.harga_bunga = harga;
    }
    public String getNama(){return nama_bunga;}
    public int getJumlah(){return jumlah_bunga;}
    public int getHarga(){return harga_bunga;}
    
    public void setNama(String Nama){this.nama_bunga = Nama;}
    public void setJumlah(int Jumlah){this.jumlah_bunga = Jumlah;}
    public void setHarga(int Harga){this.harga_bunga = Harga;}
    
    public void tambahbunga(){
        System.out.println("Nama Bunga : " + this.nama_bunga);
        System.out.println("Kode Bunga : " + this.jumlah_bunga);
    }
    public void tampilbunga(){
        
    }
    
}
