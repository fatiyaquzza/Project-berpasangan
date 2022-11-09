/**
 * class Skincare extend PersonalCare (konsep inherintance)
 * artinya class Skincare akan memiliki sifat-sifat dari class induknya
 *
 * @author Tasya Nadila, Fatiya Quzza
 * @version 09/11/2022
 */
public class Skincare extends PersonalCare {
    
    private int banyakSC[] = {0, 10, 10, 10, 10, 10};
    private double totalHargaSC = 0;
    
    /**
    * Constructor for objects of class Skincare tanpa parameter
    */
    public Skincare(){

    }

    /**
     * Constructor for objects of class Skincare dengan parameter
     * harga dan nama
     * 
     */
    public Skincare(double harga, String nama){

    }

    /**
     * Method Acessor/ method getTotalHarga untuk
     * mengembalikan TotalHarga sementara
     * 
     * @return sementara
     */
    public double getTotalHarga(double harga, int jumlah){
        double sementara = harga * jumlah;
        setTotalHargaSC(sementara);
        return sementara;
    }
    /**
     * Method setTotalHargaSC untuk mengatur/mengubah TotalHargaSC
     * 
     * @param totalHargaSC sementara
     */
    public void setTotalHargaSC(double sementara){
        this.totalHargaSC = sementara ;
    }

    /**
     * Method getTotalHargaSC untuk mengembalikan TotalHargaSC 
     * 
     * @return totalHargaSC
     */
    public double getTotalHargaSC(){
        return this.totalHargaSC;
    }

    /**
     * method getTotalSC untuk mengembalikan 
     * total/jumlah SC
     * 
     * @return jumlah
     */
    public int getTotalSC(){
        return super.getJumlah();
    }

    /*public void barangSC(int pilihan){
        banyakSC[pilihan] -= super.getJumlah();
    }
    
    public boolean stokSC(int pilihan){
        if (banyakSC[pilihan] > 0){
            return true;
        } else{
            return false;
        }
    }*/

    public int hargaSkincare(int p){
        int harga = 0;
        int pilih[] = {0, 40000, 23000, 40000, 35000, 15000};

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
