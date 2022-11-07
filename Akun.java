public class Akun{
    
    private int nomorRek;
    private int pass;
    private double saldo;

    public Akun(int nomorRek, int pass, double saldo){
        this.nomorRek = nomorRek;
        this.pass = pass;
        this.saldo = saldo;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNomorRek(){ 
        return this.nomorRek;
    }

    public boolean cek(int passInput){
        if (passInput == this.pass){
            return true;
        } else{
            return false;
        }
    }
    
    public void belanjaan(double harga){
        this.saldo -= harga;
    }
    
        
}