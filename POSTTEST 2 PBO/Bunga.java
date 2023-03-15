/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest2;

public class Bunga {
    private String nama_bunga;
    private int kode_bunga, jumlah_bunga, harga_bunga;
  
    
    public Bunga(String nama, int kode, int jumlah, int harga){
        this.kode_bunga = kode;
        this.nama_bunga = nama;
        this.jumlah_bunga = jumlah;
        this.harga_bunga = harga;  
}
    public int getKode(){return kode_bunga;}
    public String getNama(){return this.nama_bunga;}
    public int getJumlah(){return this.jumlah_bunga;}
    public int getHarga(){return this.harga_bunga;}
    
    public void setKode(int Kode){this.kode_bunga = Kode;}
    public void setNama(String Nama){this.nama_bunga = Nama;}
    public void setJumlah(int Jumlah){this.jumlah_bunga = Jumlah;}
    public void setHarga(int Harga){this.harga_bunga = Harga;}
    
    public void tambah_data(){
        System.out.println("-------DATA BUNGA TOKO SUNFLORIST -------");
        System.out.println("Kode Bunga   :" + this.kode_bunga);
        System.out.println("Nama Bunga   :" + this.nama_bunga);
        System.out.println("Jumlah Bunga :" + this.jumlah_bunga);
        System.out.println("Harga Bunga  :" + this.harga_bunga);
        System.out.println("-----------------------------------------");
        System.out.println("----------DATA BERHASIL DITAMBAH---------");
    }
    
    public void ubah_data(){
       System.out.println("-------DATA BUNGA TOKO SUNFLORIST -------");
       System.out.println("Kode Bunga   :" + this.kode_bunga);
       System.out.println("Nama Bunga   :" + this.nama_bunga);
       System.out.println("Jumlah Bunga :" + this.jumlah_bunga);
       System.out.println("Harga Bunga  :" + this.harga_bunga);
       System.out.println("-----------------------------------------");
       System.out.println("-----------DATA BERHASIL DIUBAH----------");
    }
    
    
}
