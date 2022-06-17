package praktikum4;

import java.util.Scanner;

public class DataMerchant {
    static Scanner in = new Scanner(System.in);
    static Merchant[] merc = new Merchant[0];

    public static Merchant[] tambahMerchant(Merchant merchant){
       Merchant tambahMerc[]= new Merchant[DataMerchant.merc.length+1];
        for (int i = 0; i < DataMerchant.merc.length; i++){
            tambahMerc[i]=DataMerchant.merc[i];
        }
        tambahMerc[DataMerchant.merc.length]= merchant;
        return tambahMerc;
        
    }

    public static void tampilData(){
        for (Merchant mch1 : DataMerchant.merc){
            
            System.out.println("=== Tampilan Data Merchant UBFood ===");
            System.out.println("Nama Merchant   : " + mch1.getNamaMerchant());
            System.out.println("Nama Produk     : " + mch1.getNamaProduk());
            System.out.println("Harga           : " + (int)mch1.getHargaMakanan());
        }
    }
    
    public static Merchant cariMerchant (String nama){
        int indexMerc = 0;
        for (int i = 0; i < DataMerchant.merc.length; i++){
            if (DataMerchant.merc[i].getNamaMerchant() == nama){
                indexMerc = i;
                break;
            }
        }
        return merc[indexMerc];
    }
    
    public static void tampilMerchant(Merchant merchant) {
        System.out.println("=== Tampilan Data Merchant UBFOOD ===");
        System.out.println("Nama Merchant   : " + merchant.getNamaMerchant());
        System.out.println("Nama Produk     : " + merchant.getNamaProduk());
        System.out.println("Harga           : " + (int) merchant.getHargaMakanan());
    }
    
    public static void updateMerchant(Merchant merchant) {
        
        in.nextLine();
        System.out.println("## Update Merchant ##");
        System.out.println("---------------------------------------------");
        System.out.print("Nama Merchant Baru\t : ");
        String namaMerchantBaru = in.nextLine();
        System.out.print("Nama Produk Baru\t : ");
        String namaProdukBaru = in.nextLine();
        System.out.print("Harga Makanan Baru\t : ");
        double hargaMakananBaru = in.nextDouble();
        System.out.println("---------------------------------------------");
        System.out.println();
        System.out.println("=== Data Hasil Update ===");
        DataMerchant.tampilData();
        
         
    }
}
