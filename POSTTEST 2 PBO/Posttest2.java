/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Posttest2 {

    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(isr);
    static ArrayList<Bunga> databunga = new ArrayList<>();

 public static void main(String[] args) throws NumberFormatException, IOException {
        while (true){
            System.out.println("MENU PENDATAAN TOKO BUNGA SUNFLORIST");
            System.out.println("1. Tambah Data Bunga");
            System.out.println("2. Tampilkan Data Bunga");
            System.out.println("3. Ubah Data Bunga");
            System.out.println("4. Hapus Data Bunga");
            System.out.println("5. Keluar");
            System.out.println("------------------------------------");
            System.out.print("Pilih Menu: ");
            int pilih = Integer.parseInt(br.readLine());
            if (pilih == 1){
                tambah();
            }else if (pilih == 2){
                tampil();
            }else if (pilih == 3){
                ubah();
            }else if (pilih == 4){
                hapus();
            }else if (pilih == 5){
                System.out.println("KELUAR DARI PROGRAM");
                System.exit(0);
            }else {
                System.out.println("PILIHAN TIDAK TERSEDIA");
            }
        }   
    }
    
    public static void tambah() throws IOException {
        System.out.println("-------DATA BUNGA TOKO SUNFLORIST -------");
        System.out.println("Masukkan Kode Bunga: ");
        int addKodeBunga = Integer.parseInt(br.readLine());
        System.out.println("Masukkan Nama Bunga: ");
        String addNamaBunga = br.readLine();
        System.out.println("Masukkan Jumlah Bunga: ");
        int addJumlahBunga = Integer.parseInt(br.readLine());
        System.out.println("Masukkan Harga Bunga: ");
        int addHargaBunga = Integer.parseInt(br.readLine());
        Bunga dataBaru = new Bunga(addNamaBunga, addKodeBunga, addJumlahBunga, addHargaBunga);
        databunga.add(dataBaru);
        dataBaru.tambah_data();
    }
    
    public static void ubah()throws IOException {
        tampil();
        System.out.println("-------DATA BUNGA TOKO SUNFLORIST -------");
        System.out.println("Pilih Data Ke- ");
        int indeks = Integer.parseInt(br.readLine());
        System.out.println("Masukkan Kode Bunga Yang Baru : ");
        int addKodeBunga = Integer.parseInt(br.readLine());
        System.out.println("Masukkan Nama Bunga Yang Baru : ");
        String addNamaBunga = br.readLine();
        System.out.println("Masukkan Jumlah Bunga Yang Baru : ");
        int addJumlahBunga = Integer.parseInt(br.readLine());
        System.out.println("Masukkan Harga Bunga Yang Baru : ");
        int addHargaBunga = Integer.parseInt(br.readLine());
        
        
        databunga.get(indeks-1).setKode(addKodeBunga);
        databunga.get(indeks-1).setNama (addNamaBunga);
        databunga.get(indeks-1).setJumlah (addJumlahBunga);
        databunga.get(indeks-1).setHarga (addHargaBunga);
        databunga.get(indeks-1).ubah_data();
    }
    
    public static void tampil() throws IOException {
        System.out.println("-------DATA BUNGA TOKO SUNFLORIST -------");
        for (int i = 0; i<databunga.size(); i++){
            System.out.println("DATA KE- " + (i+1));
            System.out.println("Kode Bunga   :" + databunga.get(i).getKode());
            System.out.println("Nama Bunga   :" + databunga.get(i).getNama());
            System.out.println("Jumlah Bunga :" + databunga.get(i).getJumlah());
            System.out.println("Harga Bunga  :" + databunga.get(i).getHarga());
        }
        
    }
    
    public static void hapus() throws IOException {
        tampil();
        System.out.println("-------DATA BUNGA TOKO SUNFLORIST -------");
        System.out.println("Pilih Data Yang Dihapus: ");
        int indeks = Integer.parseInt(br.readLine());
        databunga.remove(indeks-1); 
        System.out.println("Data Berhasil Di Hapus");
    }
    
    
    
}
