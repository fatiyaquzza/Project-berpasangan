/**
 * class Main
 * didalam class ini terdapat public static void main(String[] args) untuk menjalankan program agar outputnya 
 * dapat dilihat oleh user
 *
 * @author Tasya Nadila, Fatiya Quzza
 * @version 09/11/2022
 */
import java.util.Scanner;

public class Main {
    
    /**
     * Method void Menu yang akan menampilkan daftar
     * pilihan dari jenis personal care yang tersedia
     */
    public void Menu(){
        System.out.println("\n\n===========Menu Utama===========");
        System.out.println("\nDaftar Pilihan:");
        System.out.println("1. Skincare");
        System.out.println("2. Haircare");
        System.out.println("3. Bodycare");
        System.out.println("4. Batalkan Transaksi");
        System.out.println("5. Selesai");
    }
    
    public static void main(String[] args) {
        Skincare skincare = new Skincare();
        HairCare haircare = new HairCare();
        BodyCare bodycare = new BodyCare();
    
        Pembeli person;
        Main m = new Main();
        Scanner inp = new Scanner(System.in);
        int pilih;

        System.out.println("Selamat Datang di toko penjualan personalcare");
        System.out.println("Silahkan pilih barang-barang yang ingin dibeli");

        System.out.print("Nama anda: ");
        String nama = inp.nextLine();

        boolean ulang = true;
        do{
        m.Menu();
        System.out.println("Masukkan pilihan Anda: ");
        pilih = inp.nextInt();
        if(pilih == 1){
            System.out.println("\n\nDaftar Skincare:");
            System.out.println("1. Sunscreen (Rp.40000,00)");
            System.out.println("2. Moisturizer (Rp.23000,00)");
            System.out.println("3. Serum (Rp.40000,00)");
            System.out.println("4. Toner (Rp.35000,00)");
            System.out.println("5. Face Wash(Rp.15000,00)");

            System.out.println("Pilihan Anda: ");
            int sc = inp.nextInt();
            if(sc > 0 && sc < 6){
                System.out.println("Jumlah yang diinginkan :");
                int jumlah = inp.nextInt();
                skincare.setJumlah(jumlah);
                skincare.setHarga(skincare.hargaSkincare(sc));
                skincare.getTotalHarga(skincare.getHarga(), jumlah);
            } else{
                System.out.println("Pilihan Anda tidak tersedia");
                System.out.println("Anda akan kembali ke menu utama");
            }
            

        } else if(pilih == 2){
            System.out.println("\n\nDaftar Haircare:");
            System.out.println("1. Shampoo (Rp.21000,00)");
            System.out.println("2. Hair Tonic (Rp.56000,00)");
            System.out.println("3. Hair Vitamin (Rp.12000,00)");
            System.out.println("4. Hair Mask (Rp.37000,00)");
            System.out.println("5. Hair Mist(Rp.34000,00)");

            System.out.println("Pilihan Anda: ");
            int hc = inp.nextInt();

            if(hc > 0 && hc < 6){
                System.out.println("Jumlah yang diinginkan :");
                int jumlah = inp.nextInt();
                haircare.setJumlah(jumlah);
                haircare.setHarga(haircare.hargaProduk(hc));
                haircare.getTotalHarga(haircare.getHarga(), jumlah);
            }else{
                System.out.println("Pilihan Anda tidak tersedia");
                System.out.println("Anda akan kembali ke menu utama");
            }
            

        } else if(pilih == 3){
            System.out.println("\n\nDaftar BodyCare:");
            System.out.println("1. Body Lotion (Rp.28000,00)");
            System.out.println("2. Body wash (Rp.17000,00)");
            System.out.println("3. Body Scrub (Rp.29000,00)");
            System.out.println("4. Body Serum (Rp.31000,00)");
            System.out.println("5. Parfum (Rp.38000,00)");

            System.out.println("Pilihan Anda: ");
            int bc = inp.nextInt();

            if(bc > 0 && bc < 6){
                System.out.println("Jumlah yang diinginkan :");
                int jumlah = inp.nextInt();
                bodycare.setJumlah(jumlah);
                bodycare.setHarga(bodycare.hargaProduk(bc));
                bodycare.getTotalHarga(bodycare.getHarga(), jumlah);
            }else{
                System.out.println("Pilihan Anda tidak tersedia");
                System.out.println("Anda akan kembali ke menu utama");
            }
 

        } else if (pilih == 4){
            System.out.println("terimakasih");
            ulang = false;
            break;
        } else if (pilih == 5){
            System.out.println("Anda telah selesai berbelanja");
            int tampung_barang = skincare.getTotalSC() + haircare.getTotalHC() + bodycare.getTotalBC() ;

            double tampung_harga = skincare.getTotalHargaSC() + haircare.getTotalHargaHC() + bodycare.getTotalHargaBC();

            person = new Pembeli(nama, tampung_harga, tampung_barang);
            person.invoice();

            System.out.print("Uang Anda: ");
            double uang = inp.nextDouble();
            // double hasil;
            if(tampung_harga > uang){
                System.out.println("\nMaaf saldo anda tidak cukup, pembelian akan dibatalkan");
            } else if(tampung_harga == uang){
                System.out.println("\nTerimakasih telah berbelanja");
            } else if(tampung_harga < uang){
                double hasil;
                hasil = uang - tampung_harga;
                System.out.println("\nUang kembalian anda: " + hasil);
                System.out.println("\nTerimakasih telah berbelanja");
            }

            break;
        }
        else{
            System.out.println("Pilihan tidak tersedia");
        }

        }while(ulang);

    }
}
