public abstract class Pembelian{
    
    private int nomorRek;
    private DatabaseAkun database;
    
    public Pembelian(int nomorRek, DatabaseAkun database){
        this.nomorRek = nomorRek;
        this.database = database;
    }
    
    public int getNomorRek(){
        return this.nomorRek;
    }
    
    public DatabaseAkun getDatabase(){
        return this.database;
    }
    
    abstract public void execute();
}