
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
    private int stokBarang;

    /**
     * Constructor for objects of Abstract class PersonalCare tanpa parameter
     */
    public PersonalCare(){

    }

     /**
     * Constructor for objects of Abstract Class Personalcare dengan parameter
     */
    public PersonalCare(double harga,  String nama, int stokBarang){
        this.harga = harga;
        this.nama = nama;
        this.stokBarang = stokBarang;
    }
  
    /**
     * Method getHarga untuk mengembalikan Harga
     * 
     * @return Harga
     */
    public double getHarga() {
        return harga;
    }

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

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

   
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getStokBarang() {
        return stokBarang;
    }

    public void setStokBarang(int stokBarang) {
        this.stokBarang = stokBarang;
    }

    abstract double getTotalHarga(double harga, int jumlah);
    
}
