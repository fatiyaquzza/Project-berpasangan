/**
 * class Pembeli
 *
 * @author Tasya Nadila, Fatiya Quzza
 * @version 09/11/2022
 */
public class Pembeli {
    
    private String nama;
    private double totalBayar;
    private int totalBarang;

    /**
     * Method constructor dari class Pembeli dengan parameter:
     * @param nama
     * @param totalBayar
     * @param totalBarang
     */
    public Pembeli(String nama, double totalBayar, int totalBarang) {
        this.nama = nama;
        this.totalBayar = totalBayar;
        this.totalBarang = totalBarang;
    }

    /**
     * Method constructor dari class Pembeli tanpa parameter
     */
    public Pembeli(){
        
    }

    /**
     * Method untuk mengembalikan nama
     * @return nama yang merupakan nama dari pembeli
     */
    public String getNama() {
        return nama;
    }

    /**
     * Method untuk mengatur/mengubah nama
     * @param nama
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * Method untuk mengembalikan totalBayar 
     * @return totalBayar dimana adalah total harga yang harus
     *          dibayar oleh pembeli
     */
    public double getTotalBayar() {
        return totalBayar;
    }

    /**
     * Method untuk mengatur/mengubah totalBayar
     * @param totalBayar
     */
    public void setTotalBayar(double totalBayar) {
        this.totalBayar = totalBayar;
    }

    /**
     * Method untuk mengembalikan totalBarang
     * @return totalBarang yang merupakan jumlah dari
     *          barang yang dibeli oleh pembeli
     */
    public int getTotalBarang() {
        return totalBarang;
    }

    /**
     * Method untuk mengatur/mengubah totalBarang
     * @param totalBarang
     */
    public void setTotalBarang(int totalBarang) {
        this.totalBarang = totalBarang;
    }

    /**
     * Method untuk tampilan pada bill
     * yang akan menampilkan totalBayar dan totalBarang
     */
    public void invoice(){
        System.out.println("Total Harga: Rp." + getTotalBayar());
        System.out.println("Jumlah Barang: " + getTotalBarang());
    }
}
