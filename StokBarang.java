public class StokBarang{
    
    private int banyak[] = {0, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    
    public void barangBelanjaan(int pilihan){
        banyak[pilihan] -= 1;
    }
    
    public boolean stokCukup(int pilihan){
        if (banyak[pilihan] > 0){
            return true;
        } else{
            return false;
        }
    }
}