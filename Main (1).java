package praktikum4;

import java.util.Scanner;

public class Main {
     
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("====== Selamat Datang Di UBFood ======\n");
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000));

        DataMerchant.tampilData();
        System.out.println();
        System.out.println("==== Pilih Menu Tindakan ====");
        System.out.println("1. Tambah Merchant");
        System.out.println("2. Cari Merchant");
        System.out.println("3. Update Merchant\n");
        System.out.print("Pilih : ");
        int pilih = in.nextInt();
        
        switch (pilih){
            
        case 1 : 
        
        in.nextLine();
        System.out.println();
        System.out.println("## Tambahkan Data Merchant Melalui Input ##");
        System.out.println("---------------------------------------------");
        System.out.print("Input Nama Merchant\t : ");
        String namaMerchant = in.nextLine();
        System.out.print("Input Nama Produk\t : ");
        String namaProduk = in.nextLine();
        System.out.print("Input Harga Makanan\t : ");
        double hargaMakanan = in.nextDouble();
        System.out.println("---------------------------------------------");
        
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant(namaMerchant, namaProduk, hargaMakanan));
        System.out.println();
        DataMerchant.tampilData();
        break;
        
        case 2 : 
            System.out.println("Apakah Anda Mau Mencari Merchant ? (y/t)");
            String nm = in.nextLine();
            if(nm.equalsIgnoreCase("t")){
            }else{
                System.out.print("Cari merchant   : ");
                String nama = in.nextLine();
                System.out.println();
                if(DataMerchant.cariMerchant(nama) == null){
                    System.out.println("Merchant tidak diketahui");
                }else{
                    DataMerchant.tampilMerchant(DataMerchant.cariMerchant(nama));
                }
            }
            break;
            
        case 3:
        System.out.println("Apakah Anda Mau Update Merchant ? (y/t)");
        in.nextLine();
        String jawaban = in.nextLine();
            if(jawaban.equalsIgnoreCase("t")){
                DataMerchant.tampilData();
            }else{
                System.out.print("Cari merchant   : ");
                String nama = in.nextLine();
                if(DataMerchant.cariMerchant(nama) == null){
                    System.out.println("Merchant tidak diketahui");
                }else{
                    DataMerchant.updateMerchant(DataMerchant.cariMerchant(nama));
                }
            }
        break;
        default:
        }
    }

}
