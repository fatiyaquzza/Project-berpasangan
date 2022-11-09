/**
 * class BodyCare extend PersonalCare (konsep inherintance)
 * artinya class BodyCare akan memiliki sifat-sifat dari class induknya
 *
 * @author Tasya Nadila, Fatiya Quzza
 * @version 09/11/2022
 */
public class BodyCare extends PersonalCare {
    
    private double totalHargaBC = 0;

    /**
     * Constructor for objects of BodyCare tanpa parameter
     */
    public BodyCare(){

    }

    /**
     * Constructor for objects of BodyCare dengan parameter
     * berupa harga dan nama
     * 
     */
    public BodyCare(double harga, String nama){
        super(harga, nama);
    }

    /**
     * Method getTotalHarga untuk mengembalikan TotalHarga sementara
     * 
     * 
     * @return sementara
     */
    @Override
    public double getTotalHarga(double harga, int jumlah){
        double sementara = harga * jumlah;
        setTotalHargaBC(sementara);
        return sementara;
    }

    /**
     * Method setTotalHargaBC untuk mengatur/mengubah TotalHargaBC
     * 
     * @param totalHargaBC sementara
     */
    public void setTotalHargaBC(double sementara){
        this.totalHargaBC = sementara ;
    }

    /**
     * Method getTotalHargaBC untuk mengembalikan TotalHargaBC
     * 
     * @return totalHargaBC
     */
    public double getTotalHargaBC(){
        return this.totalHargaBC;
    }

    /**
     * Method getTotalBC untuk mengembalikan TotalBC
     * 
     * @return jumlah
     */
    public int getTotalBC(){
        return super.getJumlah();
    }

    /**
     * Method untuk menentukan hargaBodyCare berdasarkan
     * pilihan produk pembeli
     * 
     * @param p
     * @return harga
     */
    @Override
    public double hargaProduk(int p){
        double harga = 0;
        double pilih[] = {0, 28000, 17000, 29000, 31000, 38000};

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
