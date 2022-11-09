
/**
 * Abstract class PersonalCare 
 *
 * @author Tasya Nadila, Fatiya Quzza
 * @version 09/11/2022
 */
public abstract class PersonalCare
{
    private double harga;
    private int jumlah;
    private String nama;

    /**
     * Constructor for Abstract class PersonalCare tanpa parameter
     */
    public PersonalCare(){

    }

     /**
     * Constructor for Abstract Class Personalcare dengan parameter
     */
    public PersonalCare(double harga,  String nama){
        this.harga = harga;
        this.nama = nama;

    }
  
    /**
     * Method getHarga untuk mengembalikan Harga
     * 
     * @return Harga
     */
    public double getHarga() {
        return harga;
    }

    /**
     * Method untuk mengatur/mengubah harga
     * @param harga
     */
    public void setHarga(double harga) {
        this.harga = harga;
    }

    /**
     * Method getJumlah untuk mengembalikan Jumlah
     * 
     * @return Jumlah
     */
    public int getJumlah() {
        return jumlah;
    }

    /**
     * Method setJumlah untuk mengatur/mengubah jumlah
     * @param jumlah
     */
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

   /**
    * Method getNama untuk mengembalikan nama
    * @return nama
    */
    public String getNama() {
        return nama;
    }

    /**
     * Method setNama untuk mengatur/mengubah nama
     * @param nama
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * Method abstract getTotalHarga yang nantinya akan di override di tiap subclassnya
     * Method ini akan mengembalikan totalHarga dari masing-masing subclassnya
     * @param harga
     * @param jumlah
     * @return
     */
    abstract double getTotalHarga(double harga, int jumlah);
    
}
