public class Saldo extends Pembelian
{
    public Saldo( int userAccountNumber, DatabaseAkun database )
    {
        super( userAccountNumber, database );
    }
   
    @Override 
    public void execute()
    {
        DatabaseAkun bankDatabase = getDatabase();
        double saldo = bankDatabase.getSaldo(getNomorRek());
       
        System.out.println("Saldo anda : " + saldo);
    }
}