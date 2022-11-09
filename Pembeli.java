public class Pembeli {
    
    private String nama;
    private double totalBayar;
    private int totalBarang;

    public Pembeli(String nama, double totalBayar, int totalBarang) {
        this.nama = nama;
        this.totalBayar = totalBayar;
        this.totalBarang = totalBarang;
    }

    public Pembeli(){
        
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getTotalBayar() {
        return totalBayar;
    }

    public void setTotalBayar(double totalBayar) {
        this.totalBayar = totalBayar;
    }

    public int getTotalBarang() {
        return totalBarang;
    }

    public void setTotalBarang(int totalBarang) {
        this.totalBarang = totalBarang;
    }

    public void invoice(){
        System.out.println("================================================");
        System.out.println("Bill atas nama: " + getNama());
        System.out.println("Total Harga: Rp." + getTotalBayar());
        System.out.println("Jumlah Barang: " + getTotalBarang());
        System.out.println("================================================");
    }
}
