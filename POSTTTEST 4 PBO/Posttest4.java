/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest4;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Posttest4 {
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(isr);
    static ArrayList<BungaAsli> bungaAsli = new ArrayList<BungaAsli>();
    static ArrayList<BungaArtificial> bungaArtificial = new ArrayList<BungaArtificial>();

    public static void main(String[] args)throws NumberFormatException, IOException {
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
    public static void tambah()throws IOException{
        System.out.println("-------DATA BUNGA TOKO SUNFLORIST -------");
        System.out.println("Kategori Bunga Toko Sunflorist");
        System.out.println("1. Bunga Asli ");
        System.out.println("2. Bunga Artificial ");
        System.out.print("Pilih Kategori Bunga :  ");
        int kategori = Integer.parseInt(br.readLine());
        switch (kategori){
            case 1 :
                System.out.print("Masukkan Kode Bunga: ");
                int addKodeBunga = Integer.parseInt(br.readLine());
                System.out.print("Masukkan Nama Bunga: ");
                String addNamaBunga = br.readLine();
                System.out.print("Masukkan Jumlah Bunga: ");
                int addJumlahBunga = Integer.parseInt(br.readLine());
                System.out.print("Masukkan Harga Bunga: ");
                int addHargaBunga = Integer.parseInt(br.readLine());
                System.out.print("Masukkan Ketahanan Bunga: ");
                String addKetahananBunga = br.readLine();
                BungaAsli BungaAsliBaru = new BungaAsli (addNamaBunga, addJumlahBunga, addHargaBunga, addKodeBunga, addKetahananBunga);
                bungaAsli.add(BungaAsliBaru);
                BungaAsliBaru.tambahbunga();
                break;
                
            case 2 :
                System.out.print("Masukkan Kode Bunga: ");
                int addKodeBunga1 = Integer.parseInt(br.readLine());
                System.out.print("Masukkan Nama Bunga: ");
                String addNamaBunga1 = br.readLine();
                System.out.print("Masukkan Jumlah Bunga: ");
                int addJumlahBunga1 = Integer.parseInt(br.readLine());
                System.out.print("Masukkan Harga Bunga: ");
                int addHargaBunga1 = Integer.parseInt(br.readLine());
                BungaArtificial BungaArtificialBaru = new BungaArtificial (addNamaBunga1, addJumlahBunga1, addHargaBunga1, addKodeBunga1);
                bungaArtificial.add (BungaArtificialBaru);
                BungaArtificialBaru.tambahbunga();
                break;
                
            default :
                System.out.println("Kategori Bunga Tidak Tersedia");
                break;
        }
    }
        public static void ubah()throws IOException {
        System.out.println("-------DATA BUNGA TOKO SUNFLORIST -------");
        System.out.println("Kategori Bunga Toko Sunflorist");
        System.out.println("1. Bunga Asli ");
        System.out.println("2. Bunga Artificial ");
        System.out.print("Pilih Kategori Bunga :  ");
        int kategori = Integer.parseInt(br.readLine());
        switch (kategori){
            case 1 -> {
                System.out.println("-------DATA BUNGA TOKO SUNFLORIST -------");
                System.out.print("Pilih Data Ke- ");
                int indeks = Integer.parseInt(br.readLine());
                indeks--;
                if (indeks <= bungaAsli.size() || indeks > 0){
                    System.out.println("-------DATA BUNGA TOKO SUNFLORIST -------");
                    System.out.print("Masukkan Kode Bunga Yang Baru : ");
                    int addKodeBunga = Integer.parseInt(br.readLine());
                    System.out.print("Masukkan Nama Bunga Yang Baru : ");
                    String addNamaBunga = br.readLine();
                    System.out.print("Masukkan Jumlah Bunga Yang Baru : ");
                    int addJumlahBunga = Integer.parseInt(br.readLine());
                    System.out.print("Masukkan Harga Bunga Yang Baru : ");
                    int addHargaBunga = Integer.parseInt(br.readLine());
                    System.out.print("Masukkan Ketahanan Bunga Yang Baru : ");
                    String addKetahananBunga = br.readLine();
                    
                    bungaAsli.get(indeks).setKode(addKodeBunga);
                    bungaAsli.get(indeks).setNama (addNamaBunga);
                    bungaAsli.get(indeks).setJumlah (addJumlahBunga);
                    bungaAsli.get(indeks).setHarga (addHargaBunga);
                    bungaAsli.get(indeks).setKetahanan (addKetahananBunga);
                    System.out.println("Data Berhasil Diubah");
                    }else {
                        System.out.println("Data Tidak ada");}
                            break;
                }
            case 2 -> {
                System.out.println("-------DATA BUNGA TOKO SUNFLORIST -------");
                System.out.print("Pilih Data Ke- ");
                int indeks1 = Integer.parseInt(br.readLine());
                indeks1--;
                if (indeks1 <= bungaArtificial.size() || indeks1 > 0){
                    System.out.println("-------DATA BUNGA TOKO SUNFLORIST -------");
                    System.out.print("Masukkan Kode Bunga Yang Baru : ");
                    int addKodeBunga = Integer.parseInt(br.readLine());
                    System.out.print("Masukkan Nama Bunga Yang Baru : ");
                    String addNamaBunga = br.readLine();
                    System.out.print("Masukkan Jumlah Bunga Yang Baru : ");
                    int addJumlahBunga = Integer.parseInt(br.readLine());
                    System.out.print("Masukkan Harga Bunga Yang Baru : ");
                    int addHargaBunga = Integer.parseInt(br.readLine());
                    
                    bungaArtificial.get(indeks1).setKode(addKodeBunga);
                    bungaArtificial.get(indeks1).setNama (addNamaBunga);
                    bungaArtificial.get(indeks1).setJumlah (addJumlahBunga);
                    bungaArtificial.get(indeks1).setHarga (addHargaBunga);
                    System.out.println("Data Berhasil Diubah");
                    }else {
                        System.out.println("Data Tidak ada");}
                            break;
                }
            }
        
        }
        public static void tampil() throws IOException{
                System.out.println("-------DATA BUNGA TOKO SUNFLORIST -------");
                System.out.println("Kategori Bunga Toko Sunflorist");
                System.out.println("1. Bunga Asli ");
                System.out.println("2. Bunga Artificial ");
                System.out.print("Pilih Kategori Bunga :  ");
                int kategori = Integer.parseInt(br.readLine());
                switch (kategori){
                    case 1 -> {
                        for (int i = 0; i < bungaAsli.size(); i++){
                            System.out.println("DATA KE- " + (i+1));
                            System.out.println("Kode Bunga      :" + bungaAsli.get(i).getKode());
                            System.out.println("Nama Bunga      :" + bungaAsli.get(i).getNama());
                            System.out.println("Jumlah Bunga    :" + bungaAsli.get(i).getJumlah());
                            System.out.println("Harga Bunga     :" + bungaAsli.get(i).getHarga());
                            System.out.println("Ketahanan Bunga :" + bungaAsli.get(i).getKetahanan());
                        }
                        break;
                    }
                    case 2 -> {
                        for (int i = 0; i < bungaArtificial.size(); i++){
                            System.out.println("DATA KE- " + (i+1));
                            System.out.println("Kode Bunga      :" + bungaArtificial.get(i).getKode());
                            System.out.println("Nama Bunga      :" + bungaArtificial.get(i).getNama());
                            System.out.println("Jumlah Bunga    :" + bungaArtificial.get(i).getJumlah());
                            System.out.println("Harga Bunga     :" + bungaArtificial.get(i).getHarga());
                        }
                        break;  
                    }
                    default -> System.out.println("Pilihan Tidak Ada");
                        
                }   
            }
        public static void hapus() throws IOException{
                System.out.println("-------DATA BUNGA TOKO SUNFLORIST -------");
                System.out.println("Kategori Bunga Toko Sunflorist");
                System.out.println("1. Bunga Asli ");
                System.out.println("2. Bunga Artificial ");
                System.out.print("Pilih Kategori Bunga :  ");
                int kategori = Integer.parseInt(br.readLine());
                switch (kategori){
                    case 1 ->{
                        System.out.println("-------DATA BUNGA TOKO SUNFLORIST -------");
                        System.out.print("Pilih Data Yang Dihapus: ");
                        int indeks = Integer.parseInt(br.readLine());
                        if (indeks <= bungaAsli.size() || indeks > 0){
                            bungaAsli.remove(indeks-1);
                            System.out.println("Data Berhasil Di Hapus");
                        }else{
                            System.out.println("Data Tidak Ada");
                        }
                    }
                    case 2 -> {
                        System.out.println("-------DATA BUNGA TOKO SUNFLORIST -------");
                        System.out.print("Pilih Data Yang Dihapus: ");
                        int indeks1 = Integer.parseInt(br.readLine());
                        
                        if (indeks1 <= bungaArtificial.size() || indeks1 > 0){
                            bungaArtificial.remove(indeks1-1);
                            System.out.println("Data Berhasil Di Hapus");
                        }else{
                            System.out.println("Data Tidak Ada");
                        }
                        
                    }
                }
                
            }
}
    
