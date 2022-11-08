/**
 * class BodyCare extend PersonalCare (konsep inherintance)
 * artinya class BodyCare akan memiliki sifat-sifat dari class induknya
 *
 * @author Tasya Nadila, Fatiya Quzza
 * @version 09/11/2022
 */
public class BodyCare extends PersonalCare {
    
    private int banyakBC[] = {0, 10, 10, 10, 10, 10};
    private double totalHargaBC = 0;

    /**
     * Constructor for objects of BodyCare tanpa parameter
     */
    public BodyCare(){

    }

    /**
     * Constructor for objects of BodyCare dengan parameter
     * berupa harga, nama, dan stokBarang
     * 
     */
    public BodyCare(double harga, String nama, int stokBarang){
        super(harga, nama, stokBarang);
    }

    public double getTotalHarga(double harga, int jumlah){
        double sementara = harga * jumlah;
        setTotalHargaBC(sementara);
        return sementara;
    }

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

    public int getTotalBC(){
        return super.getJumlah();
    }

    public void barangBC(int pilihan){
        banyakBC[pilihan] -= super.getJumlah();
    }
    
    public boolean stokBC(int pilihan){
        if (banyakBC[pilihan] > 0){
            return true;
        } else{
            return false;
        }
    }

    public int hargaBodyCare(int p){
        int harga = 0;
        int pilih[] = {0, 28000, 17000, 29000, 31000, 38000};

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
