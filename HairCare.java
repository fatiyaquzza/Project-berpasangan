/**
 * class HairCare extend PersonalCare (konsep inherintance)
 * artinya class HairCare akan memiliki sifat-sifat dari class induknya
 *
 * @author Tasya Nadila, Fatiya Quzza
 * @version 09/11/2022
 */

public class HairCare extends PersonalCare {
    
    private int banyakHC[] = {0, 10, 10, 10, 10, 10};
    private double totalHargaHC = 0;

    /**
     * Constructor for objects of class HairCare tanpa parameter
     */
    public HairCare(){

    }

    /**
     * Constructor for objects of class HairCare dengan parameter
     * harga, nama, dan stokBarang
     * 
     */
    public HairCare(double harga, String nama){
        
    }

    /**
     * Method Acessor/ method getTotalHarga untuk
     * mengembalikan TotalHarga sementara
     * 
     * @return sementara
     */
    public double getTotalHarga(double harga, int jumlah){
        double sementara = harga * jumlah;
        setTotalHargaHC(sementara);
        return sementara;
    }

     /**
     * Method setTotalHargaHC untuk mengatur/mengubah TotalHargaHC
     * 
     * @param totalHargaHC sementara
     */
    public void setTotalHargaHC(double sementara){
        this.totalHargaHC = sementara ;
    }

    /**
     * method getTotalHargaHC untuk mengembalikan 
     * totalHarga haircare
     * 
     * @return totalHargaHC
     */
    public double getTotalHargaHC(){
        return this.totalHargaHC;
    }

    /**
     * method acessor/ getTotalHC untuk 
     * mengembalikan TotalHC
     * 
     * 
     * @return jumlah
     */
    public int getTotalHC(){
        return super.getJumlah();
    }


    public void barangHC(int pilihan){
        banyakHC[pilihan] -= super.getJumlah();
    }
    
    public boolean stokHC(int pilihan){
        if (banyakHC[pilihan] > 0){
            return true;
        } else{
            return false;
        }
    }

    public int hargaHairCare(int p){
        int harga = 0;
        int pilih[] = {0, 21000, 56000, 12000, 37000, 34000};

        switch(p){
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                harga = pilih[p];
                break;
            default :
                System.out.println("\nInput Salah");
                System.out.println("Silahkan Coba lagi");
        }
        return harga;
    }

}

